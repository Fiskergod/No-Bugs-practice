package homework_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DebugTask10 {
    static void main(String[] args) {
        // Task 10: Код должен удалять элементы списка, но выбрасывает ConcurrentModificationException.
        // Solution: при использовании for each цикла создается неявный итератор, который не позволяет
        // изменять коллекцию во время итерации. Можно использовать removeIf(name -> name.startsWith("A"));
        // Либо через явный итератор.
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        names.removeIf(name -> name.startsWith("A"));
        System.out.println(names);

        /**
         * Iterator<String> iterator = names.iterator();
         * while(iterator.hasNext()) {
         *     String name = iterator.hasNext();
         *     if(name.startsWith("A")) {
         *          iterator.remove();
         *     }
         * }
         */
    }
}
