package homework_codeStyle.dip;

public class Main {
    static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        SmsSender smsSender = new SmsSender();
        NotificationService EmailNotification = new NotificationService(emailSender);
        NotificationService SmsNotification = new NotificationService(smsSender);

        EmailNotification.sendNotification("Hi!");
        SmsNotification.sendNotification("Hi!");
    }
}