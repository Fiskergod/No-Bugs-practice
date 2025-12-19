package homework_6;

import java.util.ArrayDeque;

public class ArrayDequeTasks {
    static void main(String[] args) {
        //Task 1:
        ArrayDeque<String> elements = new ArrayDeque<>();
        elements.add("element1");
        elements.add("element2");
        elements.add("element3");
        elements.add("element4");
        elements.add("element5");
        elements.forEach(
                elem -> {
                    System.out.print(elem + "; ");
                }
        );
        //Task 2:
        ArrayDeque<String> elementsAsStack = new ArrayDeque<>();
        elementsAsStack.push("elem1");
        elementsAsStack.push("elem2");
        elementsAsStack.push("elem3");
        elementsAsStack.push("elem4");
        System.out.println();
        System.out.println(elementsAsStack);
        while (!elementsAsStack.isEmpty()) {
            String currElem = elementsAsStack.pop();
            System.out.println(currElem + " - deleted.");
        }
        System.out.println("Stack is empty - " + elementsAsStack.isEmpty());
        //Task 3:
        System.out.println();
        elements.addFirst("element");
        elements.addLast("element6");
        System.out.println(elements);
        System.out.println("First elem - " + elements.peekFirst());
        System.out.println("Last elem - " + elements.peekLast());
        System.out.println(elements);
    }
}
