package dream.factory.learning.collections;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void pop_OK() {
        Stack stack = new Stack();

        stack.push(3);
        stack.pop();

        assertEquals(0, stack.size());
    }

    @Test
    public void push_OK() {
        Stack stack = new Stack();

        stack.push(3);
        stack.push(2);
        stack.push(5);

        assertEquals(3, stack.size());

    }

    @Test
    public void peek_OK() {
        Stack stack = new Stack();

        assertEquals(null, stack.peek());
        assertEquals(null, stack.pop());
    }

    @Test
    public void toString_OK() {
        Stack stack = new Stack();

        stack.push(3);
        stack.push(2);
        stack.push(5);

        assertEquals("3 -> 2 -> 5", stack.toString());

        stack.pop();
        assertEquals("3 -> 2", stack.toString());

        stack.pop();
        assertEquals("3", stack.toString());

        stack.pop();
        assertEquals("", stack.toString());
    }

    @Test
    public void size_OK() {

        Stack stack = new Stack();

        stack.push(3);
        stack.push(2);
        stack.push(4);
        stack.push(5);

        assertEquals(4, stack.size());
    }

}