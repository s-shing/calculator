package calculator.model;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class numPdec implements State {
    private String num;
    private State calc;

    public numPdec(State calc, int number) {
        this.calc = calc;
        double temp = parseDouble("0." + number);
        temp += calc.displayNumber();
        this.num = Double.toString(temp);
    }

    public double displayNumber() {
        return parseDouble(this.num);
    }

    public void clearPressed() {
        this.num = "";
    }

    public void equalsPressed() {
        this.calc.equalsPressed();
    }

    @Override
    public void decimalPressed() {

    }

    public double getNum() {
        return 0.0;
    }

    @Override
    public void numberPressed(int number) {
        this.num += number;
    }
}

