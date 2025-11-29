package homework_4.tasks;

import java.util.Scanner;

public class ForTasks {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //printNumbers();

        //System.out.print("Введите число: ");
        //sumNumbers(scanner.nextInt());

        //System.out.print("Введите число: ");
        //multTable(scanner.nextInt());

        //System.out.print("Введите число: ");
        //checkSimpleNumber(scanner.nextInt());

        printNUmberTen();
    }

    public static void printNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + "; ");
            }
        }
    }

    public static void sumNumbers(int n) {
        int sum = 0;
        if (n < 1) {
            System.out.println("Введите число больше 0!");
        } else {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
        }
        System.out.println("Сумма числа - " + n + " = " + sum);
    }

    public static void multTable(int number) {
        if (number < 0) {
            System.out.println("Введите число больше 0!");
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + number * i);
            }
        }
    }

    public static void checkSimpleNumber(int number) {
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("Число " + number + " - простое!");
        } else {
            System.out.println("Число " + number + " - составное!");
        }
    }

    public static void printNUmberTen() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "; ");
        }
    }
}
