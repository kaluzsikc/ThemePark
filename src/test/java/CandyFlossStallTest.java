import Park.Visitor;
import Stall.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {
    CandyFlossStall candyFlossStall;
    Visitor visitor;

    @Before
    public void before(){

        candyFlossStall = new CandyFlossStall("Candy Floss", "Bob", 8, 10);
        visitor = new Visitor(10, 140, 10.10);

    }

    @Test
    public void hasName(){
        assertEquals("Candy Floss", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerName(){
        assertEquals("Bob", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(8, candyFlossStall.getParkingSpot());
    }

    @Test
    public void hasRating(){
        assertEquals(10, candyFlossStall.getRating());
    }

    @Test
    public void hasPrice(){
        assertEquals(4.20, candyFlossStall.priceFor(visitor), 0.01);
    }

}
