package homework_2;

public class Main {
    static void main(String[] args) {
        Car car = new Car("Volvo", 2023);
        car.setYear(2024);
        car.print();

        Rectangle rectangle = new Rectangle(2.3, 5.0);
        rectangle.setWidth(4.2);
        System.out.println("\nПлощадь прямоугольника: " + rectangle.calculateArea());

        Book book = new Book("Метро 2033", "Дмитрий Глуховский");
        book.setAuthor("Дмитрий Г.");
        book.printInfo();

        BankAccount bankAccount = new BankAccount("Иван П.", 1000);
        bankAccount.deposit(123);
        bankAccount.withdraw(437.9);
        bankAccount.printBalance();

        Point point = new Point(3.5, 8.0);
        point.setX(4.1);
        point.print();

        StudentGroup studentGroup = new StudentGroup("Английский яз.", 12);
        studentGroup.setStudentCount(10);
        studentGroup.printInfo();

        Circle circle = new Circle(4.9);
        circle.setRadius(3.2);
        System.out.println("\nПлощадь: " + circle.calculateArea() + ", длина окружности: " +
                circle.calculateCircumference());

        Teacher teacher = new Teacher("Анастасия К.", "Математика");
        teacher.setSubject("Физика");
        teacher.printInfo();

        Product product = new Product("ПК", 120000);
        product.setPrice(123500.5);
        product.applyDiscount(12343.3);
        product.printInfo();

        Laptop laptop = new Laptop("MSI", 100100.7);
        laptop.setPrice(115999);
        laptop.printInfo();
    }
}
