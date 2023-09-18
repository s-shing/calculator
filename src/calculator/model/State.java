package calculator.model;

public interface State {
    double displayNumber();

    void clearPressed();

    void numberPressed(int number);

    void equalsPressed();

    void decimalPressed();

    double getNum();

}
