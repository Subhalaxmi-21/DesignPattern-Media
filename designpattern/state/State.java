package net.media.training.designpattern.state;

public abstract class State {
    protected Calculator calculator;
    protected void expression;

    public State(Calculator calculator, String expression) {
        this.calculator = calculator;
        this.expression = expression;
    }

    public boolean checkClear(String inputString) {
        if(inputString.equals("c"))
            return true;
        return false;
    }

    public boolean isOperater(String inputString) {
        if(inputString.equals("+") || inputString.equals("-") || inputString.equals("*") || inputString.equals("/"))
            return true;
        return false;
    }

    public boolean isOperand(String inputString) {
        try {
            Integer.parseInt(inputString);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public abstract void execute();
}