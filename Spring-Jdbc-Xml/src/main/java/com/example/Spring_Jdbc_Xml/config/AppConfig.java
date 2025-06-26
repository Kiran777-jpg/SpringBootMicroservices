package com.example.Spring_Jdbc_Xml.config;

import com.example.Spring_Jdbc_Xml.security.AppSecurity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    public AppConfig() {
        System.out.println("AppConfig:Constructor");
    }

    @Bean
    public AppSecurity security() {
        System.out.println("Security bean has called");
        AppSecurity security = new AppSecurity();
        return security;
    }
}
