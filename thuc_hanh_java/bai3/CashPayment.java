package bai3;

public class CashPayment extends PaymentMethod {
    public CashPayment() {
        super("Trực tiếp", "Cash");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + formatAmount(amount) + " bằng tiền mặt.");
    }
}