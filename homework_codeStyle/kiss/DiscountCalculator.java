package homework_codeStyle.kiss;

public class DiscountCalculator {
    public double calculateFinalPrice(double price, boolean isLoyalCustomer,
                                      boolean isFirstPurchase, boolean hasCoupon) {
        double discountRate = resolveDiscountRate(isLoyalCustomer, isFirstPurchase, hasCoupon);
        return price * (1 - discountRate);
    }

    private double resolveDiscountRate(boolean isLoyalCustomer,
                                       boolean isFirstPurchase, boolean hasCoupon) {
        if (isLoyalCustomer) {
            return isFirstPurchase ? 0.10 : 0.05;
        }
        return hasCoupon ? 0.07 : 0.02;
    }
}
