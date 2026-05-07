package homework_12.task_6;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    static void main(String[] args) {
        TaskService<Number> taskService = new TaskService<>();

        Task<Number> task = new Task<>(1, "High",
                LocalDate.now(), false);
        Task<Number> task2 = new Task<>(2, "Low",
                LocalDate.of(2023, Month.AUGUST, 11), true);
        Task<Number> task3 = new Task<>(3, "Medium",
                LocalDate.of(2025, Month.JANUARY, 1), true);

        taskService.addTask(task);
        taskService.addTask(task2);
        taskService.addTask(task3);

        taskService.removeTaskById(2);

        taskService.getTaskByPriority("High");
        taskService.getTaskByStatus(false);
        taskService.getSortedTaskByDate();

        System.out.println("\nВсе задачи: " + taskService.getAll());
    }
}
