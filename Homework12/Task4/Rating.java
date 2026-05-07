package homework_12.task_4;

public class Rating<T extends Number> {
    private T grade;
    private static final double MIN_RATING = 1.0;
    private static final double MAX_RATING = 10.0;

    public Rating(T grade) {
        validateGrade(grade);
        this.grade = grade;
    }

    // Отдельный метод с валидацией для последующих тестов + сохранение принципа единственной ответственности:
    // конструктор занимается только инициализацией
    // метод занимается только валидацией
    public void validateGrade(T grade) {
        if (grade.doubleValue() < MIN_RATING || grade.doubleValue() > MAX_RATING) {
            throw new IllegalArgumentException("Оценка должна быть от 1 - 10!");
        }
    }

    public T getGrade() {
        return grade;
    }
}
