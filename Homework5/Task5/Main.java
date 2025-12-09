package homework_5.tasks.task_5;

public class Main {
    static void main(String[] args) {
        Farm farm = new Farm();
        Cow cow = new Cow();
        Chicken chicken = new Chicken();

        farm.addFarmAnimal(cow);
        farm.serviceAnimal();
        System.out.println();

        farm.addFarmAnimal(chicken);
        farm.serviceAnimal();
    }
}
