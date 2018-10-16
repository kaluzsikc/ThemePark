import Attraction.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("park1", 10);
    }

    @Test
    public void hasName(){
        assertEquals("park1", park.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(10, park.getRating());
    }
}
