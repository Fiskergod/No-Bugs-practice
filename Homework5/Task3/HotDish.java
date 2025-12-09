package homework_5.tasks.task_3;

public class HotDish extends Dish {
    private final static double TEMPERATURE = 70;

    @Override
    void description() {
        System.out.println("Горячее блюдо подается с температурой: " + TEMPERATURE + "C.");
    }
}
