package net.media.training.designpattern.state;

public class Calculator {
    private State state;

    public Calculator() {
        state = new ClearState(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}