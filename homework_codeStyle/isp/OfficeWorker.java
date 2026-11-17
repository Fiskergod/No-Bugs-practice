package homework_codeStyle.isp;

public class OfficeWorker implements Workable, Eatable {
    @Override
    public void eat() {
        System.out.println("Обедает");
    }

    @Override
    public void work() {
        System.out.println("Работает");
    }
}