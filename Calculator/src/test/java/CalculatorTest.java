import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(3, calculator.add(1, 2));
    }


    @Test
    public void canSubtract(){
        assertEquals(3, calculator.subtract(4, 1));
    }


    @Test
    public void canMultiply(){
        assertEquals(8, calculator.multiply(2, 4));
    }

    @Test
    public void canDivide(){
        assertEquals(2, calculator.divide(4, 2));
    }
}
