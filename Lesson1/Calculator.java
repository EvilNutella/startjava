public class Calculator {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        int num1 = 10;

        System.out.print("Введите знак операции: [+, -, *, /, ^, %] ");
        char operation = '+';

        System.out.print("Введите второе число: ");
        int num2 = 7;

        int add = num1 + num2;
        if (operation == '+') {
            System.out.println("= " + add);
        }

        int sub = num1 - num2;
        if (operation == '-') {
            System.out.println("= " + sub);
        }

        int mult = num1 * num2;
        if (operation == '*') {
            System.out.println("= " + mult);
        }

        int div = num1 / num2;
        if (operation == '/') {
            System.out.println("= " + div);
        }

        int pow;
        int sum = 0;
        if (operation == '^') {
            for (int i = 1; i < num2; i++ ) {
                pow = num1 * num1;
                sum += pow;
            }
                System.out.println(sum);
        }
        
        int rem = num1 % num2;
        if (operation == '%') {
            System.out.println("= " + rem);
        }
    }
}