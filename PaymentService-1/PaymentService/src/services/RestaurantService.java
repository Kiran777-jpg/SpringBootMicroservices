package services;

import interfaces.Payment;

public class RestaurantService {
//    DebitCardPayment payment = new DebitCardPayment();
//    CreditCardPayment payment = new CreditCardPayment();

    Payment payment;
    public RestaurantService(Payment payment) {
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
