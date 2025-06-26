package com.example.SpringBoot_DI.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Robot {

//    @Autowired
//    @Qualifier("chip64")
    private IChip chip;

//    public Robot() {
//        System.out.println("Robot:Constructor");
//    }

//    @Autowired
    public Robot(IChip chip) {
        this.chip = chip;
    }

    public void processWork() {
        boolean status = chip.process();
        if (status) {
            System.out.println("Robot is working...");
        } else {
            System.out.println("Robot is having fault...");
        }
    }
}
