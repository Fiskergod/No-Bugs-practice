package homework_5.tasks.task_1;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal) {
        this.animal = animal;
        System.out.println("Log: Животное добавлено!");
    }

    public void removeAnimal() {
        System.out.println("Log: Животное удалено!");
        this.animal = null;
    }

    public void showBehavior() {
        this.animal.sound();
        this.animal.move();
    }
}
