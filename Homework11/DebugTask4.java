package homework_11;

public class DebugTask4 {
       static void main(String[] args) {
        // Task 4: Код должен проверить, является ли строка палиндромом, но выбрасывает NullPointerException.
        // Solution: Нужно добавить проверку внутри метода на ввод null через оператор if.
        System.out.println(isPalindrome(null));
    }

    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        } else {
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        }
    }
}
