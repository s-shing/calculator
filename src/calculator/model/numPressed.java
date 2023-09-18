package calculator.model;

import static java.lang.Double.parseDouble;

public class numPressed implements State {
    private String num ="";
    private State calc;

    public numPressed(State calc, int number){
        this.calc = calc;
        this.num += number;

    }
    public double getNum(){
        return displayNumber();
    }

    public void decimalPressed() {
        calc.decimalPressed();
    }

    public double displayNumber() {
        return parseDouble(this.num);
    }
    public void clearPressed() {
        this.num ="0.0";
    }

    public void equalsPressed() {
        this.calc.equalsPressed();
    }
@Override
    public void numberPressed(int number) {
        this.num += number;
}
}
