package homework_5.tasks.task_8;

public class Main {
    static void main(String[] args) {
        Museum museum = new Museum();
        Manuscript manuscript = new Manuscript();
        Sculpture sculpture = new Sculpture();

        museum.addExhibit(manuscript);
        museum.controlExhibit();
        museum.printInfo();
        System.out.println();

        museum.addExhibit(sculpture);
        museum.controlExhibit();
        museum.printInfo();
    }
}
