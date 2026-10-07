package bai3;

public abstract class PaymentMethod {
    protected String type;
    protected String name;

    public PaymentMethod(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public abstract void pay(double amount);
    
    protected String formatAmount(double amount) {
        return String.format("%,d", (long) amount).replace(',', '.');
    }
}
