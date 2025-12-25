package homework_7.genericTasks;

public class Box<T> {
    private T elem;

    public T getElem() {
        return elem;
    }

    public void setElem(T elem) {
        this.elem = elem;
    }

    // Task 2:
    public static <T> void printArray(T[] array) {
        for (T elem : array) {
            System.out.print(elem + "; ");
        }
    }
}
