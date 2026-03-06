package homework_11;

public class DebugTask6 {
    static void main(String[] args) {
        // Task 6: Код должен напечатать числа от n до 1, но программа падает с StackOverflowError.
        // Solution: добавить if с условием (n > 0)
        countdown(5);
    }

    public static void countdown(int n) {
        if (n > 0) {
            System.out.println(n);
            countdown(n - 1);
        }
    }
}
