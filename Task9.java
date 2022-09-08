package Laboratorka1;

public class Task9 {
    public static void main(String[] args){
        CustomDouble firstNumber = new CustomDouble(10,0.0);
        CustomDouble secondNumber = new CustomDouble(0,0.0);
        char inputSign = '+'; // введіть знак:
        switch(inputSign){
            case '+':
                System.out.println(firstNumber.Sum(firstNumber,secondNumber));
                break;
            case '-':
                System.out.println(firstNumber.Minus(secondNumber));
                break;
            case '/':
                System.out.println(Calculator.division(firstNumber,secondNumber));
                break;
            case '*':
                System.out.println(Calculator.multiply(secondNumber,firstNumber));
        }
    }
}
