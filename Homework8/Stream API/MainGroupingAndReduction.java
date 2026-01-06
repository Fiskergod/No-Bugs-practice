package homework_8.stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainGroupingAndReduction {
    static void main(String[] args) {
        //Task 1:
        List<String> names = new ArrayList<>(Arrays.asList("Борис", "Иван", "Олег", "Борислав"));
        Map<String, List<String>> groupedNames = names.stream()
                .collect(Collectors.groupingBy(name -> String.valueOf(name.charAt(0))));
        System.out.println(groupedNames);

        //Task 2:
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 34, 11, 55, 90));
        Map<Boolean, List<Integer>> groupedNumbers = numbers.stream()
                .collect(Collectors.groupingBy(num -> num % 2 == 0));
        System.out.println(groupedNumbers);

        //Task 3:
        Double averageInt = numbers.stream()
                .collect(Collectors.averagingInt(num -> num));
        System.out.println("Average int is " + averageInt);
    }
}
