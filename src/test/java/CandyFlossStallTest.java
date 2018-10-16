import Stall.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {
    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Candy Floss", "Bob", 8, 10);
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
    public void harRating(){
        assertEquals(10, candyFlossStall.getRating());
    }

}
