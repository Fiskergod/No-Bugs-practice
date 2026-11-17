package homework_codeStyle.ocp;

public class PaymentProcessor {
    public void paymentProcess(PaymentMethod method, double amount) {
        method.pay(amount);
    }
}