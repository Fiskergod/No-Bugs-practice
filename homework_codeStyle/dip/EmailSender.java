package homework_codeStyle.dip;

public class EmailSender implements MessageSender {

    @Override
    public void send(String message) {
        System.out.println("Отправка email: " + message);
    }
}