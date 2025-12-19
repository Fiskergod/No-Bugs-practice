package homework_6;

import java.util.LinkedList;

public class LinkedListTasks {
    static void main(String[] args) {
        //Task 1:
        LinkedList<String> strings = new LinkedList<>();
        strings.add("string");
        strings.add("string2");
        strings.add("string3");
        strings.add("string4");
        strings.add("string5");
        strings.forEach(System.out::println);
        System.out.println();

        //Task 2:
        LinkedList<String> taskQueue = new LinkedList<>();
        taskQueue.add("Task1 - do a HW!");
        taskQueue.add("Task2 - make a call!");
        taskQueue.add("Task3 - go to the gym!");
        System.out.println("Tasks list: ");
        System.out.println(taskQueue);

        /*while (!taskQueue.isEmpty()) {
            String currentTask = taskQueue.poll();
            System.out.println(currentTask + " - in progress..");
        }
        System.out.println("All tasks are done!");*/

        //Task 3:
        System.out.println();
        printFirstAndLastElement(taskQueue);
    }

    public static void printFirstAndLastElement(LinkedList<String> strings) {
        System.out.println("The first and last elements of a list: ");
        System.out.println(strings.getFirst());
        System.out.println(strings.getLast());
    }
}
