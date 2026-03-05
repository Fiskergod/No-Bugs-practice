package homework_10.string_methods;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsValidPhoneNumberTest extends StringProcessorTest {
    /**
     * Метод, который проверяет валидность телефонного номера
     * positive cases:
        "+1 1234567890" -> true
        "+44 9876543210" -> true
        "+999 1111111111" -> true
     * negative cases:
        "12345" -> false
        "invalid" -> false
        "+1 abcdefghij" -> false
        "+1234 1234567890" -> false
        "+1 123" -> false
        "" -> false
     * corner case:
        null -> NullPointerException
     */
    @ParameterizedTest
    // positive cases:
    @ValueSource(strings = {"+1 1234567890", "+44 9876543210", "+999 1111111111"})
    public void userCanDefineValidPhoneNumber(String phoneNumber) {
        assertTrue(stringProcessor.isValidPhoneNumber(phoneNumber),
                "Phone number is not true!");
    }

    @ParameterizedTest
    // negative cases:
    @ValueSource(strings = {"12345", "invalid", "+1 abcdefghij", "+1234 1234567890", "+1 123", ""})
    public void userCannotDefineValidPhoneNumber(String phoneNumber) {
        assertFalse(stringProcessor.isValidPhoneNumber(phoneNumber),
                "Phone number is not false!");
    }

    @Test
    // corner case:
    public void userCannotDefineValidPhoneNumberDueToNull() {
        assertThrows(NullPointerException.class, () -> {
            stringProcessor.isValidPhoneNumber(null);
        }, "Should throw NullPointerException with null!");
    }
}
