package rzd.pktbcdt.aszp.soap.ws.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import rzd.pktbcdt.aszp.soap.ws.MyBasicAuthenticationEntryPoint;

@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(securedEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

 /*   @Autowired
    private MyBasicAuthenticationEntryPoint authenticationEntryPoint;*/

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // включаем защиту от CSRF атак
        http.csrf().disable();
/*
        http.csrf()
                .disable()
                // указываем правила запросов
                // по которым будет определятся доступ к ресурсам и остальным данным
                .authorizeRequests()
                .antMatchers("/resources/**", "/**","/home").permitAll()
                .anyRequest().permitAll()
                .and();
*/

        http

/*
                .csrf().disable()
                .authorizeRequests().anyRequest().authenticated()
                .and()
                .httpBasic();*/
                .authorizeRequests()
                .antMatchers("/", "/home").permitAll()
                .anyRequest().authenticated()
//                .hasAuthority("USER")
                .and()
                .httpBasic()
/*
By default, the BasicAuthenticationEntryPoint provisioned by Spring Security returns a full page for a 401 Unauthorized response back to the client.
*/

//                .authenticationEntryPoint(authenticationEntryPoint)

        ;


/*
        http
                .addFilterAfter(new CustomFilter(),
                        BasicAuthenticationFilter.class)
*/
        ;


    }

    // Указываем Spring контейнеру, что надо инициализировать ShaPasswordEncoder
    // Это можно вынести в WebAppConfig, но для понимаемости оставил тут
/*
    @Bean
    public ShaPasswordEncoder getShaPasswordEncoder(){
        return new ShaPasswordEncoder();
    }
*/
/*    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }*/
    @Bean
    @Override
    public UserDetailsService userDetailsService() {
  /*      UserDetails user =
                User
                        .builder()
                        .username("skim")
                        .password(passwordEncoder().encode("skim"))
                        .roles("USER")
                        .build();
  */      UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("skim")
                        .password("skim")
                        .roles("USER")
                        .build();

        return new InMemoryUserDetailsManager(user);
    }


}
