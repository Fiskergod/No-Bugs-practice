package homework_5.tasks.task_2;

public class Owner {
    private Pet pet;

    public void takePet(Pet pet) {
        this.pet = pet;
        System.out.println("Log: Питомец " + pet + " принят.");
    }

    public void feedPet() {
        this.pet.feed();
        System.out.println("Log: Питомец поел.");
    }

    public void doWalk() {
        if (this.pet instanceof Walkable walkablePet) { // Walkable walkablePet = this.pet;
            walkablePet.walk();
        } else {
            System.out.println("Log: Питомец " + pet + " не гуляет!");
        }
    }

    public void doPlay() {
        if (this.pet instanceof Playable playablePet) {
            playablePet.play();
        } else {
            System.out.println("Log: Питомец " + pet + " не играет!");
        }
    }
}
