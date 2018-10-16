import Attraction.Rollercoaster;
import Park.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("rollercoaster1", 10);
        visitor1 = new Visitor(10, 140, 10.10);
        visitor2 = new Visitor(10, 150, 20.10);
        visitor3 = new Visitor(13, 140, 20.10);
        visitor4 = new Visitor(30, 210, 20.10);
    }

    @Test
    public void hasName(){
        assertEquals("rollercoaster1", rollercoaster.getName());
    }

    @Test
    public void isAlloedTrue(){
        assertEquals(true, rollercoaster.isAllowedTo(visitor4));
    }

    @Test
    public void isAlloedFalseUnderHeightAndAge(){
        assertEquals(false, rollercoaster.isAllowedTo(visitor1));
    }

    @Test
    public void isAlloedFalseUnderAge(){
        assertEquals(false, rollercoaster.isAllowedTo(visitor2));
    }

    @Test
    public void isAlloedFalseUnderHeight(){
        assertEquals(false, rollercoaster.isAllowedTo(visitor3));
    }

    @Test
    public void isAlloedFalse(){
        assertEquals(false, rollercoaster.isAllowedTo(visitor1));
    }

    @Test
    public void hasRating(){
        assertEquals(10, rollercoaster.getRating());
    }

    @Test
    public void hasPriceDefault(){
        assertEquals(8.40, rollercoaster.priceFor(visitor1), 0.01);
    }

    @Test
    public void hasPriceDouble(){
        assertEquals(16.80, rollercoaster.priceFor(visitor4), 0.01);
    }

}
