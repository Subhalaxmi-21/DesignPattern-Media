package net.media.training.designpattern.state;

import java.util.ArrayList;
import java.util.List;

public class Validation {

    private StringBuilder display;
    private Character lastChar;

    private List<Character> operators = new ArrayList<Character>() {
        {
            add('+');
            add('-');
            add('*');
            add('/');
        }
    };
    private Integer currentValue;
    private Character currentOperator;

    public Validation() {
        this.lastChar = null;
        this.display = new StringBuilder();
    }

    public void clearState() {
        currentOperator = null;
        currentValue = null;
        display = new StringBuilder();
    }

    public boolean isDigit(Character c) {
        return c >= 48 && c <= 57;
    }

    public boolean isOperator(Character c) {
        return operators.contains(c);
    }

    public boolean isClear(Character c) {
        return c != null && c.equals('c');
    }

    public boolean isError() {
        return "Error".equals(display.toString());
    }

    public boolean isEqualsOperator(Character c) {
        return c != null && c.equals('=');
    }
    public void nextState(Character c){
        if (isClear(c)) {
            lastChar = null;
            clearState();
            return;
        }

        if (isError())
            return;

        if (isEqualsOperator(this.lastChar))
            return;
    }
}
