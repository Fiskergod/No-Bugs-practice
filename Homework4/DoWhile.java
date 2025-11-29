package homework_4.tasks;

import java.util.Scanner;

public class DoWhileTasks {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //getPossNumber();

        //checkPassword();

        //printNumber();

        //exitCommand();

        System.out.print("Введите число: ");
        amountOfDigitsInNumber(scanner.nextInt());
    }

    public static void getPossNumber() {
        Scanner scanner = new Scanner(System.in);
        int numberUser;
        do {
            System.out.print("Введите положительное число: ");
            numberUser = scanner.nextInt();
        } while (numberUser <= 0);

        System.out.println("Вы ввели положительное число!");
    }

    public static void checkPassword() {
        Scanner scanner = new Scanner(System.in);
        String password = "123";
        String passUser;
        do {
            System.out.print("Введите пароль: ");
            passUser = scanner.nextLine();
        } while (!passUser.equals(password));

        System.out.println("Пароль верный!");
    }

    public static void printNumber() {
        int i = 1;
        do {
            System.out.print(i + "; ");
            i++;
        } while (i <= 10);
    }

    public static void exitCommand() {
        Scanner scanner = new Scanner(System.in);
        String command = "Exit";
        String commandUser;
        do {
            System.out.print("Введите команду для завершения работы программы: ");
            commandUser = scanner.nextLine();
        } while (!commandUser.equals(command));

        System.out.println("Программа завершена!");
    }

    public static void amountOfDigitsInNumber(int num) {
        int count = 0;
        do {
            num /= 10;
            count++;
        } while (num > 0);

        System.out.println("Количество цифр в данном числе = " + count);
    }
}
