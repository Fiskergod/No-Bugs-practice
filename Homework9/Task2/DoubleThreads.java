package homework_9.task_2;

public class DoubleThreads {
    static void main(String[] args) throws InterruptedException {
        Runnable t1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("A");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        };Runnable t2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("B");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Потоки завершили работу.");
    }
}
