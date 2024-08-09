package com.jwt.security.jwtsecuritydemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class InMemroySecurityConfig {

    @Bean
    public UserDetailsService userDetailsService(){
       UserDetails userDetails= User.builder()
                .username("test")
               .password(passwordEncoder().encode("test@12345"))
               // .password("test@12345")
                .roles("ADMIN")
                .build();
        UserDetails userDetails1= User.builder()
                .username("adminTest")
                .password(passwordEncoder().encode("adminTest@12345"))
//                .password("adminTest@12345")
                .roles("ADMIN")
                .build();

       return new InMemoryUserDetailsManager(userDetails,userDetails1);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();

    }
}
