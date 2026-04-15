package test.java.ro.ulbs.proiectaresoftware.lab6.advanced;

import org.junit.jupiter.api.*;
import test.java.ro.ulbs.proiectaresoftware.lab6.advanced.DoubleCalculator;

import static org.junit.jupiter.api.Assertions.*;

public class DoubleCalculatorTest {
    private DoubleCalculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new DoubleCalculator().init();
    }

    @Test
    public void testAdd() {
        calculator.add(10.5).add(5.5);
        assertEquals(16.0, calculator.getState(), 0.001);
    }
}