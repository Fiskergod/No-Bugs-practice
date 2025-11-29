package homework_4.tasks;

import java.util.Scanner;

public class IfElseTasks {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IfElseTasks ifElseTasks = new IfElseTasks();

        //System.out.print("Введите число ");
        //ifElseTasks.checkNumberSign(scanner.nextInt());

        //System.out.print("Введите два числа через пробел: ");
        //findMaxNumber(scanner.nextInt(), scanner.nextInt());

        //System.out.print("Введите оценку: ");
        //ifElseTasks.checkGrade(scanner.nextInt());

        //System.out.print("Введите число ");
        //System.out.println(ifElseTasks.checkParity(scanner.nextInt()));

        //System.out.print("Введите возраст ");
        //System.out.println(ifElseTasks.calculateDiscount(scanner.nextInt()));

        System.out.print("Введите результат теста ");
        ifElseTasks.checkTestResult(scanner.nextInt());
    }

    public String checkNumberSign(int number) {
        String numberSign;
        if (number > 0) {
            System.out.println(numberSign = "Число положительное");
        } else if (number < 0) {
            System.out.println(numberSign = "Число отрицательное");
        } else {
            System.out.println(numberSign = "Число равно нулю");
        }
        return numberSign;
    }

    public static void findMaxNumber(int a, int b) {
        System.out.println("Максимальное число: " + Math.max(a, b));
    }

    public String checkGrade(int number) {
        String grade;
        if (number < 1 || number > 5) {
            throw new IllegalArgumentException("Введите оценку от 1 - 5!");
        }
        if (number == 5) {
            System.out.println(grade = "Отлично");
        } else if (number == 4) {
            System.out.println(grade = "Хорошо");
        } else if (number == 3) {
            System.out.println(grade = "Удовлетворительно");
        } else {
            System.out.println(grade = "Неудовлетворительно");
        }
        return grade;
    }

    public String checkParity(int number) {
        String  parity;
        if (number % 2 == 0) {
            parity = "Четное!";
        } else {
            parity = "Нечетное!";
        }
        return parity;
    }

    public String calculateDiscount(int ageNumber) {
        String age;
        if (ageNumber <= 18) {
            age = "Ваша скидка - 25%!";
        } else if (ageNumber >= 65) {
            age = "Ваша скидка - 30%!";
        } else {
            age = "Без скидки";
        }
        return age;
    }

    public void checkTestResult(int number) {
        if (number < 0 || number > 100) {
            throw new IllegalArgumentException("Введите число от 0 - 100!");
        }
        if (number > 90) {
            System.out.println("Отлично!");
        } else if (number > 75) {
            System.out.println("Хорошо!");
        } else if (number > 60) {
            System.out.println("Удовлетворительно!");
        } else {
            System.out.println("Неудовлетворительно!");
        }
    }
}
