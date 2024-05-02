package DependencyInversionPrinciple;

public class Cash implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Now paying in Cash");
    }
}
