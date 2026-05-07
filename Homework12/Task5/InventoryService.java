package homework_12.task_5;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class InventoryService {
    private final Map<String, List<Product>> productMap = new ConcurrentHashMap<>();
    private static boolean isInventoryOpen = true;

    public Map<String, List<Product>> getProductMap() {
        return Collections.unmodifiableMap(productMap);
    }

    public void setInventoryOpen(boolean enabled) {
        isInventoryOpen = enabled;
    }

    public void addProduct(Product product) {
        if (!isInventoryOpen) {
            System.out.println("Доступ к складу закрыт, операция не может быть выполнена!");
            return;
        }

        if (product == null) {
            throw new IllegalArgumentException("Продукт не должен быть пустым или null!");
        }

        productMap.computeIfAbsent(product.getCategory(), k -> new CopyOnWriteArrayList<>())
                .add(product);
    }

    public List<Product> getProductByCategory(String category) throws OutOfStockException {
        if (category == null) {
            throw new IllegalArgumentException("Категория не должна быть пустой или null!");
        }

        return productMap.entrySet().stream() // получаем Stream из entrySet
                .filter(entry -> entry.getKey().equals(category))
                .map(entry -> entry.getValue()) // преобразуем в List<Product>
                .filter(list -> list != null && !list.isEmpty())
                .findFirst()
                .orElseThrow(() -> new OutOfStockException("Нет продуктов в данной категории - "
                        + category));
    }

    public List<Product> getProductByPrice(double min, double max) {
        return productMap.values().stream()// Было: Stream<List<Product>>
                .flatMap(list -> list.stream()) // После распаковали в: Stream<Product>
                .filter(prod -> prod.getPrice() >= min && prod.getPrice() <= max)
                .collect(Collectors.toList());
    }
}
