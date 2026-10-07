package bai3;

public class PayPalPayment extends PaymentMethod {
    public PayPalPayment() {
        super("Không dùng tiền mặt", "PayPal");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + formatAmount(amount) + " qua PayPal.");
    }
}