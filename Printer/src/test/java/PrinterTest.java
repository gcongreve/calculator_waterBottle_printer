import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {


   Printer printer;

    @Before
    public void before(){
        printer = new Printer(100);

    }


    @Test
    public void hasPaper(){
        assertEquals(100, printer.getRemainingPaper());
    }

    @Test
    public void canPrintEnough(){
        printer.print(25, 2);
        assertEquals(50, printer.getRemainingPaper());
    }

    @Test
    public void cantPrintEnough(){
        printer.print(100, 2);
        assertEquals(100, printer.getRemainingPaper());
    }

    @Test
    public void canRefillPaper(){
        printer.print(25, 2);
        printer.addPaper(50);
        assertEquals(100, printer.getRemainingPaper());
    }

    @Test
    public void hasToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void canReduceToner(){
        printer.print(25, 2);
        assertEquals(50, printer.getToner());
    }


}
