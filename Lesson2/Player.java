public class Player {
    private String name;
    private int playerNumber;

    public Player(String name) {
        this.name = name;
    }

    void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }
}