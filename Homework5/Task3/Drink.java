package homework_5.tasks.task_3;

public class Drink extends Dish {
    private double volume;

    public Drink(double volume) {
        this.volume = volume;
    }

    @Override
    void description() {
        System.out.println("Данный напиток подается объемом: " + volume + "л.");
    }
}
