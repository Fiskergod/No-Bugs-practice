package homework_5.tasks.task_5;

public class Farm {
    private FarmAnimal farmAnimal;

    public void addFarmAnimal(FarmAnimal farmAnimal) {
        this.farmAnimal = farmAnimal;
        System.out.println("Log: Добавили животное " + farmAnimal + ".");
    }

    public void serviceAnimal() {
        farmAnimal.feed();
        farmAnimal.produce();
    }
}
