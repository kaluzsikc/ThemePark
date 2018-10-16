import Attraction.Park;
import Attraction.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("park1");
    }

    @Test
    public void hasName(){
        assertEquals("park1", park.getName());
    }
}
