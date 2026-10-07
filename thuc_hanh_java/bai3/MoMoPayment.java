package bai3;

public class MoMoPayment extends PaymentMethod {
    public MoMoPayment() {
        super("Không dùng tiền mặt", "MoMo");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + formatAmount(amount) + " qua MoMo.");
    }
}