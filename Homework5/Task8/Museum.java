package homework_5.tasks.task_8;

public class Museum {
    private Exhibit exhibit;

    public void addExhibit(Exhibit exhibit) {
        this.exhibit = exhibit;
        System.out.println("Log: Экспонат " + exhibit + " добавлен.");
    }

    public void printInfo() {
        exhibit.info();
    }

    public void controlExhibit() {
        exhibit.service();
        System.out.println("Log: Экспонат " + exhibit + " обслужен.");
    }
}
