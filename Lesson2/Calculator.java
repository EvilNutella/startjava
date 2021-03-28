public class Calculator {
    private int num1;
    private int num2;
    private char operation;

    public int getNum1() {
        return num1;
    }

    void setNum1(int num1) {
        System.out.print("Введите первое число: ");
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    void setNum2(int num2) {
        System.out.print("Введите второе число: ");
        this.num2 = num2;
    }

    public char getOperation() {
        return operation;
    }

    void setOperation(char operation) {
        System.out.print("Введите знак операции: [+, -, *, /, ^, %] ");
        this.operation = operation;
    }

    int resault;
    void setResault(int resault) {
        switch (operation) {
            case '+':
                resault = (num1 + num2);
                break;
            case '-':
                resault = (num1 - num2);
                break;
            case '*':
                resault = (num1 * num2);
                break;
            case '/':
                resault = (num1 / num2);
                break;
            case '^':
                int pow = 1;
                for (int i = 0; i < num2; i++) {
                    pow *= num1;
                }
                resault = pow;
                break;
            case '%':
                resault = (num1 % num2);
                break;
        }
        this.resault = resault;
    }
        public int getResault() {
        return this.resault;
    }
}