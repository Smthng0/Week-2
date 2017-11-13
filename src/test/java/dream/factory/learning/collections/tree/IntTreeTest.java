package dream.factory.learning.collections.tree;

import org.junit.Test;

import java.util.Iterator;

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
    public void nesto(){
        IntTree tree = new IntTree(5);
                tree.insert(4);
        tree.insert(7);
        tree.insert(6);
        tree.insert(8);

        Iterator<IntNode> iterator = tree.iterator();

        StringBuilder builder = new StringBuilder();
        builder.append(iterator.next().getValue());

        for (IntTree it = tree; iterator.hasNext(); ) {
            builder.append(" -> ");
            IntNode node = iterator.next();
            builder.append(node.getValue());
        }

        assertEquals("5 -> 4 -> 7 -> 6 -> 8", builder.toString());
    }

    @Test
    public void nesto_foreach(){
        IntTree tree = new IntTree(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(6);
        tree.insert(8);

        StringBuilder builder = new StringBuilder();

        for (IntNode intNode : tree) {
            builder.append(" ")
                    .append(intNode.getValue());
        }

        builder.append(System.getProperty("line.separator"));
        tree.insert(2);
        tree.insert(4);

        for (IntNode intNode : tree) {
            builder.append(" ")
                    .append(intNode.getValue());
        }

        System.out.println(builder.toString());
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