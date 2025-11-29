package homework_4.tasks;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class BreakContinueTasks {
    static void main(String[] args) {
        //sumPosNumbers();

        //printNumbers();

        //printPosNumber();

        printStringsTillStop();
    }

    public static void sumPosNumbers() {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int sum;
        while (true) {
            System.out.print("ВВедите первое число: ");
            num1 = scanner.nextInt();
            System.out.print("ВВедите второе число: ");
            num2 = scanner.nextInt();
            if (num1 < 0 || num2 < 0) {
                System.out.println("Числа должны быть положительные!");
                break;
            }
            sum = num1 + num2;
            System.out.println("Сумма чисел = " + sum);
        }
    }

    public static void printNumbers() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + "; ");
        }
    }

    public static void printPosNumber() {
        Scanner scanner = new Scanner(System.in);
        String inputUser;
        do {
            System.out.print("Введите положительное число (для выхода из программы введите - Exit): ");
            inputUser = scanner.nextLine();
            try {
                int number = Integer.parseInt(inputUser);
                if (number < 0) {
                    continue;
                }
                System.out.println("Положительное число: " + number);
            }
            catch (NumberFormatException e) {
                if (!inputUser.equalsIgnoreCase("Exit")) {
                    System.out.println("Вы ввели строку!");
                }
            }
        } while (!inputUser.equals("Exit"));
        System.out.println("Программа завершена!");
    }

    public static void printStringsTillStop() {
        Scanner scanner = new Scanner(System.in);
        String inputUser;
        while (true) {
            System.out.print("Введите строку: ");
            inputUser = scanner.nextLine();
            if (inputUser.equals("Stop")) {
                System.out.println("Программа завершена!");
                break;
            }
            System.out.println(inputUser);
        }
    }
}
