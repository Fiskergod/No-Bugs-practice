package homework_5.tasks.task_6;

public class BotanicalGarden {
    private Plant plant;

    public void addPlant(Plant plant) {
        this.plant = plant;
        System.out.println("Log: Растение " + plant + " добавлено!");
    }

    public void takeCare() {
        plant.care();
    }
}
