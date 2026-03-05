package homework_10.numerical_methods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindMaxTest extends NumericalProcessorTest {
    /**
     * positive cases:
        "[1, 4, 7, 9, 3]" -> 9
        "[-1, -4, -7, -9, -3]" -> -1
        "[3]" -> 3
     * negative cases:
        "[]" -> NoSuchElementException
        null -> NullPointerException
     */
    public static Stream<Arguments> validArraysOfNumbers() {
        return Stream.of(
                // positive cases:
                Arguments.of(new int[] {1, 4, 7, 9, 3}, 9),
                Arguments.of(new int[] {-1, -4, -7, -9, -3}, -1),
                Arguments.of(new int[] {3}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("validArraysOfNumbers")
    public void userCanFindMaxNumber(int[] initialNumbers, int expectedNumber) {
        assertEquals(expectedNumber, numericalProcessor.findMax(initialNumbers), "Incorrect max number!");
    }

    @Test
    public void userCannotFindMaxNumberDueToEmptyArray() {
        assertThrows(NoSuchElementException.class, () -> {
            numericalProcessor.findMax(new int[]{});
        }, "Should throw NoSuchElementException!");
    }

    @Test
    public void userCannotFindMaxNumberDueToNull() {
        assertThrows(NullPointerException.class, () -> {
            numericalProcessor.findMax(null);
        }, "Should throw NullPointerException!");
    }
}
