package homework_8.stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainBasicOperations {
    static void main(String[] args) {
        //Task 1:
        List<String> cities = new ArrayList<>(Arrays.asList("Moscow", "Rome", "London", "Washington"));
        List<String> filteredCities = cities.stream()
                .filter(city -> city.length() > 5)
                .toList();
        System.out.println(filteredCities);

        //Task 2:
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 34, 11, 55, 90));
        List<Integer> filteredNumbers = numbers.stream()
                .filter(number -> number % 5 == 0)
                .toList();
        System.out.println(filteredNumbers);

        //Task 3:
        List<Integer> filteredCities2 = cities.stream()
                .map(String::length)
                .toList();
        System.out.println(filteredCities2);

        //Task 4:
        List<Integer> filteredNums = numbers.stream()
                .map(num -> num * num)
                .toList();
        System.out.println(filteredNums);

        //Task 5:
        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 5, 3, 3, 7, 2));
        List<Integer> filteredInts = integers.stream()
                .distinct()
                .toList();
        System.out.println(filteredInts);
    }
}
