package homework_5.tasks.task_4;

public class Main {
    static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        Shark shark = new Shark();
        SeaStar seaStar = new SeaStar();

        aquarium.addSeaCreature(shark);
        aquarium.printBehavior();
        System.out.println();
        aquarium.addSeaCreature(seaStar);
        aquarium.printBehavior();
    }
}
