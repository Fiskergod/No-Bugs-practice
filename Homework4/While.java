package homework_4.tasks;

import java.util.Scanner;

public class WhileTasks {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Введите число: ");
        //factorialNumber(scanner.nextInt());

        //System.out.print("Введите число: ");
        //evenNumbers(scanner.nextInt());

        System.out.print("Введите число: ");
        decreaseNumber(scanner.nextInt());
    }

    public static void factorialNumber(int n) {
        int result = 1;
        int i = 1;
        if (n < 0) {
            throw new IllegalArgumentException("Ведите число больше 0!");
        } else {
            while (i <= n) {
                result *= i++;
            }
        }
        System.out.println("Факториал числа " + n + " = " + result);
    }

    public static void evenNumbers(int n) {
        int i = 1;
        if (n < 0) {
            throw new IllegalArgumentException("Ведите число больше 0!");
        } else {
            while (i <= n) {
                i++;
                if (i % 2 == 0) {
                    System.out.println(i + "; ");
                }
            }
        }
    }

    public static void decreaseNumber(int n) {
        int i = 1;
        if (n <= 0) {
            throw new IllegalArgumentException("Число должно быть больше 0!");
        } else {
            while (n >= i) {
                System.out.print(n + "; ");
                n--;
            }
        }
    }
}
