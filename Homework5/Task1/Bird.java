package homework_5.tasks.task_1;

public class Bird extends Animal {

    @Override
    void sound() {
        System.out.println("Птичка чирикает.");
    }

    @Override
    void move() {
        System.out.println("Птичка летает.");
    }
}
