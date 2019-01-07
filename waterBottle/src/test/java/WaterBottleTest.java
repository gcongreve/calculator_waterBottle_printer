import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle bottle;

    @Before
    public void before(){
        bottle = new WaterBottle();
    }


    @Test
    public void hasStartingVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void canTakeADrink(){
        bottle.takeDrink();
        assertEquals(90, bottle.getVolume());

    }

    @Test
    public void canEmptyBottle(){
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void canFillBottle(){
        bottle.empty();
        bottle.fill();
        assertEquals(100, bottle.getVolume());
    }



}
