package homework_5.tasks.task_8;

public class Sculpture extends Exhibit {

    @Override
    void info() {
        System.out.println("Скульптура - культурный объект.");
    }

    @Override
    void service() {
        System.out.println("Скульптура - нуждается в реставрации.");
    }
}
