public class Game {
    public static void main(String[] args) {
        int targetNumber = 15;
        System.out.println("Ты должен угадать число от 1 до 100. Напиши одно наугад: ");

        int playerNumber = 1;
        while (true) {
            if (targetNumber < playerNumber) {
                System.out.println("Попробуй снизить ожидания");
            } else if (targetNumber > playerNumber) {
                System.out.println("Бери выше");
            } else if (targetNumber == playerNumber) {
                break;
            }
            playerNumber++;
        }
        System.out.println("Невероятно, ты угадал");
    }
}