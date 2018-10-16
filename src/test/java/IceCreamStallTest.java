import Park.Visitor;
import Stall.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {
    IceCreamStall iceCreamStall;
    Visitor visitor;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Ice Cream Van", "Bob", 10, 10);
        visitor = new Visitor(10, 140, 10.10);
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

    @Test
    public void hasRating(){
        assertEquals(10, iceCreamStall.getRating());
    }

    @Test
    public void hasPrice(){
        assertEquals(2.80, iceCreamStall.priceFor(visitor), 0.01);
    }
}
