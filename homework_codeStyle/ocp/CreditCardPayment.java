package homework_codeStyle.ocp;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Оплата кредитной картой на суммму " + amount);
    }
}