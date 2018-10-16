import Attraction.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;

    @Before
    public void before(){
        playground = new Playground("playground1");
    }

    @Test
    public void hasName(){
        assertEquals("playground1", playground.getName());
    }
}
