package homework_11;

public class DebugTask9 {
    static void main(String[] args) {
        // Task 9: Код должен проверить, равны ли две строки, но почему-то не работает.
        // Solution: с помощью данного оператора сравнения мы будем сравнивать ссылки объектов, а они разные, тут
        // нужно использовать equals - сравнит символы двух объектов.
        String str1 = new String("hello");
        String str2 = new String("hello");
        if (str1.equals(str2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
