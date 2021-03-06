package dream.factory.learning.collections.arraybacked;


import dream.factory.learning.collections.arraybacked.exceptions.StackEmptyException;
import dream.factory.learning.collections.arraybacked.exceptions.StackException;

public class Stack {
    private int[] backingArray;
    private int count = -1;

    public Stack(int maxSize) {
        backingArray = new int[maxSize];
    }

    public Stack() {
        this(10);
    }

    public boolean isEmpty() {
        return count < 0;
    }

    public Integer pop() throws StackException {
        if(isEmpty()){
            throw new StackEmptyException();
        }

        int result = backingArray[count];
        backingArray[count]=0;
        count--;

        return result;
    }

    public void push (int input) throws StackException{
        if (count == backingArray.length){
            throw new StackEmptyException();
        }

        backingArray[count++ + 1] = input;
    }

    public Integer peek() {
        if(isEmpty()){
            return null;
        }
        return backingArray[count];
    }

    //remove is here for learning purposes only
    public void remove(int input) throws StackException{
        if(isEmpty()){
            throw new StackEmptyException();
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

    @Override
    public String toString() {
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

    public int size() {
        return count + 1;
    }
}
