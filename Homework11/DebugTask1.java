package homework_11;

public class DebugTask1 {
    static void main(String[] args) {
        // Task 1: Код должен напечатать все элементы массива, но вместо этого выбрасывает исключение.
        // Solution: убрать = из условия.
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
