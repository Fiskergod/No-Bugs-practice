package homework_5.tasks.task_4;

public class Aquarium {
    private SeaCreature seaCreature;

    public void addSeaCreature(SeaCreature seaCreature) {
        this.seaCreature = seaCreature;
        System.out.println("Log: Морское существо " + seaCreature + " добавлено!");
    }

    public void printBehavior() {
        seaCreature.behavior();
    }
}
