package homework_codeStyle.isp;

public class Main {
    static void main(String[] args) {
        Programmer programmer = new Programmer();
        OfficeWorker officeWorker = new OfficeWorker();

        programmer.work();
        officeWorker.eat();
        officeWorker.work();
    }
}