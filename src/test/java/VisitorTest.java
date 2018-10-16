import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {
    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(10, 140, 10);
    }

    @Test
    public void hasAge(){
        assertEquals(10, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(140, visitor.getHeight());
    }

    @Test
    public void hasMoney(){
        assertEquals(10, visitor.getMoney());
    }
}
