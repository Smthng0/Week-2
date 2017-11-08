package dream.factory.learning.chapter11.vice.teaching.collectionsPackage.stackqueueagain;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    @Test (expected = RuntimeException.class)
    public void pop_and_push_OK() {
        Stack stack = new Stack();

        stack.push(5);
        stack.push(7);
        stack.push(2);

        assertEquals("5 -> 7 -> 2", stack.toString());
        assertEquals(3, stack.size());


        stack.pop();
        stack.pop();

        assertEquals("5",stack.toString());
        assertEquals(1, stack.size());

        stack.pop();

        assertEquals("",stack.toString());
        assertEquals(0, stack.size());

        stack.pop();

    }

    @Test
    public void peek() throws Exception {
    }

}