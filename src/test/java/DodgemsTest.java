import Attraction.Dodgems;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {
    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("dodgems1");
    }

    @Test
    public void hasName(){
        assertEquals("dodgems1", dodgems.getName());
    }
}
