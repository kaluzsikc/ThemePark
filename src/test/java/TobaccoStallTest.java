import Stall.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Tobacco Stall", "Bob", 5);
    }

    @Test
    public void hasName(){
        assertEquals("Tobacco Stall", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Bob", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(5, tobaccoStall.getParkingSpot());
    }
}
