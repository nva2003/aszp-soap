package rzd.pktbcdt.aszp.soap.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Properties;

/**
 * User: vnikishin
 * Date: 23.11.2020
 * Time: 15:01
 */
@Controller
public class HomeController implements Serializable {


    /*--------------------------------------------
    |             C O N S T A N T S             |
    ============================================*/

    private static final long serialVersionUID = 1L;
/*
     используем статический logger, чтобы избежать вопросов сериализации
     static to optimize serialization
     protect- available to subclasses
        
*/
/*
for slf4j
private static final Logger logger = LoggerFactory.getLogger( SimpleController.class );
*/

    /*--------------------------------------------
    |    I N S T A N C E   V A R I A B L E S    |
    ============================================*/
    @Value("${spring.application.name}")
    String appName;

    String version = "UNDEFINED";

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    /*--------------------------------------------
    |         C O N S T R U C T O R S           |
    ============================================*/


    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/
    @GetMapping("/aszp-soap")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("META-INF/MANIFEST.MF");
//        prop.load(getServletContext().getResourceAsStream("/META-INF/MANIFEST.MF"));
        Properties prop = new Properties();
        try {
            prop.load( is );
            version = prop.getProperty("Implementation-Build");
            if (version ==null) {
                version = this.getClass().getPackage().getImplementationVersion();
            }
        } catch (IOException ex) {
            version = this.getClass().getPackage().getImplementationVersion();
            logger.error(ex.getLocalizedMessage());
        }

        model.addAttribute("version", version);
        return "home";
    }
}
