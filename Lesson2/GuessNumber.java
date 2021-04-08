public class GuessNumber {
    private int targetNumber;

    void setTargetNumber(int targetNumber) {
        this.targetNumber = targetNumber;
    }

    public int getTargetNumber() {
        return targetNumber;
    }

    public boolean guessing() {
        if (game.setTargetNumber() < getPlayerNumber()) {
            System.out.println("Попробуй снизить ожидания");
        } else if (game.setTargetNumber() > getPlayerNumber()) {
            System.out.println("Бери выше");
        } else if (game.setTargetNumber() == getPlayerNumber()) {
            System.out.println("Невероятно, ты угадал");
            return false;
        }
    }
}