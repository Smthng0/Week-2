package dream.factory.learning.chapter11.vice.teaching.collectionsPackage.stackqueueagain;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    @Test(expected = RuntimeException.class)
    public void enqueue_OK() throws Exception {

        Queue queue = new Queue();

        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(5);

        assertEquals(3 , (int) queue.size());



        assertEquals(2 , (int) queue.deqeueu());
        assertEquals(2 , (int) queue.size());
        assertEquals(3 , (int) queue.deqeueu());
        assertEquals(5 , (int) queue.deqeueu());
        assertEquals(0 , (int) queue.deqeueu());
    }

    @Test
    public void deqeueu_OK() throws Exception {
    }

    @Test
    public void size_OK() throws Exception {
    }

    @Test
    public void toString_OK() throws Exception {
        Queue queue = new Queue(15);

        for (int i = 0; i < 13 ; i++){
            queue.enqueue(i);
        }

        assertEquals("0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10 -> 11 -> 12" , queue.toString());
        assertEquals(13 , (int) queue.size());
    }

}