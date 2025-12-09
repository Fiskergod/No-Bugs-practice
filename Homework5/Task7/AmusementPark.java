package homework_5.tasks.task_7;

public class AmusementPark {
    private Attraction attraction;

    public AmusementPark(Attraction attraction) {
        this.attraction = attraction;
    }

    public void controlAttraction() {
        attraction.techSupport();
        System.out.println("Log: Тех. обслуживание аттракциона " + attraction + " проведено!");
    }

    public void printInfo() {
        attraction.info();
    }
}
