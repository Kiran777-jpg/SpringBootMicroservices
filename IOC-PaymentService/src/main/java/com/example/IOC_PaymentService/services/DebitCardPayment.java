package com.example.IOC_PaymentService.services;

import com.example.IOC_PaymentService.interfaces.Payment;

public class DebitCardPayment implements Payment {
    @Override
    public boolean payBill() {
        System.out.println("Paying bill through debit card");
        return true;
    }
}
