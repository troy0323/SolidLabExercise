package DependencyInversionPrinciple;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        PaymentMethod eWallet= new EWallet();
        PaymentMethod cash = new Cash();
        PaymentMethod credit = new CreditCard();

        Map<String, PaymentMethod> paymentMethods = new HashMap<>();

        paymentMethods.put("ewallet", eWallet);
        paymentMethods.put("cash", cash);
        paymentMethods.put("creditcard", credit);

        PaymentProcess paymentProcessor = new PaymentProcess(paymentMethods);

        Order order1 = new Order("Order1", 700.00, eWallet);
        Order order2 = new Order("Order2", 300.00, cash);
        Order order3 = new Order("Order3", 2500.00, credit);

        paymentProcessor.processPayment(order1);
        paymentProcessor.processPayment(order2);
        paymentProcessor.processPayment(order3);
    }
}
