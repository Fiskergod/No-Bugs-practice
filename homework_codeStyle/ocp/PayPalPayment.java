package homework_codeStyle.ocp;

public class PayPalPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата PayPal на суммму " + amount);
    }
}