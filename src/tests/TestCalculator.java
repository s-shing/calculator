package tests;

import calculator.model.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestCalculator {
    public void testOh(Calculator tester) {
        assertEquals(0.0, tester.displayNumber(), .01);
    }

    public void testNums(Calculator tester, double expected) {
        assertEquals(expected, tester.displayNumber(), .00001);
    }

    @Test
    public void testCalculator() {
        Calculator tester = new Calculator();
        testOh(tester);

        tester.numberPressed(4);
        tester.numberPressed(5);
        testNums(tester, 45.0);

        tester.dividePressed();
        tester.numberPressed(5);
        tester.equalsPressed();
        testNums(tester, 9.0);

        tester.multiplyPressed();
        tester.numberPressed(2);
        tester.equalsPressed();
        testNums(tester, 18.0);

        tester.addPressed();
        tester.numberPressed(2);
        tester.equalsPressed();
        testNums(tester, 20.0);

        tester.subtractPressed();
        tester.numberPressed(5);
        tester.equalsPressed();
        testNums(tester, 15.0);

        tester.subtractPressed();
        tester.numberPressed(1);
        tester.numberPressed(0);
        tester.equalsPressed();
        testNums(tester, 5.0);

        tester = new Calculator();
        tester.numberPressed(0);
        tester.numberPressed(1);
        tester.numberPressed(2);
        tester.numberPressed(3);
        tester.numberPressed(4);
        tester.numberPressed(5);
        tester.numberPressed(6);
        tester.numberPressed(7);
        tester.numberPressed(8);
        tester.numberPressed(9);
        testNums(tester, 0123456789.0);

        tester = new Calculator();
        tester.numberPressed(3);
        tester.numberPressed(4);
        tester.decimalPressed();
        tester.numberPressed(7);
        tester.numberPressed(8);
        testNums(tester, 34.78);

        tester = new Calculator();
        tester.numberPressed(3);
        tester.numberPressed(4);
        tester.decimalPressed();
        tester.numberPressed(7);
        tester.decimalPressed();
        tester.numberPressed(8);
        tester.decimalPressed();
        tester.decimalPressed();
        tester.numberPressed(6);
        testNums(tester, 34.786);

        tester = new Calculator();
        tester.decimalPressed();
        tester.numberPressed(7);
        testNums(tester, 0.7);
        tester.addPressed();
        tester.numberPressed(2);
        tester.equalsPressed();
        testNums(tester, 2.7);
        tester.addPressed();
        tester.decimalPressed();
        tester.numberPressed(2);
        tester.equalsPressed();
        testNums(tester, 2.9);
        tester = new Calculator();
        tester.decimalPressed();
        tester.numberPressed(7);
        testNums(tester, 0.7);
        tester.addPressed();
        tester.decimalPressed();
        tester.numberPressed(2);
        tester.equalsPressed();
        testNums(tester, 0.9);
        tester = new Calculator();
        tester.numberPressed(7);
        tester.decimalPressed();
        tester.numberPressed(7);
        tester.addPressed();
        tester.numberPressed(3);
        tester.decimalPressed();
        tester.numberPressed(1);
        tester.equalsPressed();
        testNums(tester, 10.8);


        tester = new Calculator();
        tester.numberPressed(2);
        tester.numberPressed(0);
        tester.addPressed();
        tester.numberPressed(2);
        tester.equalsPressed();
        tester.equalsPressed();
        testNums(tester, 24.0);

        tester = new Calculator();
        tester.numberPressed(2);
        tester.numberPressed(0);
        tester.subtractPressed();
        tester.numberPressed(2);
        tester.equalsPressed();
        testNums(tester, 18.0);
        tester.equalsPressed();
        testNums(tester, 16.0);
        tester.equalsPressed();
        testNums(tester, 14.0);
        tester.equalsPressed();
        testNums(tester, 12.0);

        tester.clearPressed();
        testNums(tester, 0.0);


    }

}
