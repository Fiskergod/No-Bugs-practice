Исправьте код с учетом принципов DRY, KISS, YAGNI, SOLID


1. Нарушение DRY (Don't Repeat Yourself) – дублирование кода

Исходный код:
public class MathOperations {
public int add(int a, int b) {
return a + b;
}
public int addThreeNumbers(int a, int b, int c) {
return a + b + c;
}
public int addFourNumbers(int a, int b, int c, int d) {
return a + b + c + d;
}
}

Задача: Устраните дублирование кода, применив перегрузку методов или использование массива аргументов.


2. Нарушение KISS (Keep It Simple, Stupid) – чрезмерно сложный код

Исходный код:
public class DiscountCalculator {
public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
double discount = 0.0;

        if (isLoyalCustomer) {
            if (isFirstPurchase) {
                discount = price * 0.10;
            } else {
                discount = price * 0.05;
            }
        } else {
            if (hasCoupon) {
                discount = price * 0.07;
            } else {
                discount = price * 0.02;
            }
        }
        return price - discount;
    }
}
Задача: Упростите код, убрав вложенные условия, сделав его более читаемым и поддерживаемым.


3. Нарушение YAGNI (You Ain't Gonna Need It) – ненужный код
   Исходный код:
   public class User {
   private String name;
   private String email;
   private String phoneNumber;
   private boolean isPremiumMember;
   private int rewardPoints;
   private String preferredLanguage;
   private String homeAddress;
   private String workAddress;
   private String socialSecurityNumber; // Никогда не используется
   public User(String name, String email, String phoneNumber) {
   this.name = name;
   this.email = email;
   this.phoneNumber = phoneNumber;
   }
   }
   Задача: Удалите неиспользуемые поля и оставьте только необходимые данные.


4. Нарушение SRP (Single Responsibility Principle) – класс выполняет несколько задач
   Исходный код:
   public class Order {
   public void processOrder() {
   System.out.println("Обрабатываем заказ...");
   }
   public void sendEmailConfirmation() {
   System.out.println("Отправляем письмо клиенту...");
   }
   public void generateInvoice() {
   System.out.println("Генерируем счет...");
   }
   }
   Задача: Разделите класс Order на отдельные классы, каждый из которых выполняет только одну задачу.


5. Нарушение OCP (Open/Closed Principle) – закрытый для расширения код
   Исходный код:
   public class PaymentProcessor {
   public void processPayment(String paymentType, double amount) {
   if (paymentType.equals("CreditCard")) {
   System.out.println("Оплата кредитной картой на сумму " + amount);
   } else if (paymentType.equals("PayPal")) {
   System.out.println("Оплата через PayPal на сумму " + amount);
   } else if (paymentType.equals("Bitcoin")) {
   System.out.println("Оплата Bitcoin на сумму " + amount);
   }
   }
   }
   Задача: Избавьтесь от if-else, применив полиморфизм (наследование или интерфейсы).


6. Нарушение LSP (Liskov Substitution Principle) – некорректное поведение подклассов
   Исходный код:
   class Bird {
   public void fly() {
   System.out.println("Птица летит");
   }
   }
   class Penguin extends Bird {
   @Override
   public void fly() {
   throw new UnsupportedOperationException("Пингвины не летают");
   }
   }
   Задача: Перепроектируйте код так, чтобы классы-наследники не нарушали поведение базового класса.


7. Нарушение ISP (Interface Segregation Principle) – слишком большой интерфейс
   Исходный код:
   interface Worker {
   void work();
   void eat();
   }
   class Programmer implements Worker {
   @Override
   public void work() {
   System.out.println("Программист пишет код");
   }
   @Override
   public void eat() {
   throw new UnsupportedOperationException("Программист не ест на работе");
   }
   }

Задача: Разделите интерфейс на отдельные специализированные интерфейсы.


8. Нарушение DIP (Dependency Inversion Principle) – жесткая зависимость от конкретных классов
   Исходный код:
   public class NotificationService {
   private EmailSender emailSender = new EmailSender();
   public void sendNotification(String message) {
   emailSender.sendEmail(message);
   }
   }
   class EmailSender {
   public void sendEmail(String message) {
   System.out.println("Отправка email: " + message);
   }
   }

Задача: Используйте интерфейсы и внедрение зависимостей, чтобы ослабить связь между классами.