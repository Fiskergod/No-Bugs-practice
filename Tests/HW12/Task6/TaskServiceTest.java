package homework_12.task_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {
    /**
     * TEST CASES:

     * happy path:
     * - addTaskTest
     * - removeTaskByIdTest
     * - getTaskByStatusTest
     * - getTaskByPriorityTest
     * - getSortedTaskByDateTest

     * negative path:
     * - addTaskTest(Throws exception)
     * - removeTaskByIdTest(Throws exception)
     * - removeTaskByIdTest(idNotFound)
     */

    TaskService<Number> service;
    Task<Number> task1, task2, task3;

    @BeforeEach
    public void setUp() {
        service = new TaskService<>();
        task1 = new Task<>(1, "High",
                LocalDate.now(), false);
        task2 = new Task<>(2, "Low",
                LocalDate.of(2023, Month.AUGUST, 11), true);
        task3 = new Task<>(3, "Medium",
                LocalDate.of(2025, Month.JANUARY, 1), true);

        service.addTask(task1);
        service.addTask(task2);
        service.addTask(task3);
    }

    @Test
    @DisplayName("Добавление новой задачи.")
    void addTaskTest() {
        service.addTask(new Task<>(4, "High", LocalDate.now(), true));

        assertEquals(4, service.getAll().size());
    }

    @Test
    @DisplayName("Удаление задачи через id.")
    void removeTaskByIdTest() {
        service.removeTaskById(3);

        assertEquals(2, service.getAll().size());
    }

    @Test
    @DisplayName("Поиск задачи по статусу.")
    void getTaskByStatusTest() {
        assertEquals(2, service.getTaskByStatus(true).size());
    }

    @Test
    @DisplayName("Поиск задачи по приоритету.")
    void getTaskByPriorityTest() {
        assertEquals(1, service.getTaskByPriority("Low").size());
    }

    @Test
    @DisplayName("Сортировка задач по дате.")
    void getSortedTaskByDateTest() {
        Set<Task<Number>> sortedTasks = service.getSortedTaskByDate();
        List<Task<Number>> taskList = new ArrayList<>(sortedTasks); // можно конвертировать в List для теста

        assertTrue(taskList.get(0).getDate().isAfter(taskList.get(1).getDate()));
    }

    @Test
    @DisplayName("Выброс исключения при добавлении null задачи.")
    void addTaskThrowsExceptionTest() {
        assertThrows(IllegalArgumentException.class,
                () -> service.addTask(null));
    }

    @Test
    @DisplayName("Выброс исключения при удалении null задачи.")
    void removeTaskByIdThrowsExceptionTest() {
        assertThrows(IllegalArgumentException.class,
                () -> service.removeTaskById(null));
    }

    @Test
    @DisplayName("Удаление задачи через несуществующий id.")
    void removeTaskByIdNotFoundTest() {
        assertFalse(service.removeTaskById(5));
    }
}
