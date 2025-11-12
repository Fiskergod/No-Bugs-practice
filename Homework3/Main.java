package homework_3;

public class Main {
    static void main(String[] args) {
        Company employee = new Company(1, "Ivan");
        Company employee2 = new Company(2, "Oleg");
        Company employee3 = new Company(3, "Petya");
        System.out.println("Имя компании до изменения: " + Company.companyName);
        employee.printEmployeeInfo();
        employee2.printEmployeeInfo();
        employee3.printEmployeeInfo();
        System.out.println("Имя компании после изменения: " + Company.companyName);
        Company.companyName = "New company name!";
        Company.printCompanyName();
        employee.printEmployeeInfo();
        employee2.printEmployeeInfo();
        employee3.printEmployeeInfo();
        //employee.employeeID = 5;

        double resArea = MathConstants.calculateCircleArea(4.3);
        double resCircumference = MathConstants.calculateCircumference(9.4);
        System.out.println("Площадь: " + resArea + ", Длина окружности: " + resCircumference);

        Library library = new Library();
        library.getAuthor();
        library.getCategory();
        library.getYear();
        library.getBookTitle();
        library.year = 2000;
        library.author = "someName";
        //library.bookTitle = "Some name";

        System.out.println("Старое название универа: " + University.universityName);
        University student = new University(1, "Ivan");
        University student2 = new University(2, "Roma");
        University student3 = new University(3, "Petya");
        student.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
        University.changeUniversityName("New university name!");
        System.out.println("Новое название универа: " + University.universityName);
        student.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();

        GameSettings game = new GameSettings("Name1", 7);
        GameSettings game2 = new GameSettings("Name2", 12);
        GameSettings.setMaxPlayers(12);
        game.addPlayer();
        //game2.addPlayer();
        game.printGameStatus();
        game2.printGameStatus();

        Person person = new Person("123-23-1231", "Pupkin", "Ivan");
        Person person2 = new Person("183-23-1641", "Pupkin", "Petya");
        Person person3 = new Person("193-23-1941", "Pupkin", "Roma");
        person.setFirstName("Oleg");
        person.printPersonInfo();
        person2.printPersonInfo();
        person3.printPersonInfo();
    }
}
