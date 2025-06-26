package com.example.SpringBoot_DI.beans;

import org.springframework.stereotype.Component;

@Component("chip32")
public class Chip32 implements IChip{

    public Chip32() {
        System.out.println("Chip32:Constructor");
    }

    @Override
    public boolean process() {
        System.out.println("Chip32bit processing started...");
        return true;
    }
}
