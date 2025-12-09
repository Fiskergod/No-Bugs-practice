package homework_5.tasks.task_2;

public class Cat extends Pet implements Playable {

    @Override
    void feed() {
        System.out.println("Кошка ест влажный корм.");
    }

    @Override
    public void play() {
        System.out.println("Кошка играет.");
    }
}
