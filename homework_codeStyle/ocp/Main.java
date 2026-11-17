package homework_codeStyle.ocp;

public class Main {
    static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        CreditCardPayment creditCardPayment = new CreditCardPayment();
        PayPalPayment payPalPayment = new PayPalPayment();
        BitcoinPayment bitcoinPayment = new BitcoinPayment();

        paymentProcessor.paymentProcess(creditCardPayment, 3);
        paymentProcessor.paymentProcess(payPalPayment, 2);
        paymentProcessor.paymentProcess(bitcoinPayment, 1);
    }
}