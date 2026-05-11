package homework_12.task_6;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    static void main(String[] args) {
        TaskService<Number> taskService = new TaskService<>();

        Task<Number> task = new Task<>(1, Priority.HIGH,
                LocalDate.now(), Status.COMPLETED);
        Task<Number> task2 = new Task<>(2, Priority.LOW,
                LocalDate.of(2023, Month.AUGUST, 11), Status.IN_PROGRESS);
        Task<Number> task3 = new Task<>(3, Priority.MEDIUM,
                LocalDate.of(2025, Month.JANUARY, 1), Status.COMPLETED);

        taskService.addTask(task);
        taskService.addTask(task2);
        taskService.addTask(task3);

        taskService.removeTaskById(2);

        taskService.getTaskByPriority(Priority.HIGH);
        taskService.getTaskByStatus(Status.COMPLETED);
        taskService.getSortedTaskByDate();

        System.out.println("\nВсе задачи: " + taskService.getAll());
    }
}
