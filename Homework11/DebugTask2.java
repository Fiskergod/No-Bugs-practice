package homework_11;

public class DebugTask2 {
    static void main(String[] args) {
        // Task 2: Код должен вычислить сумму чисел от 1 до 5, но почему-то результат неправильный.
        // Solution: поменять постфиксный декремент на инкремент
        int sum = calculateSum(5);
        System.out.println("Sum: " + sum);
    }
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
