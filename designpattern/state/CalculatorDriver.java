package net.media.training.designpattern.state;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 4:05:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class CalculatorDriver {
    public CalculatorDriver() {
        while(true) {
            Calculator calculator = new Calculator();
            calculator.state.execute();
            System.out.println(calculator.expression);
        }
    }
}