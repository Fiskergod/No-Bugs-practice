package homework_codeStyle.kiss;

public class Main {
    static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();

        System.out.println("The final price: " +
                discountCalculator.calculateFinalPrice(100, true, true, true));
    }
}
