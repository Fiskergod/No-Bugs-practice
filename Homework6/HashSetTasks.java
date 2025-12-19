package homework_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetTasks {
    static void main(String[] args) {
        //Task 1:
        HashSet<Integer> integers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(integers);

        //Task 2:
        integers.add(6);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.add(10);
        if (integers.contains(10)) {
            System.out.println("Your number is in!");
        } else {
            System.out.println("Your number is not here!");
        }

        //Task 3:
        ArrayList<String> listOfNames = new ArrayList<>(Arrays.asList("Anna", "Petya", "Evgenii", "Anna"));
        System.out.println("New set of names: " + getSetFromList(listOfNames));

        //Task 4:
        HashSet<String> names = new HashSet<>(Arrays.asList("Anna", "Petya", "Evgenii", "Anna"));
        checkName(names);
    }

    public static HashSet<String> getSetFromList(ArrayList<String> strings) {
        HashSet<String> setOfNames = new HashSet<>();
        setOfNames.addAll(strings);
        return setOfNames;
    }

    public static void checkName(HashSet<String> strings) {
        if (strings.contains("Evgenii")) {
            System.out.println("Your name is in!");
        } else {
            System.out.println("Your name isn't here!");
        }
    }
}
