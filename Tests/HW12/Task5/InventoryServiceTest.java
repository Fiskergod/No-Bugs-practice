package homework_12.task_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InventoryServiceTest {
    /**
     * TEST CASES:

     * happy path:
     * - addProduct with Flag = true
     * - getProductByCategory
     * - getProductByPrice

     * negative path:
     * - OutOfStockException(getProductByCategory)

     * edge path:
     * - addProduct with Flag = false
     */

    InventoryService service;
    Product smartphone, laptop, gloves, dumbbells;

    @BeforeEach
    public void setUp() {
        service = new InventoryService();

        smartphone = new Product("Electronics", "iPhone", 500);
        laptop = new Product("Electronics", "MSI", 1500);
        gloves = new Product("Sport", "everlast", 150);
        dumbbells = new Product("Sport", "everlast", 100);

        service.addProduct(smartphone);
        service.addProduct(laptop);
        service.addProduct(gloves);
        service.addProduct(dumbbells);
    }

    @Test
    @DisplayName("Добавление продукта с открытым доступом.")
    void addProductWithFlagTrueTest() {
        service.setInventoryOpen(true);
        Product mat = new Product("Sport", "MX", 50);
        service.addProduct(mat);

        assertEquals(3, service.getProductMap().get("Sport").size());
    }

    @Test
    @DisplayName("Фильтр продуктов по категории.")
    void getProductByCategoryTest() throws OutOfStockException {
        List<Product> filteredList = service.getProductByCategory("Electronics");

        assertEquals(2, filteredList.size());
    }

    @Test
    @DisplayName("Фильтр продуктов по цене.")
    void getProductByPriceTest() {
        List<Product> filteredList = service.getProductByPrice(200, 2000);

        assertEquals(2, filteredList.size());
    }

    @Test
    @DisplayName("Выброс исключения при фильтрации пустых списков продуктов по категории.")
    void getProductByCategoryThrowsOutOfStockExceptionTest() {
        service.getProductMap().clear();

        assertThrows(OutOfStockException.class,
                () -> service.getProductByCategory("Electronics"));
    }

    @Test
    @DisplayName("Добавление продукта с закрытым доступом.")
    void addProductWithFlagFalseTest() {
        service.setInventoryOpen(false);
        Product mat = new Product("Sport", "MX", 50);
        service.addProduct(mat);

        assertEquals(2, service.getProductMap().get("Sport").size());
    }
}
