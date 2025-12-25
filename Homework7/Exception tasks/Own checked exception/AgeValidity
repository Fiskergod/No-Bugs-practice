package homework_7.exceptionTasks.ownCheckedException;

public class AgeValidity {
    static void main(String[] args) {
        try {
            checkAge(-9);
        } catch (AgeNotValidException ex) {
            System.err.println("Ошибка: " + ex.getMessage());
        }
    }

    public static void checkAge(int age) throws AgeNotValidException {
        if (age < 0 || age > 150) {
            throw new AgeNotValidException("Возраст не может быть меньше 0 или больше 150!");
        } else {
            System.out.println("Возраст валидный!");
        }
    }
}
