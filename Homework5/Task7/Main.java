package homework_5.tasks.task_7;

public class Main {
    static void main(String[] args) {
        AmusementPark amusementPark = new AmusementPark(new RollerCoaster());

        amusementPark.controlAttraction();
        amusementPark.printInfo();
        System.out.println();

        amusementPark = new AmusementPark(new Carousel());
        amusementPark.controlAttraction();
        amusementPark.printInfo();
    }
}
