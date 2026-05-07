package homework_12.task_5;

public class Main {
    static void main(String[] args) {
        InventoryService inventoryService = new InventoryService();

        Product smartphone = new Product("Electronics", "iPhone", 500);
        Product laptop = new Product("Electronics", "MSI", 1500);
        Product gloves = new Product("Sport", "everlast", 150);
        Product dumbbells = new Product("Sport", "everlast", 100);

        inventoryService.addProduct(smartphone);
        inventoryService.addProduct(laptop);
        inventoryService.addProduct(gloves);
        inventoryService.addProduct(dumbbells);


        try {
            System.out.println("Отфильтрованные товары по категории Спорт: ");

            System.out.println(inventoryService.getProductByCategory("Sport"));

            System.out.println("\nОтфильтрованные товары по категории Электроника: ");

            System.out.println(inventoryService.getProductByCategory("Electronics"));

            System.out.println("\nОтфильтрованные товары по цене: ");

            System.out.println(inventoryService.getProductByPrice(400, 2000));

        } catch (OutOfStockException ex) {
            System.err.println("Ошибка! " + ex.getMessage());
        }
    }
}
