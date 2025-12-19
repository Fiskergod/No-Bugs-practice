package homework_6;

import java.util.TreeMap;

public class TreeMapTasks {
    static void main(String[] args) {
        //Task 1:
        TreeMap<String, Integer> studentsTree = new TreeMap<>();
        studentsTree.put("Anna", 59);
        studentsTree.put("Petya", 33);
        studentsTree.put("Andrey", 77);
        studentsTree.put("Evgenii", 89);
        studentsTree.put("Yana", 62);
        studentsTree.forEach(
                (student, points) ->{
                    System.out.println("Name: " + student + ", points - " + points);
                }
        );

        //Task 2:
        System.out.println();
        System.out.println("Max key is " + studentsTree.firstKey());
        System.out.println("Min key is " + studentsTree.lastKey());

        //Task 3:
        TreeMap<String, String> employees = new TreeMap<>();
        addEmployee(employees,"123", "Olga");
        addEmployee(employees,"234", "Olesya");
        addEmployee(employees,"543", "Ivan");
        findNearestGreaterId(employees,"123");
    }

    public static void addEmployee(TreeMap<String, String> employees, String id, String name) {
        if (id.isBlank() || name.isBlank()) {
            System.out.println("You can not use empty space!");
        } else {
            employees.put(id, id);
        }
    }

    public static void findNearestGreaterId(TreeMap<String, String> employeeTree, String key) {
        System.out.println("Nearest greater ID - " + employeeTree.higherKey(key));
    }
}