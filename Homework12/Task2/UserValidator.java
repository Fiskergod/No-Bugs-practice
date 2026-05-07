package homework_12.task_2;

import java.util.regex.Pattern;

public class UserValidator {
    // Глобальный флаг управления валидацией
    private static boolean validationEnabled = true;

    // Регулярное выражение для проверки email
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");

    // Метод для включения/выключения валидации
    public static void setValidationEnabled(boolean enabled) {
        validationEnabled = enabled;
    }

    // Метод для проверки имени
    public static void validateName(String name) throws InvalidUserException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidUserException("Имя не может быть пустым!");
        }
        if (!Character.isUpperCase(name.charAt(0))) {
            throw new InvalidUserException("Имя должно начинаться с заглавной буквы!");
        }
    }

    // Метод для проверки возраста
    public static void validateAge(int age) throws InvalidUserException {
        if (age < 18 || age > 100) {
            throw new InvalidUserException("Возраст должен быть в диапазоне от 18 до 100 лет (текущий: " + age + ")");
        }
    }

    // Метод для проверки email
    public static void validateEmail(String email) throws InvalidUserException {
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new InvalidUserException("Некорректный формат email: " + email);
        }
    }

    // Основной метод валидации пользователя
    public static void validate(User user) {
        // Если валидация выключена - пропускаем проверку
        if (!validationEnabled) {
            System.out.println("Валидация отключена, проверка не может быть выполнена!");
            return;
        }

        System.out.println("Выполняется валидация пользователя - " + user + "...");

        // Последовательная проверка всех полей
        try {
            validateName(user.getName());
            validateAge(user.getAge());
            validateEmail(user.getEmail());
        } catch (InvalidUserException ex) {
            System.out.println("Ошибка! " + ex.getMessage());
            return;
        }

        System.out.println("Валидация пройдена!");
    }
}
