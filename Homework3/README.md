Класс Company
Создайте класс Company с полями:
static String companyName — общее название для всех сотрудников
final int employeeID — уникальный идентификатор (нельзя менять)
String employeeName — имя сотрудника Реализуйте конструктор, принимающий employeeID и employeeName, статический метод printCompanyName(), геттеры и сеттеры для employeeName. В main: создайте несколько сотрудников, измените companyName и проверьте, что она изменилась для всех. Попробуйте изменить employeeID — должно быть невозможно.

Класс MathConstants
Создайте класс MathConstants с полями:
final double PI = 3.14159
final double E = 2.71828 Реализуйте статические методы calculateCircleArea(double r) — площадь круга и calculateCircumference(double r) — длина окружности. В main: вызовите методы с разными значениями радиуса.

Класс Library — модификаторы доступа
Создайте класс Library с полями:
private String bookTitle
protected String author
int year (default-доступ)
public String category Реализуйте геттеры и сеттеры для всех полей. В другом классе (например, LibraryTest) создайте объект Library и проверьте доступ к полям.

Класс University
Создайте класс University с полями:
static String universityName — общее имя университета
final int studentID — уникальный ID
String studentName Реализуйте конструктор для studentID и studentName, статический метод changeUniversityName(String newName), геттер для studentName, метод printStudentInfo() — выводит имя, ID и университет. В main: создайте 3 студента, измените название университета и выведите данные.

Класс GameSettings
Создайте класс GameSettings с полями:
static int maxPlayers — общее ограничение игроков
final String gameName — название (нельзя менять)
int currentPlayers — сколько игроков в игре сейчас Реализуйте конструктор, статический метод setMaxPlayers(int), метод addPlayer() — добавляет 1 игрока, если не превышен maxPlayers, метод printGameStatus() — выводит название, текущее и максимальное количество игроков. В main: создайте 2 игры, измените maxPlayers, добавьте игроков и выведите статус.

Класс Person
Создайте класс Person с полями:
private String firstName
private String lastName
private final String ssn — номер социального страхования Реализуйте конструктор для всех трёх полей, геттеры для всех полей, сеттеры только для firstName и lastName, метод printPersonInfo() — выводит: "Имя: Иван, Фамилия: Иванов, SSN: 123-45-6789". В main: создайте несколько объектов, измените имя у одного и выведите информацию.
