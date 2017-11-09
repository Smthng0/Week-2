package dream.factory.learning.collections;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    @Test
    public void enqueue() throws Exception {
        Queue queue = new Queue();

        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(3);

        assertEquals(3 , (int) queue.size());



        assertEquals(5 , (int) queue.deqeueu());
        assertEquals(2 , (int) queue.size());
        assertEquals(3 , (int) queue.deqeueu());
        assertEquals(3 , (int) queue.deqeueu());
        assertEquals(null , queue.deqeueu());
    }

    @Test
    public void deqeueu() throws Exception {
        Queue queue = new Queue();
        for(int i = 0; i < 10; i++){
            queue.enqueue(i);
        }

        System.out.println(queue.toString());
    }

}