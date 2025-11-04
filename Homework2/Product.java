package homework_2;

public class Product {
    private String name;
    private double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void applyDiscount(double discount) {
        price -= discount;
    }

    public void printInfo() {
        System.out.println("\nТовар: " + name + ", цена: " + price);
    }
}
