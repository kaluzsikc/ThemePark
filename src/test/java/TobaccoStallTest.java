import Park.Visitor;
import Stall.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){

        tobaccoStall = new TobaccoStall("Tobacco Stall", "Bob", 5, 10);
        visitor1 = new Visitor(10, 140, 10.10);
        visitor2 = new Visitor(30, 180, 20.10);
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

    @Test
    public void isAllowedTrue(){
        assertEquals(true, tobaccoStall.isAllowedTo(visitor2));
    }

    @Test
    public void isAllowedFalse(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor1));
    }

    @Test
    public void hasRating(){
        assertEquals(10, tobaccoStall.getRating());
    }

    @Test
    public void hasPrice(){
        assertEquals(6.60, tobaccoStall.priceFor(visitor1), 0.01);
    }
}
