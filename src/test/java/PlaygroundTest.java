import Attraction.Playground;
import Park.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        playground = new Playground("playground1");
        visitor1 = new Visitor(10, 140, 10.10);
        visitor2 = new Visitor(30, 180, 20.10);
    }

    @Test
    public void hasName(){
        assertEquals("playground1", playground.getName());
    }

    @Test
    public void isAllowedUnder15(){
        assertEquals(true, playground.isAllowedTo(visitor1));
    }

    @Test
    public void isNotAllowedOver15(){
        assertEquals(false, playground.isAllowedTo(visitor2));
    }
}
