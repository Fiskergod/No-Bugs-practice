package homework_12.task_5;

import java.util.Objects;

public class Product {
    private String category;
    private String title;
    private double price;

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Product(String category, String title, double price) {
        this.category = category;
        this.title = title;
        this.price = price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, title, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price
                && Objects.equals(category, product.category)
                && Objects.equals(title, product.title);
    }

    @Override
    public String toString() {
        return "\nProduct: Category - " + category + ", Title - " + title + ", Price - " + price + ".";
    }
}
