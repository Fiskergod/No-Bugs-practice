package homework_7.exceptionTasks;

import java.util.Scanner;

public class UncheckedExceptionTask {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        Double num1 = scanner.nextDouble();
        System.out.println("Введите второе число: ");
        Double num2 = scanner.nextDouble();

        try {
            Double result = divisionNumbers(num1, num2);
            System.out.println("Ответ: " + result);
        } catch (ArithmeticException ex) {
            System.err.println("Ошибка: " + ex.getMessage());
        }
    }

    public static Double divisionNumbers(Double num1, Double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Деление на 0 запрещено!");
        }
        return num1 / num2;
    }
}