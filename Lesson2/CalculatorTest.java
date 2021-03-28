import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
            Calculator calculation = new Calculator();

            Scanner scanner = new Scanner(System.in);
            calculation.setNum1(scanner.nextInt());

            Scanner scanner1 = new Scanner(System.in);
            calculation.setOperation(scanner1.next().charAt(0));

            Scanner scanner2 = new Scanner(System.in);
            calculation.setNum2(scanner2.nextInt());

            System.out.println("= " + calculation.getResault());

            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            String continuation = scanner3.nextLine();

    }
}