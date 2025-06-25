package com.example.AutoWiringXml;

public class HpPrinter implements IPrinter{

    public HpPrinter() {
        System.out.println("HpPrinter:Constructor");
    }

    @Override
    public void print() {
        System.out.println("HpPrinter");
    }
}
