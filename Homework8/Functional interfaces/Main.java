package homework_8.functional_interfaces;

import prectice_8.functional_interfaces.MathOperation;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    static void main(String[] args) {
        //Task 1:
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        System.out.println("Add result: " + add.calc(5, 10));
        System.out.println("Subtract result: " + subtract.calc(10, 5));
        System.out.println("Multiply result: " + multiply.calc(5, 10));
        System.out.println("Divide result: " + divide.calc(15, 5));

        //Task 2:
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        runnable.run();

        // Просто для тренировки:
        Runnable runnable2 = () -> System.out.println("Hello from anonymous class!");
        runnable2.run();

        //Task 3:
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is even: " + isEven.test(7));

        //Task 4:
        Function<String, Integer> getStringLength = String::length;
        int stringLen = getStringLength.apply("World");
        System.out.println("String length is " + stringLen);

        //Task 5:
        Consumer<String> printInfo = System.out::println;
        printInfo.accept("Hello!");
    }
}
