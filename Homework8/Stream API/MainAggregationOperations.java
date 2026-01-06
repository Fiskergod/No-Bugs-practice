package homework_8.stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainAggregationOperations {
    static void main(String[] args) {
        //Task 1:
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 34, 11, 55, 90));
        int maxNumber = numbers.stream()
                .max(Comparator.naturalOrder())
                .orElseThrow(() -> new IllegalArgumentException("The list is empty!"));
        System.out.println("Max number - " + maxNumber);

        //Task 2:
        int minNumber = numbers.stream()
                .min(Integer::compareTo)
                .orElseThrow(() -> new IllegalArgumentException("The list is empty!"));
        System.out.println("Min number - " + minNumber);

        //Task 3:
        int sum = numbers.stream()
                .mapToInt(Integer::valueOf)
                .sum();
        System.out.println("Sum of the numbers - " + sum);

        //Task 4
        List<String> names = new ArrayList<>(Arrays.asList("Борис", "Иван", "Олег", "Борислав"));
        String filteredNames = names.stream()
                .filter(name -> name.startsWith("Б"))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("The list is empty!"));
        System.out.println("First name that started with - Б - " + filteredNames);

        //Task 5:
        boolean checkEvenNumber = numbers.stream()
                .anyMatch(num -> num % 2 == 0);
        System.out.println("Any even number? - " + checkEvenNumber);
    }
}
