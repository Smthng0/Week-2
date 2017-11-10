package dream.factory.learning.collections;

import dream.factory.learning.collections.arraybacked.Queue;
import dream.factory.learning.collections.arraybacked.Stack;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Random;

public class RemoveRandomPolaTests {

    @Ignore
    @Test
    public void remove_stack_OK() throws Exception {
        Stack stack = new Stack(1_000_000);
        Instant startTime = Instant.now();

        for (int i = 1_000_000; i > 0; i--) {
            stack.push(i);
        }

        Instant endTime = Instant.now();
        Duration duration = new Duration(startTime, endTime);

        System.out.println(duration.getMillis() + " ms");

        Random removeStream = new Random();
        int pola = stack.size() / 2;
        int[] removeArray = removeStream.ints(pola, 1, 1_000_000).toArray();

        startTime = Instant.now();

        for (int i = 0; i < pola; i++) {
            stack.remove(removeArray[i]);
        }

        endTime = Instant.now();
        duration = new Duration(startTime, endTime);

        System.out.println((int) (duration.getMillis() / 1_000) + " s");

    }

    @Ignore
    @Test
    public void remove_queue_OK() throws Exception {
        Queue queue = new Queue(1_000_000);
        Instant startTime = Instant.now();

        for (int i = 999_999; i >= 0; i--) {
            queue.enqueue(i);
        }

        Instant endTime = Instant.now();
        Duration duration = new Duration(startTime, endTime);

        System.out.println(duration.getMillis() + " ms");

        Random removeStream = new Random();
        int pola = queue.size() / 2;
        int[] removeArray = removeStream.ints(pola, 1, 1_000_000).toArray();

        startTime = Instant.now();

        for (int i = 0; i < pola; i++) {
            queue.remove(removeArray[i]);
        }

        endTime = Instant.now();
        duration = new Duration(startTime, endTime);

        System.out.println((int) (duration.getMillis() / 1_000) + " s");

    }

    @Ignore
    @Test
    public void remove_list_OK() throws Exception {
        SortedLinkedList lista = new SortedLinkedList();
        Instant startTime = Instant.now();

        for (int i = 999_999; i >= 0; i--){
            lista.add(i);
        }

        Instant endTime = Instant.now();
        Duration duration = new Duration(startTime, endTime);

        System.out.println(duration.getMillis() + " ms");

        Random removeStream = new Random();
        int pola = lista.size()/2;
        int [] removeArray = removeStream.ints(pola, 1, 1_000_000).toArray();

        startTime = Instant.now();

        for (int i = 0; i < pola; i++){
            lista.remove(removeArray[i]);
        }

        endTime = Instant.now();
        duration = new Duration(startTime, endTime);

        System.out.println((int) (duration.getMillis() / 1_000) + " s");

    }

}
