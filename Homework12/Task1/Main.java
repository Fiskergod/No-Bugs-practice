package homework_12.task_1;

public class Main {
    static void main(String[] args) {
        EntityManager<Person> personManager = new EntityManager<>();

        Person person = new Person("Olya", 23, true);
        Person person2 = new Person("Petya", 44, false);
        Person person3 = new Person("Vasya", 44, false);
        Person person4 = new Person("Anna", 32, true);
        Person person5 = new Person("Oleg", 30, true);

        personManager.add(person);
        personManager.add(person2);
        personManager.add(person3);
        personManager.add(person4);
        personManager.add(person5);

        personManager.remove(person2);

        System.out.println("Все: ");
        personManager.getAll().forEach(System.out::println);

        // Фильтрация по возрасту
        System.out.println("\nВозраст 25-30:");
        personManager.filterByAge(25, 30).forEach(System.out::println);

        // Фильтр по имени
        System.out.println("\nИмя Olya:");
        personManager.filterByName("Olya").forEach(System.out::println);

        // Фильтр по активности
        System.out.println("\nАктивность:");
        personManager.filterByActive(true).forEach(System.out::println);
        personManager.filterByActive(false).forEach(System.out::println);
    }
}
