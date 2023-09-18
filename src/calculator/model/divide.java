package calculator.model;

public class divide implements State{

    public double num;
    public void setOp(State state){
        this.calc.state =this;

        calc.calc.state =state;
    }
    private Calculator calculator;

    public void decimalPressed() {
        this.num = calc.calc.state.displayNumber();

        setOp(new decimal(calc,this));

    }

    private Case calc;

    public divide(Case calc){
        this.num = 0.0;
        this.calc = calc;
    }
    public double displayNumber() {
        return calc.num;
    }
    public double getNum(){
        return this.num;
    }
    public void clearPressed() {
        this.num = 0.0;
        calc.num = 0.0;
    }
    @Override
    public void equalsPressed() {
        calc.num = calc.displayNumber() / calc.calc.state.getNum();
        this.num = calc.calc.state.getNum();
        calc.calc.state = this;
    }
    public void numberPressed(int number) {
        setOp(new numPressed(this,number));

    }
}
