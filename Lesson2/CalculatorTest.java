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
        System.out.println("= " + result); // компилятор не может найти result
    }

    public void goOn() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Хотите продолжить вычисления? [yes/no]:");
        String cont = scanner1.nextLine();
        switch (cont) {
            case "yes":
                main();
                break;
            case "no":
                System.out.println("Хорошего дня!");
                break;
            default:
                goOn();
            }
    }
}