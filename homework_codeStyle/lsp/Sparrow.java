package homework_codeStyle.lsp;

public class Sparrow extends Bird implements Flyable {

    @Override
    public void move() {
        System.out.println("Воробей прыгает");
    }

    @Override
    public void fly() {
        System.out.println("Воробей летит");
    }
}