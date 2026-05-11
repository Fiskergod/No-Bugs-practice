package homework_12.task_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest {
    /**
     * TEST CASES:

     * happy path:
     - getAverageBySubject
     - addPositiveGrade

     * negative path:
     - addNegativeGrade
     - getAverageBySubject_SubjectNotFound

     * edge path:
     - addZeroGrade
     */
    GradeService<Number> gradeService;

    @BeforeEach
    public void setUp() {
        gradeService = new GradeService<>();
    }

    @Test
    @DisplayName("Подсчёт среднего значения по предмету")
    void getAverageBySubjectTest() {
        gradeService.addGrade(new StudentGrade<>("Anna", "Math", 4));
        gradeService.addGrade(new StudentGrade<>("Bob", "Math", 5));

        double avg = gradeService.getAverageBySubject("Math");

        assertEquals(4.5, avg);
    }

    @Test
    @DisplayName("Добавление положительной оценки")
    void addPositiveGradeTest() {
        StudentGrade<Number> grade = new StudentGrade<>("Anna", "Math", 5);

        assertDoesNotThrow(() -> gradeService.addGrade(grade));
    }

    @Test
    @DisplayName("Добавление отрицательной оценки")
    void addNegativeGradeTest() {
        StudentGrade<Number> grade = new StudentGrade<>("Anna", "Math", -5);

        assertThrows(InvalidGradeException.class,
                () -> gradeService.addGrade(grade));
    }

    @Test
    @DisplayName("Подсчёт среднего по несуществующему предмету")
    void getAverageBySubject_SubjectNotFoundTest() {
        double avg = gradeService.getAverageBySubject("History");

        assertEquals(0.0, avg);
    }

    @Test
    @DisplayName("Добавление оценки = 0")
    void addZeroGradeTest() {
        StudentGrade<Number> grade = new StudentGrade<>("Anna", "Math", 0);
        assertDoesNotThrow(() -> gradeService.addGrade(grade));
    }
}
