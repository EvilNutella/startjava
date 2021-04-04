import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            calc.setNum1(scanner.nextInt());

            System.out.println("Введите знак операции: [+, -, *, /, ^, %] ");
            calc.setOperation(scanner.next().charAt(0));

            System.out.println("Введите второе число: ");
            calc.setNum2(scanner.nextInt());

            System.out.println("= " + calc.calculate());
        } while (isNext());

        System.out.println("Хорошего дня!");
    }

    public static boolean isNext() {
        String continuation;
        Scanner scanner1 = new Scanner(System.in);
        do {
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            continuation = scanner1.nextLine();
        } while (continuation != "yes" && continuation != "no"); 
        return continuation == "yes";
    }
}