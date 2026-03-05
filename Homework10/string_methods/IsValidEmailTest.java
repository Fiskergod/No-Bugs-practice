package homework_10.string_methods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsValidEmailTest extends StringProcessorTest {
    /**
     * Метод, который проверяет, является ли строка валидным email
     * positive cases:
        "test@example.com" -> true
        "user.name@domain.co" -> true
        "a@b.cc" -> true
     * negative cases:
        "bad@.com" -> false
        "no-at-symbol" -> false
        "@missing-user.com" -> false
        "user@domain" -> false
        "" -> false
     * corner case:
        null -> false
     */
    @ParameterizedTest
    // positive cases:
    @ValueSource(strings = {"test@example.com", "user.name@domain.co", "a@b.cc"})
    public void userCanDefineValidEmail(String initialString) {
        assertTrue(stringProcessor.isValidEmail(initialString), "Valid email defined incorrectly!");
    }

    @ParameterizedTest
    @ValueSource(strings = {"bad@.com", "no-at-symbol", "@missing-user.com", "user@domain", ""})
    public void userCannotDefineValidEmail(String initialString) {
        assertFalse(stringProcessor.isValidEmail(initialString), "Invalid email defined incorrectly!");
    }

    @Test
    public void userCannotDefineValidEmailDueToNull() {
        assertFalse(stringProcessor.isValidEmail(null), "Null should always return false!");
    }
}
