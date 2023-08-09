package net.media.training.designpattern.state;
import java.util.Scanner;

public class OperaterState extends State {
    public OperaterState(Calculator calculator, String expression) {
        super(calculator, expression);
        execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        String currentOperator = scanner.nextLine();
        if(currentOperator.equals("=") || !isOperater(currentOperator)) {
            return;
        }
        expression += currentOperator;
        calculator.setState(new OperandState(calculator, expression));
    }
}