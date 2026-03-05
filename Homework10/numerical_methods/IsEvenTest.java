package homework_10.numerical_methods;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsEvenTest extends NumericalProcessorTest {
    /**
     * Метод, который определяет, является ли число чётным
     * positive cases:
        "even number" % 2 -> true
        "0" % 2 -> true
        "-even number" -> true
     * negative cases:
        "odd number" % 2 -> false
        "-odd number" % 2 -> false
     */
    @ParameterizedTest
    // Четные числа, отрицательные четные числа и 0
    @ValueSource(ints = {0, 2, 4, 6, 8, 10, 100, -2, -4, -6, -8, - 10, -100})
    public void testEvenNumbers(int number) {
        assertTrue(numericalProcessor.isEven(number));
    }

    @ParameterizedTest
    // Нечетные числа, отрицательные нечетные числа
    @ValueSource(ints = {1, 3, 5, 7, 9, 11, 99, -1, -3, -7, -9, - 11, -99})
    public void testOddNumbers(int number) {
        assertFalse(numericalProcessor.isEven(number));
    }
}
