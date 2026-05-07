package homework_12.task_1;

public class Person extends Entity{
    public Person(String name, int age, boolean isActive) {
        super(name, age, isActive);
    }

    @Override
    public String toString() {
        return "Person: Name - " + getName() + ", Age - " + getAge() + ", isActive - " + isActive() + ".";
    }
}
