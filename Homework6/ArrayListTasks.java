package homework_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class ArrayListTasks {
    static void main(String[] args) {
        //Task 1:
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        integers.add(6);
        System.out.println(integers);
        //Task 2:
        printEvenNumbers(integers);
        //Task 3:
        System.out.println();
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("Anton", "Anna", "Nikolay"));
        findLongestString(strings);
        //Task 4:
        sumAllElements(integers);
    }

    public static void printEvenNumbers(ArrayList<Integer> list) {
        list.forEach(
                elem -> {
                    if (elem % 2 == 0) {
                        System.out.print(elem + "; ");
                    }
                }
        );
    }

    public static void findLongestString(ArrayList<String> strings) {
        AtomicReference<String> longestElem = new AtomicReference<>(strings.getFirst());
        strings.forEach(
                elem -> {
                    if (elem.length() > longestElem.get().length()) {
                        longestElem.set(elem);
                    }
                }
        );
        System.out.println("Longest string: " + longestElem);
    }

    public static void sumAllElements(ArrayList<Integer> integers) {
        AtomicInteger sum = new AtomicInteger();
        integers.forEach(
                sum::addAndGet
        );
        System.out.println("Sum of elements - " + sum);
    }
}