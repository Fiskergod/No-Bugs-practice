package homework_3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    static {
        maxPlayers = 10;
    }

    public GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    public static void setMaxPlayers(int number) {
        GameSettings.maxPlayers = number;
    }

    public void addPlayer() {
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        } else {
            throw new IllegalArgumentException("Текущее кол-во игроков не может превышать максимальное!");
        }
    }

    public void printGameStatus() {
        System.out.println("Игра: " + gameName + ", текущее кол-во игроков: " + currentPlayers +
                ", максимальное количество игроков: " + maxPlayers);
    }
}
