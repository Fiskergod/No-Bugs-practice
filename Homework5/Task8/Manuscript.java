package homework_5.tasks.task_8;

public class Manuscript extends Exhibit {

    @Override
    void info() {
        System.out.println("Манускрипт - содержит древние тексты.");
    }

    @Override
    void service() {
        System.out.println("Манускрипт - требует контролируемой влажности.");
    }
}
