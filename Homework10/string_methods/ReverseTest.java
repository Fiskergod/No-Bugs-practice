package homework_10.string_methods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseTest extends StringProcessorTest {
    /**
     * Метод, который переворачивает строку
     * positive cases:
        "hello" -> "olleh"
        "12345" -> "54321"
        "d" -> "d"
     * negative case:
        null -> null
     * corner case:
        "" -> ""
     */
    public static Stream<Arguments> validStringsToReverse() {
        return Stream.of(
                // positive cases:
                Arguments.of("hello", "olleh"),
                Arguments.of("12345", "54321"),
                Arguments.of("d", "d"),
                // corner case:
                Arguments.of("", "")
        );
    }

    @ParameterizedTest
    @MethodSource("validStringsToReverse")
    public void userCanReverseString(String initialString, String expectedString) {
        String actualString = stringProcessor.reverse(initialString);

        assertEquals(expectedString, actualString, "Incorrect revers string!");
    }

    @Test
    public void userCannotReverseStringWithNull() {
        assertNull(stringProcessor.reverse(null));
    }
}
