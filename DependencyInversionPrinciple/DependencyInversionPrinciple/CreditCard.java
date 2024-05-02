package DependencyInversionPrinciple;

public class CreditCard implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Now paying using Credit Card");
    }
}

