package com.example.Spring_Jdbc_Xml.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component // Component should mention inorder to call the run method
public class MyAppRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("Application Runner called");
    }
}
