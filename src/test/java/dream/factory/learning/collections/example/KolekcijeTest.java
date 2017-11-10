package dream.factory.learning.collections.example;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KolekcijeTest {

    Kolekcije kolekcije = new Kolekcije ();

    @Test
    public void testIstina (){
        boolean ans = true;
        assertEquals(ans, true);
    }

    @Test (expected = AssertionError.class)
    public void testNijeIstina (){
        boolean ans = true;
        assertEquals(ans, false);
    }

}
