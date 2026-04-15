package test.java.ro.ulbs.proiectaresoftware.lab6.advanced;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import lab5.IntCalculator;

public class NewIntCalculatorTest {
    private IntCalculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new IntCalculator(0);
    }

    @Test
    @DisplayName("Test adunare numere pozitive")
    public void testAddPositive() {
        calculator.add(10).add(5);
        assertEquals(15, calculator.result(), "10 + 5 ar trebui să fie 15");
    }

    @Test
    @DisplayName("Test scădere numere pozitive")
    public void testSubtractPositives() {
        calculator.add(20);
        calculator.subtract(5);
        assertEquals(15, calculator.result());
    }

    @Test
    @DisplayName("6.8.2 Negative Path - Împărțire la 0")
    public void testDivideBy0() {
        lab5.AdvancedCalculator advCalc = new lab5.AdvancedCalculator(10);
        advCalc.divide(0);
        assertEquals(10, advCalc.result());
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }
}
