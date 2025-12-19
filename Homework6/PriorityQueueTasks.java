package homework_6;

import java.util.PriorityQueue;

public class PriorityQueueTasks {
    static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(4);
        priorityQueue.add(5);
        System.out.println("Elements in order of removal:");

        priorityQueue.forEach(
                elem -> {
                    System.out.print("Element - " + elem + "; \n");
                }
        );
    }
}
