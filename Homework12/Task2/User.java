package homework_12.task_2;

public class User {
    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return String.format("User: (name = '%s', age = %d, email = '%s')", name, age, email);
    }
}
