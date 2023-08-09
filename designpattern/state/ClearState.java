package net.media.training.designpattern.state;
import java.util.Scanner;

public class ClearState extends State {
    public ClearState(Calculator calculator) {
        expression = "";
        super(calculator, expression);
        execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        
        if(isOperand(inputString))
            expression = inputString;
        else
            return;
        
        expression = inputString;
        calculator.setState(new OperaterState(calculator, expression));
    }
}