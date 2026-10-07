package bai3;

public class CreditCardPayment extends PaymentMethod {
    public CreditCardPayment() {
        super("Không dùng tiền mặt", "CreditCard");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + formatAmount(amount) + " bằng thẻ tín dụng.");
    }
}