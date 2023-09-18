package calculator.model;

import static java.lang.Double.parseDouble;

public class Calculator {

    public double num;
    private Case orig = new Case(this);

    public State state = this.orig;
    public void setOp(State state){this.state= state;}

    public Calculator(){
        this.num = 0.0;
    }

    public double displayNumber() {
        return this.state.displayNumber();
    }

    public void clearPressed() {
        this.state.clearPressed();
    }

    public void numberPressed(int number) {
        this.state.numberPressed(number);
    }

    public void dividePressed() {
       orig.dividePressed();
    }

    public void multiplyPressed() {
        orig.multiplyPressed();
    }

    public void subtractPressed() {
        orig.subtractPressed();
    }

    public void addPressed() {
        orig.addPressed();
    }

    public void equalsPressed() {
       this.state.equalsPressed();
    }

    public void decimalPressed() {
        this.state.decimalPressed();
    }


}
