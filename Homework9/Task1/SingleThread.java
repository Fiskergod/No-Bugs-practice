package homework_9.task_1;

public class SingleThread implements Runnable {
    private String text;

    public SingleThread(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(text);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.err.println("Поток был прерван, работа завершена!");
                Thread.currentThread().interrupt();
                break;
            }
        }

        System.out.println("Поток завершил работу.");
    }
}
