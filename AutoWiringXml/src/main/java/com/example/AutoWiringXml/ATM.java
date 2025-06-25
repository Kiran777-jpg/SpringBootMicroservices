package com.example.AutoWiringXml;

public class ATM {

    private IPrinter printer;

    public ATM() {
        System.out.println("ATM:Constructor");
    }

    public ATM(IPrinter printer) {
        this.printer=printer;
    }

    public void print() {
        printer.print();
    }
}
