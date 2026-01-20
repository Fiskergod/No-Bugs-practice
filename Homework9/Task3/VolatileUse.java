package homework_9.task_3;

public class VolatileUse {
    private int counter = 0;
    private volatile boolean stop = false;

    public void threadCounter() {
        Thread thread = new Thread(() -> {
            while (!stop) {
                counter++;
            }
            System.out.println("Счетчик - " + counter);
        });

        thread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        stop = true;
        System.out.println("Поток завершен.");
    }
}
