package calculator.model;

import static java.lang.Double.parseDouble;

public class decimal implements State{
    public double num;
    public void setOp(State state){
        this.calc.state =this;

        calc.calc.state =state;
    }
    private Calculator calculator;
private State state;
    private Case calc;

    public decimal(Case calc, State state){
        this.num = 0.0;
        this.calc = calc;
        this.state= state;
    }

    public void decimalPressed() {

    }
    public double getNum(){
        return 0.0;
    }
    public double displayNumber() {
        return calc.displayNumber();
    }

    public void clearPressed() {
        this.num = 0.0;
    }
    @Override
    public void equalsPressed() {

    }
    public void numberPressed(int number) {

        setOp(new numPdec(state,number));

    }
}
