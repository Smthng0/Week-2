package dream.factory.learning.chapter11.vice.teaching.collections;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {
    @Test
    public void newNode_notNull() throws Exception {
        Node node = new Node(1);

        assertNotEquals(null, node);
        assertEquals(node.size(), 1);
    }

    @Test
    public void testAdd_newList(){
        Node node = new Node (4);
        node.addToLast(4);

        assertEquals(node.size(), 2);
    }

    @Test
    public void print_list(){
        Node node = new Node(2);

        assertEquals("2", node.toString());

        node.addToLast(3);

        assertEquals("2 -> 3", node.toString());
    }

    @Test
    public void print_uuugelist(){
        Node node = new Node(2);

        for(int i = 0; i < 100_000; i++){
            node.addToLast(i);
        }

        assertTrue(node.size() == 100_001);
    }

    @Test
    public void print_ugelist(){
        Node node = new Node(0);

        for(int i = 1; i < 10; i++){
            node.addToLast(i);
            System.out.println(node.toString());
        }

        assertTrue(node.size() == 10);
    }

    @Test
    public void print_uugelist(){
        Node node = new Node(2);

        for(int i = 0; i < 100_000; i++){
            node.addAssFirst(i);
        }

        assertEquals(100_001, node.size());
    }

    @Test
    public void print_pudgelist(){
        Node root = new Node(0);

        for(int i = 1; i < 10; i++){
            System.out.println(root.toString());
            root = root.addAssFirst(i);
        }


    }
}