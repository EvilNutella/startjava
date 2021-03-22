public class Calculator {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        int num1 = 10;

        System.out.print("Введите знак операции: [+, -, *, /, ^, %] ");
        char operation = '+';

        System.out.print("Введите второе число: ");
        int num2 = 7;

        if (operation == '+') {
            int add = num1 + num2;
            System.out.println("= " + add);
        } else if (operation == '-') {
            int sub = num1 - num2;
            System.out.println("= " + sub);
        } else if (operation == '*') {
            int mult = num1 * num2;
            System.out.println("= " + mult);
        } else if (operation == '/') {
            int div = num1 / num2;
            System.out.println("= " + div);
        } else if (operation == '^') {
            int pow;
            int sum = 0;
            for (int i = 1; i < num2; i++ ) {
                pow = num1 * num1;
                sum += pow;
            }
                System.out.println(sum);
        } else if (operation == '%') {
            int rem = num1 % num2;
            System.out.println("= " + rem);
        }
    }
}