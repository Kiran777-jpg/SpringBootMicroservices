import services.CreditCardPayment;
import services.DebitCardPayment;
import services.RestaurantService;

public class Client {
    public static void main(String[] args) {

        RestaurantService rs = new RestaurantService(new DebitCardPayment());
        rs.startBIll();

        rs = new RestaurantService(new CreditCardPayment());
        rs.startBIll();

    }
}
