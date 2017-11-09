package dream.factory.learning.collections.arraybacked;

import dream.factory.learning.collections.arraybacked.exceptions.QueueEmptyException;
import dream.factory.learning.collections.arraybacked.exceptions.QueueException;
import dream.factory.learning.collections.arraybacked.exceptions.QueueFullException;

public class Queue{
    private int[] backingArray;
    private int count = -1;

    public Queue(int maxSize) {
        backingArray = new int[maxSize];
    }

    public Queue() {
        this(10);
    }

    public boolean isEmpty() {
        return count < 0;
    }

    public void enqueue(int input) throws QueueException {
        if (count == backingArray.length){
            throw new QueueFullException();
        }

        backingArray[count++ + 1] = input;
    }

    public Integer deqeueu() throws QueueException{
        if(isEmpty()){
            throw new QueueEmptyException();
        }

        int result = backingArray[0];
        int i = 0;
        while (i < count){
            backingArray[i] = backingArray[i+1];
            i++;
        }

        count--;

        return result;
    }

    //remove is here for learning purposes only
    public void remove(int input) throws QueueException{
        if(isEmpty()){
            throw new QueueEmptyException();
        }

        int i = 0;

        while (backingArray[i] != input
                && i < count){
            i++;
        }

        if (backingArray[i] != input){
            return;
        }

        while (i < count) {
            backingArray[i] = backingArray [i+1];
            i++;
        }

        if (i+1 == count) {
            backingArray[i] = 0;
        }

        count--;
    }

    public Integer size() {
        return count + 1;
    }

    @Override
    public String toString () {
        if(isEmpty()){
            return "";
        }

        StringBuilder result = new StringBuilder();
        int i = 0;
        result.append(backingArray[i]);

        while (i < count){
            result.append(" -> ");
            i++;
            result = result.append(backingArray[i]);
        }

        return result.toString();
    }

}
