Задачи содержат ошибки, которые можно найти только с помощью Debug.
Ваша задача – запустить код, отследить выполнение, найти проблему и исправить её.

Задача 1:
Код должен напечатать все элементы массива, но вместо этого выбрасывает исключение.

public class DebugTask1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i <= numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}


Задача 2:
Код должен вычислить сумму чисел от 1 до 5, но почему-то результат неправильный.

public class DebugTask2 {
    public static void main(String[] args) {
        int sum = calculateSum(5);
        System.out.println("Sum: " + sum);
    }
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i--) {
            sum += i;
        }
        return sum;
    }
}


Задача 3:
Код должен напечатать числа от 1 до 5, но программа зависает.

public class DebugTask3 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Number: " + i);
        }
    }
}


Задача 4:
Код должен проверить, является ли строка палиндромом, но выбрасывает NullPointerException.

public class DebugTask4 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(null));
    }
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}


Задача 5:
Код должен увеличить возраст человека, но почему-то возраст остаётся прежним.

public class DebugTask5 {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        updateAge(person);
        System.out.println("Updated age: " + person.getAge());
    }
    public static void updateAge(Person person) {
        person = new Person(person.getName(), person.getAge() + 1);
    }
}
class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
}


Задача 6:
Код должен напечатать числа от n до 1, но программа падает с StackOverflowError.

public class DebugTask6 {
    public static void main(String[] args) {
        countdown(5);
    }
    public static void countdown(int n) {
        System.out.println(n);
        countdown(n - 1);
    }
}


Задача 7:
Два потока списывают деньги со счёта одновременно, но почему-то баланс становится отрицательным.

public class DebugTask7 {
    private static int balance = 100;
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> withdraw(60));
        Thread t2 = new Thread(() -> withdraw(50));
        t1.start();
        t2.start();
    }
    public static void withdraw(int amount) {
        if (balance >= amount) {
            try { Thread.sleep(100); } catch (InterruptedException e) { }
            balance -= amount;
            System.out.println("New balance: " + balance);
        }
    }
}


Задача 8:
Код должен сравнить два числа, но почему-то результат не соответствует ожиданиям.

public class DebugTask8 {
    public static void main(String[] args) {
        double a = 0.1 * 3;
        double b = 0.3;
        if (a == b) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}


Задача 9:
Код должен проверить, равны ли две строки, но почему-то не работает.

public class DebugTask9 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        if (str1 == str2) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}


Задача 10:
Код должен удалять элементы списка, но выбрасывает ConcurrentModificationException.

import java.util.*;
public class DebugTask10 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        for (String name : names) {
            if (name.startsWith("A")) {
                names.remove(name);
            }
        }
    }
}
