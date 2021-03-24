public class Game {
    public static void main(String[] args) {
        int targetNumber = 15;
        System.out.println("Ты должен угадать число от 1 до 100. Напиши одно наугад: ");

        int playerNumber = 20;
        while (true) {
            if (targetNumber < playerNumber) {
                System.out.println("Попробуй снизить ожидания");
                playerNumber--;
            } else if (targetNumber > playerNumber) {
                System.out.println("Бери выше");
                playerNumber++;
            } else if (targetNumber == playerNumber) {
                break;
            }
        }
        System.out.println("Невероятно, ты угадал");
    }
}