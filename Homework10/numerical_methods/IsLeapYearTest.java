package homework_10.numerical_methods;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsLeapYearTest extends NumericalProcessorTest {
    /**
     * Метод, который определяет, является ли год високосным
     * positive cases:
        1600 -> true
        2000 -> true
        2020 -> true
     * negative cases:
        1601 -> false
        2002 -> false
        2025 -> false
        1900 -> false
        2100 -> false
     * corner cases:
        0 -> true
        4 -> true
        400 -> true
     */
    @ParameterizedTest
    @ValueSource(ints = {
            // positive cases:
            1600, 2000, 2020,
            // corner cases:
            0, 4, 400})
    public void userCanDefineLeapYear(int initialYear) {
        assertTrue(numericalProcessor.isLeapYear(initialYear), "Leap Year defined incorrectly!");
    }

    @ParameterizedTest
    // negative cases:
    @ValueSource(ints = {1601, 2002, 2025, 1900, 2100})
    public void userCannotDefineLeapYear(int initialYear) {
        assertFalse(numericalProcessor.isLeapYear(initialYear), "Non leap Year defined incorrectly!");
    }
}
