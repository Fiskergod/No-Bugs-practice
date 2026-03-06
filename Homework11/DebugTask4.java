package homework_11;

public class DebugTask4 {
    static void main(String[] args) {
        // Task 4: Код должен проверить, является ли строка палиндромом, но выбрасывает NullPointerException.
        // Solution: заменить null на любой палиндромный String(анна)
        System.out.println(isPalindrome("abba"));
    }
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
