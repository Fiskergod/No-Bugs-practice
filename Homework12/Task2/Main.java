package homework_12.task_2;

public class Main {
    static void main(String[] args) throws InvalidUserException {
        // Тестовые пользователи
        User validUser = new User("Иван", 25, "ivan@example.com");
        User invalidNameUser = new User("петр", 30, "petr@example.com");
        User invalidAgeUser = new User("Мария", 16, "maria@example.com");
        User invalidEmailUser = new User("Анна", 35, "anna@example");

        try {
        // Валидация включена
        UserValidator.setValidationEnabled(true);

            UserValidator.validate(validUser);
            UserValidator.validate(invalidNameUser);
            UserValidator.validate(invalidAgeUser);
            UserValidator.validate(invalidEmailUser);

        // Валидация выключена
        UserValidator.setValidationEnabled(false);

            UserValidator.validate(validUser);
            UserValidator.validate(invalidNameUser);
            UserValidator.validate(invalidAgeUser);
            UserValidator.validate(invalidEmailUser);

        } catch (InvalidUserException e) {
            throw new RuntimeException(e);
        }
    }
}
