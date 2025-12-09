package homework_5.tasks.task_2;

public class Main {
    static void main(String[] args) {
        Owner vasya = new Owner();
        Pet dog = new Dog();
        Pet cat = new Cat();

        vasya.takePet(dog);
        vasya.feedPet();
        vasya.doPlay();
        vasya.doWalk();
        System.out.println();

        vasya.takePet(cat);
        vasya.feedPet();
        vasya.doPlay();
        vasya.doWalk();
    }
}
