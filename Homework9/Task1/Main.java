package homework_9.task_1;

public class Main {
    static void main(String[] args) {
        SingleThread singleThread = new SingleThread("Привет из потока!");

        Thread thread = new Thread(singleThread);

        thread.start();
    }
}
