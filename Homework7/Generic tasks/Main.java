package homework_7.genericTasks;

import homework_5.tasks.task_2.Pet;

public class Main {
    static void main(String[] args) {
        //Task 1:
        Box<String> stringBox = new Box<>();
        stringBox.setElem("Java");
        System.out.println(stringBox.getElem());

        Box<Integer> integerBox = new Box<>();
        integerBox.setElem(10);
        System.out.println(integerBox.getElem());

        //Task 2:
        String[] string = {
                "SQL",
                "JS",
                "Kotlin"
        };

        Integer[] integers = {1, 2, 3, 4, 5};
        System.out.println("\nРабота метода printArray:");
        Box.printArray(integers);

        //Task 3:
        Pair<String, Integer> nameAge = new Pair<>("Ivan", 24);
        nameAge.setFirst("Petya");
        nameAge.setSecond(33);
        System.out.println();
        System.out.println(nameAge);
    }
}
