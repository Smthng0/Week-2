package dream.factory.learning.collections.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntTreeTest {
    @Test
    public void size_insert_allOrder_OK() throws Exception {
        IntTree stablo = new IntTree();
        stablo.insert(5);
        stablo.insert(2);
        stablo.insert(1);
        stablo.insert(3);
        stablo.insert(6);


        assertEquals(5, stablo.size());
        assertEquals("1 2 3 5 6 ", stablo.inOrder());
        assertEquals("5 2 1 3 6 ", stablo.preOrder());
        assertEquals("1 3 2 6 5 ", stablo.postOrder());

    }

    @Test
    public void levels() throws Exception {
        IntTree stablo = new IntTree();
        stablo.insert(5);
        stablo.insert(2);
        stablo.insert(1);
        stablo.insert(3);
        stablo.insert(6);

        assertEquals(3, stablo.levels());

        stablo.insert(0);

        assertEquals(4, stablo.levels());

        stablo.insert(-2);

        assertEquals(5, stablo.levels());

        stablo.insert(4);

        assertEquals(5, stablo.levels());
    }

}