public class Game {
    public static void main(String[] args) {
        int numWin = 15;
        System.out.println("Ты должен угадать число от 1 до 100. Напиши одно наугад: ");

        int num1 = 5;
        for (int i = 10; i >= 10; i++) {
            if (num1 > numWin) {
                System.out.println("Попробуй снизить ожидания");
            } else if (num1 < numWin) {
                System.out.println("Бери выше");
            } else {
                System.out.println("Невероятно, ты угадал");
            break;
            }
            num1 += i;
        }
    }
}