package calculator.model;

public class Case implements State {

    public double num;
    public void setOp(State state){calc.state= state;this.state= state;}
    public Calculator calc;
    public State state= this;
    public Case(Calculator calc) {
        this.calc = calc;
        this.num = 0.0;
    }
    public double getNum(){
        return this.num;
    }
    public double displayNumber() {
        return this.num;
    }

    public void clearPressed() {
        this.num = 0.0;
    }

    public void numberPressed(int number) {
        setOp(new numPressed(this,number));
    }

    public void dividePressed() {
        this.num = calc.state.displayNumber();
        setOp(new divide(this));
    }

    public void multiplyPressed() {
        this.num = calc.state.displayNumber();
        setOp(new multiply(this));

    }

    public void subtractPressed() {
        this.num = calc.state.displayNumber();
        setOp(new subtract(this));

    }

    public void addPressed() {
        this.num = calc.state.displayNumber();
        setOp(new add(this));
    }

    public void equalsPressed() {
        this.state.equalsPressed();
    }

    public void decimalPressed() {
        this.num = calc.state.displayNumber();
        setOp(new decimal(this,this));
    }


}

