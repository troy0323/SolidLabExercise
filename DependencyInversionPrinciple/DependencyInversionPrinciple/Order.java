package DependencyInversionPrinciple;

public class Order {
    private String orderId;
    private double amount;
    private PaymentMethod paymentMethod;

    public Order(String orderId, double amount, PaymentMethod paymentMethod) {
        this.orderId = orderId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getAmount() {
        return amount;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
}
