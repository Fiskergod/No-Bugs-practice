package homework_12.task_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserValidatorTest {
    /**
     * TEST CASES:

     * happy path:
        - validate
     * negative path:
        - validateName - Empty name
        - validateName - Lowercase firstLetter
        - validateAge - Too young
        - validateAge - Too old
        - validateEmail - Without symbol
     * edge path:
        - validationEnabled = false
     */

    @BeforeEach
    void setUp() {
        UserValidator.setValidationEnabled(true);
    }

    // Positive case:
    @Test
    public void validationTest() {
        User validUser = new User("Ivan", 20, "ivan@mail.com");
        assertDoesNotThrow(() -> UserValidator.validate(validUser));
    }

    // Negative cases:
    @Test
    public void emptyNameValidationTest() {
        User user = new User("", 20, "ivan@mail.com");
        assertThrows(InvalidUserException.class,
                () -> UserValidator.validateName(user.getName()));
    }

    @Test
    public void lowerCaseNameValidationTest() {
        User user = new User("anna", 20, "ivan@mail.com");
        assertThrows(InvalidUserException.class,
                () -> UserValidator.validateName(user.getName()));
    }

    @Test
    public void tooYoungAgeValidationTest() {
        User user = new User("Anna", 17, "ivan@mail.com");
        assertThrows(InvalidUserException.class,
                () -> UserValidator.validateAge(user.getAge()));
    }

    @Test
    public void tooOldAgeValidationTest() {
        User user = new User("Anna", 101, "ivan@mail.com");
        assertThrows(InvalidUserException.class,
                () -> UserValidator.validateAge(user.getAge()));
    }

    @Test
    public void emailPatternValidationTest() {
        User user = new User("Anna", 33, "ivanmail.com");
        assertThrows(InvalidUserException.class,
                () -> UserValidator.validateEmail(user.getEmail()));
    }

    // Edge case:
    @Test
    public void validationEnabledTest() {
        UserValidator.setValidationEnabled(false);
        User user = new User("evan", 10, "ivanmail.com");
        assertDoesNotThrow(() -> UserValidator.validate(user));
    }
}
