package homework_3;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    public Person(String ssn, String lastName, String firstName) {
        this.ssn = ssn;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void printPersonInfo() {
        System.out.println("Имя: " + firstName + ", Фамилия: " + lastName + ", ssn: " + ssn);
    }
}
