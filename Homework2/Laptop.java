package homework_2;

public class Laptop {
    private String brand;
    private double price;

    Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo() {
        System.out.println("\nБренд ноутбука: " + brand + ", цена: " + price);
    }
}
