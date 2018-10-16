import Stall.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {
    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Ice Cream Van", "Bob", 10);
    }

    @Test
    public void hasName(){
        assertEquals("Ice Cream Van", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Bob", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(10, iceCreamStall.getParkingSpot());
    }
}
