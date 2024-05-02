package DependencyInversionPrinciple;

public class EWallet implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Now paying using GCash");
    }
}
