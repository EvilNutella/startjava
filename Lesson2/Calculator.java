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

    void calculate () {
        int result;
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
                int pow = 1;
                for (int i = 0; i < num2; i++) {
                    pow *= num1;
                }
                result = pow;
                break;
            case '%':
                result = (num1 % num2);
                break;
        }
        this.result = result; // компилятор не может найти result
    }

    public int getResult() {
        return this.result; // компилятор не может найти result
    }

    private String cont;

    void setCont(String cont) {
        this.cont = cont;
    }

    public void goOn() {
        switch (cont) {
            case "yes":
                calc.main(String[]); //как вызвать мейн из другого класса, если это вообще возможно?)
                break;
            case "no":
                System.out.println("Хорошего дня!");
                break;
            default:
                goOn();
            }
        }
}