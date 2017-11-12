package dream.factory.learning.collections.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringNodeTest {

    @Test
    public void create_newNode_OK() throws Exception {
        StringNode nePrazniKonstr = new StringNode("17");

        assertEquals("17", nePrazniKonstr.getValue());


    }

    @Test
    public void addNode_OK() throws Exception{
        StringNode node = new StringNode("first");

        node.addLeft("left");

        assertEquals("first", node.getValue());
        assertEquals("left", node.getLeftNode().getValue());

        node.getLeftNode().addRight("left right");
        node.addRight("right");


        assertEquals("left right", node.getLeftNode().getRightNode().getValue());
        assertEquals("right", node.getRightNode().getValue());


    }



}