package homework_codeStyle.srp;

public class Main {
    static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();
        EmailNotifier emailNotifier = new EmailNotifier();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        Order order = new Order("1", 10);

        orderProcessor.process(order);
        emailNotifier.sendConfirmation(order);
        invoiceGenerator.generate(order);
    }
}