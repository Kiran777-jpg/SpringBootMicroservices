package services;

import interfaces.Payment;

public class CreditCardPayment implements Payment {

    @Override
    public boolean payBill() {
        System.out.println("Paying bill through credit card");
        return true;
    }
}
