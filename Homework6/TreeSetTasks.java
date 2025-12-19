package homework_6;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetTasks {
    static void main(String[] args) {
        //Task 1:
        TreeSet<Integer> integers = new TreeSet<>(Arrays.asList(1, 2, 3, 4, 5));
        integers.forEach(System.out::print);

        //Task 2:
        System.out.println();
        addNumbersNotDuplicate(integers, 6);
        addNumbersNotDuplicate(integers, 3);
        addNumbersNotDuplicate(integers, 5);
        //Task 3:
        System.out.println(integers.higher(5) + " - nearest number that higher then 5.");
        System.out.println(integers.lower(3) + " - nearest number that lower then 3.");
    }

    public static void addNumbersNotDuplicate(TreeSet<Integer> integers, Integer integer) {
        if (integers.contains(integer)) {
            System.out.println(integer + " - already exists!");
        } else {
            integers.add(integer);
            System.out.println(integer + " - number was added!");
        }
    }
}