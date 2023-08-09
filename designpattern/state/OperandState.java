package net.media.training.designpattern.state;
import java.util.Scanner;

public class OperandState extends State {
    public OperandState(Calculator calculator, String expression) {
        super(calculator, expression);
        execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        if(!isOperand(inputString)) {
            return;
        }

        int inputStringInteger = Integer.parseInt(inputString);

        String prevOperand = expression.substring(0, expression.length() - 1);
        String operater = expression.charAt(expression.length()-1);
        int prevOperandInteger = Integer.parseInt(prevOperand);

        String resultString;

        switch (operater) {
            case '+':
                resultString = Integer.toString(prevOperandInteger + inputStringInteger);
            case '-':
                resultString = Integer.toString(prevOperandInteger - inputStringInteger);
            case '*':
                resultString = Integer.toString(prevOperandInteger * inputStringInteger);
            case '/':
                resultString = Integer.toString(prevOperandInteger / inputStringInteger);
        }

        expression = resultString;
        calculator.setState(new OperaterState(calculator, expression));
    }
}