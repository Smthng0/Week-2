package dream.factory.learning.chapter11.vice.teaching.collections;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KolekcijeTest {

    Kolekcije kolekcije = new Kolekcije ();

    @Test
    public void testIstina (){
        boolean ans = true;
        assertEquals(ans, true);
    }

    @Test
    public void testNijeIstina (){
        boolean ans = true;
        assertEquals(ans, false);
    }

}
