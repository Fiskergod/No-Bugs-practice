package homework_6;

import java.util.HashMap;

public class HashMapTasks {
    static void main(String[] args) {
        //Task 1:
        HashMap<String, Integer> peoples = new HashMap<>();
        peoples.put("Anna", 19);
        peoples.put("Kostya", 17);
        peoples.put("Olga", 33);
        peoples.put("Oleg", 43);
        peoples.put("Petya", 20);
        peoples.forEach(
                (name, age) -> {
                    System.out.println("Name - " + name + ", age - " + age);
                }
        );
        //Task 2:
        if (peoples.containsKey("Anna")) {
            System.out.println("Anna is in!");
        } else {
            System.out.println("Anna is not here!");
        }
        //Task 3:
        printAllPeopleLessThen18(peoples);
    }
    public static void printAllPeopleLessThen18(HashMap<String, Integer> people) {
        System.out.println("All people less then 18 years old: ");
        people.forEach(
                (name, age) -> {
                    if (age < 18) {
                        System.out.println("Name - " + name + ", age " + age);
                    }
                }
        );
    }
}
