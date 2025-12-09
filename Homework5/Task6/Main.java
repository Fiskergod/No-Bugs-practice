package homework_5.tasks.task_6;

public class Main {
    static void main(String[] args) {
        BotanicalGarden botanicalGarden = new BotanicalGarden();
        Orchid orchid = new Orchid();
        Cactus cactus = new Cactus();

        botanicalGarden.addPlant(orchid);
        botanicalGarden.takeCare();
        System.out.println();

        botanicalGarden.addPlant(cactus);
        botanicalGarden.takeCare();
    }
}
