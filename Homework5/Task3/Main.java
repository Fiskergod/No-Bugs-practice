package homework_5.tasks.task_3;

public class Main {
    static void main(String[] args) {
        Menu menu = new Menu();
        HotDish potato = new HotDish();
        Drink cola = new Drink(0.5);

        menu.addDish(potato);
        menu.addDish(cola);
        menu.printDish();
        menu.removeDish(potato);
        menu.printDish();
    }
}
