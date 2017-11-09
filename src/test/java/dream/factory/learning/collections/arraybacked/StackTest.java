package dream.factory.learning.collections.arraybacked;

import org.junit.Test;
import org.joda.time.Duration;
import org.joda.time.Instant;

import java.util.Random;

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

        stack.pop(); //tu bude exception

    }

    @Test
    public void pop_masu_OK() throws Exception {
        Stack stack = new Stack(1_000_000);
        Instant startTime = Instant.now();

        for (int i = 1; i <= 1_000_000; i++){
            stack.push(i);
        }

        Instant endTime = Instant.now();
        Duration duration = new Duration(startTime, endTime);

        System.out.println(duration.getMillis() + " ms"); //malo mu je trebalo pa sam ostavio ms

    }

    @Test
    public void pop_push_masu_OK() throws Exception {
        Stack stack = new Stack(1_000_000);
        Instant startTime = Instant.now();

        for (int i = 1_000_000; i > 0; i--){
            stack.push(i);
        }

        Instant endTime = Instant.now();
        Duration duration = new Duration(startTime, endTime);

        System.out.println(duration.getMillis() + " ms");

        Random removeStream = new Random();
        int pola = (int)((stack.size())/2);
        int [] removeArray = removeStream.ints(pola, 1, 1_000_000).toArray();

        startTime = Instant.now();

        for (int i = 1; i <= pola; i++){
            stack.pop();
        }

        endTime = Instant.now();
        duration = new Duration(startTime, endTime);

        System.out.println(duration.getMillis() + " ms");

    }

    @Test
    public void remove_OK() throws Exception {
        Stack stack = new Stack(1_000_000);
        Instant startTime = Instant.now();

        for (int i = 1_000_000; i > 0; i--){
            stack.push(i);
        }

        Instant endTime = Instant.now();
        Duration duration = new Duration(startTime, endTime);

        System.out.println(duration.getMillis() + " ms");

        Random removeStream = new Random();
        int pola = stack.size()/2;
        int [] removeArray = removeStream.ints(pola, 1, 1_000_000).toArray();

        startTime = Instant.now();

        for (int i = 0; i < pola; i++){
            stack.remove(removeArray[i]);
        }

        endTime = Instant.now();
        duration = new Duration(startTime, endTime);

        System.out.println(duration.getMillis() + " ms");

    }

    @Test
    public void exception_OK() throws Exception {
        Stack stack = new Stack(1_000_000);
        Instant startTime = Instant.now();

        for (int i = 1_000_000; i > 0; i--){
            stack.push(i);
        }

        Instant endTime = Instant.now();
        Duration duration = new Duration(startTime, endTime);

        System.out.println(duration.getMillis() + " ms");

        Random removeStream = new Random();
        int pola = stack.size()/2;
        int [] removeArray = removeStream.ints(pola, 1, 1_000_000).toArray();

        startTime = Instant.now();

        for (int i = 0; i < pola; i++){
            stack.remove(removeArray[i]);
        }

        endTime = Instant.now();
        duration = new Duration(startTime, endTime);

        System.out.println(duration.getMillis() + " ms");

    }


}