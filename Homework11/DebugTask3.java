package homework_11;

public class DebugTask3 {
    static void main(String[] args) {
        // Task 3: Код должен напечатать числа от 1 до 5, но программа зависает.
        // Solution: нужно добавить постфиксный инкремент
        int i = 1;
        while (i <= 5) {
            System.out.println("Number: " + i++);
        }
    }
}
