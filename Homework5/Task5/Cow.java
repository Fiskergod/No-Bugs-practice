package homework_5.tasks.task_5;

public class Cow extends FarmAnimal {

    @Override
    void produce() {
        System.out.println("Корова даёт молоко.");
    }

    @Override
    void feed() {
        System.out.println("Корова нуждается в выпасе.");
    }
}
