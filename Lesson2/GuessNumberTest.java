import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {
        GuessNumberTest game = new GuessNumberTest();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());

        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());

        do {
            Random r = new Random();
            game.setTargetNumber(r.nextInt(100));

                System.out.println(player1 + ", попробуй угадать число: ");
                player1.setPlayerNumber(scanner.nextInt());
                player1.guessing();


                System.out.println(player2 + ", попробуй угадать число: ");
                player2.setPlayerNumber(scanner.nextInt());
                player2.guessing();
        } while (isNext());
    }

        public static boolean isNext() {
        String continuation;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Хотите продолжить игру? [yes/no]:");
            continuation = scanner.nextLine();
        } while (!"yes".equals(continuation) && !"no".equals(continuation)); 
        return "yes".equals(continuation);
    }
}