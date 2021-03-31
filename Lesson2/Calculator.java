public class Calculator {
    private int num1;
    private int num2;
    private char operation;

    void setNum1(int num1) {
        this.num1 = num1;
    }

    void setNum2(int num2) {
        this.num2 = num2;
    }

    void setOperation(char operation) {
        this.operation = operation;
    }

    int calculate() {
        int result = 0;
        switch (operation) {
            case '+':
                result = (num1 + num2);
                break;
            case '-':
                result = (num1 - num2);
                break;
            case '*':
                result = (num1 * num2);
                break;
            case '/':
                result = (num1 / num2);
                break;
            case '^':
                result = 1;
                for (int i = 0; i < num2; i++) {
                    result *= num1;
                }
                break;
            case '%':
                result = (num1 % num2);
                break;
        }
        return result;
    }
}