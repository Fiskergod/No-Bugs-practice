package homework_5.tasks.task_5;

public class Chicken extends FarmAnimal {

    @Override
    void produce() {
        System.out.println("Курица несёт яйца.");
    }

    @Override
    void feed() {
        System.out.println("Курица кушает зерна.");
    }
}
