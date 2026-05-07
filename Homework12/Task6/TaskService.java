package homework_12.task_6;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collectors;

public class TaskService<T> {
    private final Set<Task<T>> taskSet = new CopyOnWriteArraySet<>();

    public Set<Task<T>> getAll() {
        return Collections.unmodifiableSet(taskSet);
    }

    public void addTask(Task<T> task) {
        if (task == null) {
            throw new IllegalArgumentException("Задача не должна быть null!");
        }
        taskSet.add(task);
    }

    public boolean removeTaskById(T id) {
        if (id == null) {
            throw new IllegalArgumentException("ID не должен быть null!");
        }
        return taskSet.removeIf(task -> task.getID().equals(id));
    }

    public Set<Task<T>> getTaskByStatus(boolean status) {
        Set<Task<T>> result = taskSet.stream()
                .filter(el -> el.isCompleted() == status)
                .collect(Collectors.toSet());

        System.out.println("\nНайдено задач со статусом '" + status + "': " + result.size());
        result.forEach(task -> System.out.println(" - " + task));

        return result;
    }

    public Set<Task<T>> getTaskByPriority(String priority) {
        Set<Task<T>> result = taskSet.stream()
                .filter(el -> el.getPriority().equals(priority))
                .collect(Collectors.toSet());

        System.out.println("\nНайдено задач с приоритетом '" + priority + "': " + result.size());
        result.forEach(task -> System.out.println(" - " + task));

        return result;
    }

    public Set<Task<T>> getSortedTaskByDate() {
        Set<Task<T>> result = taskSet.stream()
                .sorted(Comparator.comparing(el -> el.getDate(), Comparator.reverseOrder()))
                //.sorted(Comparator.comparing(Task::getDate, Comparator.reverseOrder()))
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println("\nЗадачи отсортированные по дате: ");
        result.forEach(task -> System.out.println(" - " + task));

        return result;
    }
}
