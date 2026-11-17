package homework_codeStyle.dry;

public class Main {
    static MathOperations mathOperations = new MathOperations();

    static void main(String[] args) {
        printMathResult(1, 2);
        printMathResult(1, 2, 3, 4);
    }

    static void printMathResult(int... nums) {
        System.out.println("Sum result: " + mathOperations.add(nums));
    }
}