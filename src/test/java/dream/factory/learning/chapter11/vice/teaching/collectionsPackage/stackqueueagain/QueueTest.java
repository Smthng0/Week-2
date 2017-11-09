package dream.factory.learning.chapter11.vice.teaching.collectionsPackage.stackqueueagain;

import org.junit.Test;
import org.joda.time.Duration;
import org.joda.time.Instant;

import java.util.Random;

import static org.junit.Assert.*;

public class QueueTest {
    @Test(expected = RuntimeException.class)
    public void enqueue_dequeue_OK() throws Exception {

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
    public void enqueue_masu_OK() throws Exception {
        Queue queue = new Queue(1_000_000);
        Instant startTime = Instant.now();

        for (int i = 1; i <= 1_000_000; i++){
            queue.enqueue(i);
        }

        Instant endTime = Instant.now();
        Duration duration = new Duration(startTime, endTime);

        System.out.println(duration.getMillis() + " ms"); //malo mu je trebalo pa sam ostavio ms

    }

    @Test
    public void enqueue_dequeue_masu_OK() throws Exception {
        Queue queue = new Queue(1_000_000);
        Instant startTime = Instant.now();

        for (int i = 999_999; i >= 0; i--){
            queue.enqueue(i);
        }

        Instant endTime = Instant.now();
        Duration duration = new Duration(startTime, endTime);

        System.out.println(duration.getMillis() + " ms");

        Random removeStream = new Random();
        int pola = (int)((queue.size())/2);
        int [] removeArray = removeStream.ints(pola, 1, 1_000_000).toArray();

        startTime = Instant.now();

        for (int i = 0; i <= pola; i++){
            queue.deqeueu();
        }

        endTime = Instant.now();
        duration = new Duration(startTime, endTime);

        System.out.println((int)(duration.getMillis() / 1_000) + " s");

    }

    @Test
    public void remove_OK() throws Exception {
        Queue queue = new Queue(1_000_000);
        Instant startTime = Instant.now();

        for (int i = 999_999; i >= 0; i--){
            queue.enqueue(i);
        }

        Instant endTime = Instant.now();
        Duration duration = new Duration(startTime, endTime);

        System.out.println(duration.getMillis() + " ms");

        Random removeStream = new Random();
        int pola = queue.size()/2;
        int [] removeArray = removeStream.ints(pola, 1, 1_000_000).toArray();

        startTime = Instant.now();

        for (int i = 0; i < pola; i++){
            queue.remove(i);
        }

        endTime = Instant.now();
        duration = new Duration(startTime, endTime);

        System.out.println((int)(duration.getMillis() / 1_000) + " s");

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