package homework_12.task_3;

import java.util.ArrayList;
import java.util.List;

public class GradeService<T extends Number> {
    private final List<StudentGrade<T>> gradeList = new ArrayList<>();

    public List<StudentGrade<T>> getGradeList() {
        return List.copyOf(gradeList);
    }

    public synchronized void addGrade(StudentGrade<T> grade) {
        try {
            if (grade.getGrade() == null || grade.getGrade().doubleValue() < 0) {
                throw new InvalidGradeException("Оценка не может быть отрицательной!");
            }

            gradeList.add(grade);
            System.out.println("Оценка - " + grade.getGrade() + " добавлена. Студент: " + grade.getStudentName()
                    + ", предмет - " + grade.getSubject());

        } catch (InvalidGradeException ex) {
            System.err.println("Ошибка! " + ex.getMessage());
        }
    }

    public synchronized double getAverageBySubject(String subject) {
        try {
            double avr = gradeList.stream()
                    .filter(el -> el.getSubject().equals(subject))
                    .mapToDouble(el -> el.getGrade().doubleValue())
                    .average()
                    .orElseThrow(() -> new InvalidGradeException("Нет оценок для подсчета!"));
            return (double) Math.round(avr * 10) / 10;

        } catch (InvalidGradeException ex) {
            System.err.println("Ошибка! " + ex.getMessage());
            return 0.0;
        }
    }
}
