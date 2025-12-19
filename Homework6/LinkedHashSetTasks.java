package homework_6;

import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

public class LinkedHashSetTasks {
    static void main(String[] args) {
        //Task 1:
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("str1");
        strings.add("str2");
        strings.add("str3");
        strings.add("str4");
        strings.add("str5");

        AtomicInteger counter = new AtomicInteger(1);
        strings.forEach(
                elem -> {
                    System.out.println(counter + " - " + elem);
                    counter.getAndIncrement();
                }
        );

        //Task 2:
        addIfNotDuplicate(strings, "str6");
        addIfNotDuplicate(strings, "str7");
        addIfNotDuplicate(strings, "str7");
        System.out.println(strings);
    }

    public static void addIfNotDuplicate(LinkedHashSet<String> strings, String string) {
        boolean added = strings.add(string);
        if (added) {
            System.out.println(string + " was added!");
        } else {
            System.out.println(string + " wasn't added!");
        }
    }
}
