package calculator.model;

import static java.lang.Double.parseDouble;

public class multiply implements State{
    public double num;
    public void setOp(State state){
        this.calc.state =this;

        calc.calc.state =state;
    }
    private Calculator calculator;

    private Case calc;

    public multiply(Case calc){
        this.num = 0.0;
        this.calc = calc;
    }
    public double displayNumber() {
        return this.num;
    }

    public void decimalPressed() {
        this.num = calc.calc.state.displayNumber();
        setOp(new decimal(calc,this));

    }

    public void clearPressed() {
        this.num = 0.0;
    }
    @Override
    public void equalsPressed() {
        this.num = calc.displayNumber() * calc.calc.state.displayNumber();
        calc.num = calc.calc.state.displayNumber();
        calc.calc.state = this;

    }
    public double getNum(){
        return calc.num;
    }
    public void numberPressed(int number) {
        setOp(new numPressed(this,number));

    }
}
