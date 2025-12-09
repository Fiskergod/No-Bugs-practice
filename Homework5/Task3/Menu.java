package homework_5.tasks.task_3;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Dish> dishList = new ArrayList<>();


    public List<Dish> getDishList() {
        return dishList;
    }

    public void setDishList(List<Dish> dishList) {
        this.dishList = dishList;
    }

    public void addDish(Dish dish) {
        dishList.add(dish);
        System.out.println("Log: Блюдо " + dish + " добавлено!");
    }

    public void removeDish(Dish dish) {
        System.out.println("Log: Блюдо " + dish + " удалено!");
        dishList.remove(dish);
    }

    public void printDish() {
        for (Dish dish : dishList) {
            dish.description();
        }
    }
}
