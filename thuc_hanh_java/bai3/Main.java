package bai3;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("Phú", 200000, new CreditCardPayment());
        order1.checkout();

        Order order2 = new Order("Toàn", 150000, new PayPalPayment());
        order2.checkout();

        Order order3 = new Order("Mai", 100000, new CashPayment());
        order3.checkout();

        Order order4 = new Order("Thúy", 300000, new MoMoPayment());
        order4.checkout();
    }
}