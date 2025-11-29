package homework_4.tasks;

import java.util.Scanner;

public class SwitchTasks {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Введите день недели: ");
        //checkDayOfWeek(scanner.nextInt());

        //System.out.print("Введите день недели: ");
        //System.out.println(checkPriceOfTicket(scanner.nextInt()));

        //System.out.print("Введите оценку: ");
        //System.out.println(converterGrades(scanner.nextInt()));

        //System.out.print("Введите команду: ");
        //processingCommand(scanner.nextLine());

        System.out.print("Введите через пробел данные в следующем порядке - Первое число, Оператор, Второе число: ");
        simpleCalculator(scanner.nextDouble(), scanner.next().charAt(0), scanner.nextDouble());
    }

    public static void checkDayOfWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Понедельник.");
                break;
            case 2:
                System.out.println("Вторник.");
                break;
            case 3:
                System.out.println("Среда.");
                break;
            case 4:
                System.out.println("Четверг.");
                break;
            case 5:
                System.out.println("Пятница.");
                break;
            case 6:
                System.out.println("Суббота.");
                break;
            case 7:
                System.out.println("Воскресенье.");
                break;
            default:
                System.out.println("Введите номер дня недели от 1 - 7!");
        }
    }

    public static String checkPriceOfTicket(int day) {
        String dayOfWeek;
        if (day >= 1 && day <= 5) {
            dayOfWeek = "Стоимость билета - 300р.";
        } else if (day == 6 || day == 7) {
            dayOfWeek = "Стоимость билета - 450р.";
        } else {
            dayOfWeek = "Введите номер дня недели от 1 - 7!";
        }
        return dayOfWeek;
    }

    public static String converterGrades(int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Введите число от 0 - 100!");
        }
        String gradeNumber;
        switch (grade / 10) {
            case 10:
            case 9:
                gradeNumber = "Оценка - А!";
                break;
            case 8:
                gradeNumber = "Оценка - B!";
                break;
            case 7:
                gradeNumber = "Оценка - C!";
                break;
            case 6:
                gradeNumber = "Оценка - D!";
                break;
            default:
                gradeNumber = "Оценка - F!";
        }
        return gradeNumber;
    }

    public static void processingCommand(String command) {
        switch (command) {
            case "start":
                System.out.println("Система запущена!");
                break;
            case "stop":
                System.out.println("Система остановлена!");
                break;
            case "restart":
                System.out.println("Система перезагружена!");
                break;
            case "status":
                System.out.println("Статус системы!");
                break;
            default:
                System.out.println("Введите одну из команд: start, stop, restart, status");
        }
    }

    public static void simpleCalculator(double number1, char operator, double number2) {
        double result;
        switch (operator) {
            case '+':
                result = number1 + number2;
                System.out.println("Результат сложения: " + result);
                break;
            case '-':
                result = number1 - number2;
                System.out.println("Результат вычитания: " + result);
                break;
            case '*':
                result = number1 * number2;
                System.out.println("Результат умножения: " + result);
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Результат деления: " + result);
                } else {
                    System.out.println("Деление на 0 запрещено!");
                    break;
                }
            default:
                System.out.println("Введите оператор: +, -, *, /");
        }
    }
}
