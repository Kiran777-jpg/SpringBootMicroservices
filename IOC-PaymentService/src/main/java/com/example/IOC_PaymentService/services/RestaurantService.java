package com.example.IOC_PaymentService.services;

import com.example.IOC_PaymentService.interfaces.Payment;

public class RestaurantService {
    private Payment payment;
    public RestaurantService() {}

    public RestaurantService(Payment payment) {
        this.payment = payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void startBIll() {
        boolean status = payment.payBill();
        if(status) {
            System.out.println("Payment Successful");
        }
        else {
            System.out.println("Payment Failed");
        }
    }
}
