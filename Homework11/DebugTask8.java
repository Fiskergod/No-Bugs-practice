package homework_11;

import java.math.BigDecimal;

public class DebugTask8 {
    static void main(String[] args) {
        // Task 8: Код должен сравнить два числа, но почему-то результат не соответствует ожиданиям.
        // Solution: из-за погрешности представления чисел типа double в двоичной системе, нужно использовать BigDecimal
        // или эпсилон(сравнение с погрешностью)
        BigDecimal a = BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(3));
        BigDecimal b = BigDecimal.valueOf(0.3);
        if (a.compareTo(b) == 0) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
