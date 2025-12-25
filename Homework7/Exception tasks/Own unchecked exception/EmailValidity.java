package homework_7.exceptionTasks.ownUncheckedException;

import java.util.regex.Pattern;

public class EmailValidity {
    static void main(String[] args) {
        String[] emails = {
          "dog@mail.ru",
          "cat@mail.ru",
          "doggy@gmail.com",
          "cat.mail/r"
        };

        for (String email : emails) {
            try {
                checkEmail(email);
            } catch (EmailNotValidException e) {
                System.err.println("Ошибка : " + e.getMessage());
            }
        }
    }

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static void checkEmail(String email) throws EmailNotValidException {
        if (!EMAIL_PATTERN.matcher(email).matches()) {
            throw new EmailNotValidException("Некорректная почта!");
        } else {
            System.out.println("Почта - корректная!");
        }
    }
}
