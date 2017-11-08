package dream.factory.learning.chapter11.vice.teaching.collectionsPackage.stackqueueagain;

public class Queue {
    private int[] backingArray;

    public Queue(int maxSize) {
        backingArray = new int[maxSize];
    }

    public Queue() {
        this(10);
    }


}
