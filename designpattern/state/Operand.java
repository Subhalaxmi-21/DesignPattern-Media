package net.media.training.designpattern.state;

import java.util.ArrayList;
import java.util.List;

public class Operand {

    Integer currentValue;
    List<Character> operators;

    StringBuilder display;

    public void Operand(Character c){

    operators = new ArrayList<Character>() {
        {
            add('+');
            add('-');
            add('*');
            add('/');
        }
    };
    Character currentOperator;


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

public void input(Character c){
    if (isClear(c)) {
        lastChar = null;
        clearState();
        return;
    }

    if (isError())
        return;

    if (isEqualsOperator(this.lastChar))
        return;

    if (isDigit(c)) {
        if (isOperator(lastChar)) {
            display = new StringBuilder();
        }
}

}
