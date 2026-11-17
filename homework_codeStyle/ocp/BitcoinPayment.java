package homework_codeStyle.ocp;

public class BitcoinPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата Bitcoin на суммму " + amount);
    }
}