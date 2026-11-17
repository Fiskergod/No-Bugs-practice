package homework_codeStyle.srp;

public class EmailNotifier {
    public void sendConfirmation(Order order) {
        System.out.println("Отправляем письмо клиенту по заказу " + order.getId());
    }
}