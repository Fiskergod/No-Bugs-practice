package homework_5.tasks.task_1;

public class Main {
    static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal elephant = new Elephant();
        Animal bird = new Bird();

        zoo.addAnimal(elephant);
        zoo.showBehavior();
        zoo.removeAnimal();
        System.out.println();

        zoo.addAnimal(bird);
        zoo.showBehavior();
    }
}
