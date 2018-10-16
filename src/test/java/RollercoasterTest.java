import Attraction.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("rollercoaster1");
    }

    @Test
    public void hasName(){
        assertEquals("rollercoaster1", rollercoaster.getName());
    }
}
