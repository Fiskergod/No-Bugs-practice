package homework_10.numerical_methods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest extends NumericalProcessorTest {
    /**
     * Метод, который вычисляет факториал числа
     * positive cases:
        1 -> 1
        5 -> 120
        7 -> 5040
        0 -> 1
     * negative case:
        -3 -> IllegalArgumentException
     */

    public static Stream<Arguments> validNumbersToCountFactorial() {
        return Stream.of(
                Arguments.of(1, 1),
                Arguments.of(5, 120),
                Arguments.of(7, 5040),
                Arguments.of(0, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("validNumbersToCountFactorial")
    public void userCanCountFactorial(int initialNumber, int expectedNumber) {
        assertEquals(expectedNumber, numericalProcessor.factorial(initialNumber),
                "Incorrect factorial number!");
    }

    @Test
    public void userCannotCountFactorialDueToNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            numericalProcessor.factorial(-3);
        }, "Should throw IllegalArgumentException!");
    }
}
