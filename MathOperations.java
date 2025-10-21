public class MathOperations {
    static void main(String[] args) {
        // Задание 1
        int resultAdd = add(3, 9);
        System.out.println("Результат сложения: " + resultAdd);

        int resultSubtract = subtract(5, 3);
        System.out.println("Результат вычитания: " + resultSubtract);

        int resultMultiply = multiply(12, 6);
        System.out.println("Результат умножения: " + resultMultiply);

        double resultDivide = divide(124, 10);
        System.out.println("Результат деления: " + resultDivide);
        // Задание 2
        int maxNumber = findMax(43, 7);
        System.out.println("Большее из 2х чисел: " + maxNumber);
        // Задание 3
        int resultDifference = difference(23, 9);
        System.out.println("Разница между двумя числами: " + resultDifference);
        // Задание 4
        int resultArea = squareArea(3);
        int resulPerimeter = squarePerimeter(9);
        System.out.println("Площадь квадрата: " + resultArea);
        System.out.println("Периметр квадрата: " + resulPerimeter);
        // Задание 5
        double resultSecToMin = convertSecondsToMinutes(360);
        System.out.println("Результат перевода секунд в минуты: " + resultSecToMin);
        // Задание 6
        //double resultAverageSpeed = averageSpeed(12.4, 0);
        double resultAverageSpeed2 = averageSpeed(5.6, 9.4);
        //System.out.println("Средняя скорость: " + resultAverageSpeed);
        System.out.println("Средняя скорость: " + resultAverageSpeed2);
        // Задание 7
        double resultFindHypo = findHypotenuse(2.3, 5.5);
        //double resultFindHypo2 = findHypotenuse(0, 4.3);
        //double resultFindHypo3 = findHypotenuse(-4.5, 9.8);
        System.out.println("Результат вычисления гипотенузы: " + resultFindHypo);
        //System.out.println("Результат вычисления гипотенузы: " + resultFindHypo2);
        //System.out.println("Результат вычисления гипотенузы: " + resultFindHypo3);
        // Задание 8
        double resultCircleCir = circleCircumference(4.3);
        System.out.println("Результат длины окружности: " + resultCircleCir);
        // Задание 9
        double resultCalcPers = calculatePercentage(100.2, 24.3);
        System.out.println("Результат вычисления процента от общей части: " + resultCalcPers);
        // Задание 10
        double resultCelToFah = celsiusToFahrenheit(34.6);
        double resultFahToCel = fahrenheitToCelsius(98.3);
        System.out.println("Результат перевода Цельсии в Фаренгейты: " + resultCelToFah);
        System.out.println("Результат перевода Фаренгейты в Цельсии: " + resultFahToCel);
    }

    /*
    1. Напишите класс MathOperations
    Условие:
    Создайте класс MathOperations с методами:
    add(int x, int y) — возвращает сумму двух чисел
    subtract(int x, int y) — разницу
    multiply(int x, int y) — произведение
    divide(int x, int y) — результат деления в double
    В main вызовите каждый метод с произвольными числами и выведите результат.
     */
    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }

    /*
    2. Реализуйте метод для нахождения максимума двух чисел
    Условие:
    Создайте метод findMax(int a, int b), который возвращает большее из двух чисел.
    Вызовите метод в main и выведите результат.
     */
    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    /*
    3. Метод для нахождения разницы между двумя числами
    Условие:
    Создайте метод difference(int x, int y), который возвращает модуль разности двух чисел.
    Проверьте метод в main.
     */
    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    /*
    4. Методы для площади и периметра квадрата
    Условие:
    Создайте два метода:
    squareArea(int side) — возвращает площадь квадрата
    squarePerimeter(int side) — возвращает периметр
    вызовите оба метода в main с примером.
     */
    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    /*
    5. Метод для перевода секунд в минуты
    Условие:
    Создайте метод convertSecondsToMinutes(int seconds), который возвращает количество минут (целых или дробных).
    Вызовите метод в main и выведите результат.
     */
    public static double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }

    /*
    6. Метод для вычисления средней скорости
    Условие:
    Создайте метод averageSpeed(double distance, double time), который возвращает среднюю скорость (distance / time).
    Вызовите метод с разными значениями.
     */
    public static double averageSpeed(double distance, double time) {
        if (time <= 0) {
            throw new IllegalArgumentException("Time должно быть больше 0!");
        }
        return distance / time;
    }

    /*
    7. Метод для нахождения гипотенузы
    Условие:
    Создайте метод findHypotenuse(double a, double b) для вычисления гипотенузы по теореме Пифагора:
    √(a² + b²)
    Вызовите метод с несколькими наборами чисел.
     */
    public static double findHypotenuse(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Аргументы должны быть положительные!");
        }
        return Math.sqrt(a * a + b * b);
    }

    /*
    8. Метод для длины окружности
    Условие:
    Создайте метод circleCircumference(double radius), который возвращает длину окружности по формуле 2πr.
    Проверьте работу на нескольких значениях.
     */
    public static double circleCircumference(double radius) {
        return (double) Math.round(2 * Math.PI * radius * 100) / 100;
    }

    /*
    9. Метод для вычисления процентов
    Условие:
    Создайте метод calculatePercentage(double total, double part) — возвращает, какой процент от общего составляет часть.
    Пример: 25 из 200 → 12.5%
     */
    public static double calculatePercentage(double total, double part) {
        if (total == 0) {
            throw new IllegalArgumentException("Total не может быть равен 0!");
        }
        return (part / total) * 100;
    }

    /*
    10. Методы перевода температуры
    Условие:
    Создайте два метода:
    celsiusToFahrenheit(double c) — перевод в Фаренгейты: C × 9 / 5 + 32
    fahrenheitToCelsius(double f) — перевод в Цельсии: (F − 32) × 5 / 9
    Проверьте оба метода в main.
     */
    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
