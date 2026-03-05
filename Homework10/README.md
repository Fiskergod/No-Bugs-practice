1. Проверка чётности числа
Напишите тесты для метода, который определяет, является ли число чётным:

public boolean isEven(int number) {
    return number % 2 == 0;
}

Тесты должны проверять:
Чётные и нечётные числа
Нулевое значение
Отрицательные числа


2. Подсчёт количества гласных в строке
Напишите тесты для метода, который считает количество гласных букв в строке:

public int countVowels(String input) {
    if (input == null) {
        throw new IllegalArgumentException("Input cannot be null");
    }
    return (int) input.toLowerCase().chars()
            .filter(c -> "aeiou".indexOf(c) != -1)
            .count();
}

Тесты должны проверять:
Разные строки ("hello", "java", "AEIOU", "")
null (должно выбрасываться исключение)
Строки без гласных


3. Разворот строки
Напишите тесты для метода, который переворачивает строку:

public String reverse(String input) {
    if (input == null) return null;
    return new StringBuilder(input).reverse().toString();
}

Тесты должны проверять:
Обычные строки
Пустую строку
null (должно возвращаться null)


4. Поиск максимального числа в массиве
Напишите тесты для метода, который находит максимальное число в массиве:

public int findMax(int[] numbers) {
    return Arrays.stream(numbers).max().orElseThrow();
}

Тесты должны проверять:
Обычный массив ([3, 5, 7, 2])
Один элемент в массиве
Отрицательные числа
Пустой массив (должно выбрасываться исключение)


5. Проверка, является ли год високосным
Напишите тесты для метода, который определяет, является ли год високосным:

public boolean isLeapYear(int year) {
    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}

Тесты должны проверять:
Обычные годы
Високосные (2020, 2000, 1600)
Года, которые делятся на 100, но не на 400 (1900, 2100)


6. Проверка валидности email
Напишите тесты для метода, который проверяет, является ли строка валидным email:

public boolean isValidEmail(String email) {
    return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
}

Тесты должны проверять:
Корректные и некорректные email ("test@example.com", "bad@.com", "no-at-symbol")
null


7. Факториал числа
Напишите тесты для метода, который вычисляет факториал числа:

public int factorial(int n) {
    if (n < 0) throw new IllegalArgumentException("Negative numbers not allowed");
    return (n == 0) ? 1 : n * factorial(n - 1);
}
Тесты должны проверять:
0! = 1
Маленькие числа (1!, 5!, 7!)
Отрицательные числа (должно выбрасываться исключение)


8. Поиск второго максимального числа в массиве
Напишите тесты для метода, который находит второе по величине число:

public int findSecondMax(int[] numbers) {
    return Arrays.stream(numbers).distinct().sorted().skip(numbers.length - 2).findFirst().orElseThrow();
}

Тесты должны проверять:
Обычные массивы
Массив с одинаковыми числами
Один элемент в массиве (должно выбрасываться исключение)


9. Подсчёт количества слов в строке
Напишите тесты для метода, который считает количество слов в строке:

public int countWords(String sentence) {
    return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
}

Тесты должны проверять:
Пустую строку
null
Строку с несколькими пробелами


10. Проверка валидности номера телефона

Напишите тесты для метода, который проверяет валидность телефонного номера:

public boolean isValidPhoneNumber(String phone) {
    return phone.matches("\\+\\d{1,3} \\d{10}");
}

Тесты должны проверять:
Корректные номера ("+1 1234567890")
Некорректные номера ("12345", "invalid")
