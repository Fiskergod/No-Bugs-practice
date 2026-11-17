package homework_codeStyle.srp;

public class InvoiceGenerator {
    public void generate(Order order) {
        System.out.println("Генерируем счёт на сумму " + order.getAmount());
    }
}