import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        calc.setNum1(scanner.nextInt());

        System.out.println("Введите знак операции: [+, -, *, /, ^, %] ");
        calc.setOperation(scanner.next().charAt(0));

        System.out.println("Введите второе число: ");
        calc.setNum2(scanner.nextInt());

        calc.calculate();
        System.out.println("= " + calc.getResult());

        System.out.println("Хотите продолжить вычисления? [yes/no]:");
        calc.setCont(scanner.nextLine());
        calc.goOn();
    }
}