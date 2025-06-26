package com.example.SpringBoot_DI.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("chip64")
@Primary
public class Chip64 implements IChip{

    public Chip64() {
        System.out.println("Chip64:Constructor");
    }

    @Override
    public boolean process() {
        System.out.println("Chip64bit processing started...");
        return true;
    }
}
