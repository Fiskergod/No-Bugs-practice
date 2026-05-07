package homework_12.task_6;

import java.time.LocalDate;
import java.util.Objects;

public class Task<T> {
    private final T ID;
    private String priority;
    private LocalDate date;
    private boolean completed;

    public Task(T ID, String priority, LocalDate date, boolean completed) {
        this.ID = ID;
        this.priority = priority;
        this.date = date;
        this.completed = completed;
    }

    public T getID() {
        return ID;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String getPriority() {
        return priority;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return  true;
        if (o == null || getClass() != o.getClass()) return false;
        Task<?> task = (Task<?>) o;
        return Objects.equals(ID, task.ID);
    }

    @Override
    public String toString() {
        return "Task: ID - " + ID + ", Priority - " + priority + ", Date - " + date + ", Status - " + completed + ".";
    }
}
