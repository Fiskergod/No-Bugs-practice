package homework_10.string_methods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountWordsTest extends StringProcessorTest {
    /**
     * Метод, который считает количество слов в строке
     * positive cases:
        "Hello world" -> 2
        "Java is  awesome" -> 3
     * corner cases:
        "" -> 0
        " " -> 0
     * negative case:
        null -> IllegalArgumentException
     */
    public static Stream<Arguments> validStringsToCount() {
        return Stream.of(
                // positive cases:
                Arguments.of("Hello world", 2),
                Arguments.of("Java is  awesome", 3),
                // corner cases:
                Arguments.of("", 0),
                Arguments.of(" ", 0)
        );
    }

    @ParameterizedTest
    @MethodSource("validStringsToCount")
    public void userCanCountWords(String initialString, int expectedNumber) {
        assertEquals(expectedNumber, stringProcessor.countWords(initialString),
                "Incorrect words count!");
    }

    @Test
    public void userCannotCountWordsDueToNull() {
        assertThrows(NullPointerException.class, () -> {
            stringProcessor.countWords(null);
        }, "Should throw NullPointerException with null!");
    }
}
