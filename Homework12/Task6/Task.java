package homework_12.task_6;

import java.time.LocalDate;
import java.util.Objects;

public class Task<T> {
    private final T ID;
    private Priority priority;
    private LocalDate date;
    private Status status;

    public Task(T ID, Priority priority, LocalDate date, Status completed) {
        this.ID = ID;
        this.priority = priority;
        this.date = date;
        this.status = completed;
    }

    public T getID() {
        return ID;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
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
        return "Task: ID - " + ID + ", Priority - " + priority + ", Date - " + date + ", Status - " + status + ".";
    }
}
