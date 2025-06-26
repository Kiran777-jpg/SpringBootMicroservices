package com.example.Spring_Jdbc_Xml.security;

import org.springframework.stereotype.Component;

@Component  // It has component lets see it call's when application starts
public class EmailSecurity {

    public EmailSecurity() {
        System.out.println("EmailSecurity::Constructor");
    }
}
