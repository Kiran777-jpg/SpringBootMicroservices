package services;

import interfaces.Payment;

public class DebitCardPayment implements Payment {

    @Override
    public boolean payBill() {
        System.out.println("Paying bill through debit card");
        return true;
    }
}
