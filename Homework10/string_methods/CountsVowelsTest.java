package homework_10.string_methods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountVowelsTest extends StringProcessorTest {
    /**
     * Метод, который считает количество гласных букв в строке
     * positive cases:
        "hello" -> 2
        "java" -> 2
        "AEIOU" -> 5
     * negative case:
        "null" -> IllegalArgumentException
     * corner case:
        "" -> 0
     */
    public static Stream<Arguments> validStringsToCount() {
        return Stream.of(
                // positive cases:
                Arguments.of("hello", 2),
                Arguments.of("java", 2),
                Arguments.of("AEIOU", 5),
                // corner case:
                Arguments.of("", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("validStringsToCount")
    public void userCanCountVowelsInAString(String initialStr, int expectedNumber) {
        int actualResult = stringProcessor.countVowels(initialStr);

        assertEquals(expectedNumber, actualResult, "Incorrect count vowels in a String!");
    }

    @Test
    public void userCannotCountVowelsInAString() {
        assertThrows(IllegalArgumentException.class, () -> stringProcessor.countVowels(null),
                "Counting of a null String should throw a IllegalArgumentException!");
    }
}
