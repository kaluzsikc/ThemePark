import Attraction.Dodgems;
import Park.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {
    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        dodgems = new Dodgems("dodgems1", 10);
        visitor1 = new Visitor(10, 140, 10.10);
        visitor2 = new Visitor(30, 180, 20.10);
    }

    @Test
    public void hasName(){
        assertEquals("dodgems1", dodgems.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(10, dodgems.getRating());
    }

    @Test
    public void hasDefaultPriceOver12(){
        assertEquals(4.50, dodgems.priceFor(visitor2), 0.01);
    }

    @Test
    public void hasDefaultPriceUnder12(){
        assertEquals(2.25, dodgems.priceFor(visitor1), 0.01);
    }
}
