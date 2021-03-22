public class Calculator {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        int num1 = 10;

        System.out.print("Введите знак операции: [+, -, *, /, ^, %] ");
        char operation = '+';

        System.out.print("Введите второе число: ");
        int num2 = 7;

        if (operation == '+') {
            System.out.println("= " + (num1 + num2));
        } else if (operation == '-') {
            System.out.println("= " + (num1 - num2));
        } else if (operation == '*') {
            System.out.println("= " + (num1 * num2));
        } else if (operation == '/') {
            System.out.println("= " + (num1 / num2));
        } else if (operation == '^') {
            int mult;
            int pow = 0;
            for (int i = 1; i < num2; i++ ) {
                mult = num1 * num1;
                pow += mult;
            }
            System.out.println(pow);
        } else if (operation == '%') {
            System.out.println("= " + (num1 % num2));
        }
    }
}