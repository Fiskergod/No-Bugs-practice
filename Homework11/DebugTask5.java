package homework_11;

public class DebugTask5 {
    static void main(String[] args) {
        // Task 5: Код должен увеличить возраст человека, но почему-то возраст остаётся прежним.
        // Solution: нужно добавить сеттер, чтобы изменить возраст.
        Person person = new Person("Alice", 25);
        updateAge(person);
        System.out.println("Updated age: " + person.getAge());
    }
    public static void updateAge(Person person) {
        person = new Person(person.getName(), person.setAge(person.getAge() + 1));
    }
}
class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    public int setAge(int age) {
        return this.age = age;
    }
}
