package homework_10.numerical_methods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindSecondMaxTest extends NumericalProcessorTest {
    /**
     * Метод, который находит второе по величине число
     * positive cases:
        int[] {1, 3, 6, 9} -> 6
        int[] {3, 5, 7, 2} -> 5
     * negative cases:
        int[] {8} -> NoSuchElementException
        int[] {} -> NoSuchElementException
        int[] {4, 4, 4, 4} -> NoSuchElementException
     */
    public static Stream<Arguments> validArraysToFindSecondMaxNumber() {
        return Stream.of(
                Arguments.of(new int[] {-1, -3, -6, -9}, -3),
                Arguments.of(new int[] {3, 5, 7, 2}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("validArraysToFindSecondMaxNumber")
    public void ShouldReturnSecondMaxNumber(int[] initialNumbers, int expectedNumber) {
        assertEquals(expectedNumber, numericalProcessor.findSecondMax(initialNumbers),
                "Incorrect second max number!");
    }

    @Test
    public void ShouldThrowExceptionDueToSingleElement() {
        assertThrows(IllegalArgumentException.class, () -> {
            numericalProcessor.findSecondMax(new int[] {8});
        }, "Should throw IllegalArgumentException with 1 element in the array!");
    }

    @Test
    public void ShouldThrowExceptionDueToEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> {
            numericalProcessor.findSecondMax(new int[] {});
        }, "Should throw IllegalArgumentException with 0 element in the array!");
    }

    @Test
    public void ShouldThrowExceptionDueToSameElements() {
        assertThrows(NoSuchElementException.class, () -> {
            numericalProcessor.findSecondMax(new int[] {4, 4, 4, 4});
        }, "Should throw NoSuchElementException with the same elements in the array!");
    }
}
