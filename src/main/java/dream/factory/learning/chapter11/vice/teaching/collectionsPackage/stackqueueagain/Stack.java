package dream.factory.learning.chapter11.vice.teaching.collectionsPackage.stackqueueagain;


public class Stack {
    private int[] backingArray;
    private int count = -1;


    public Stack(int maxSize) {
        backingArray = new int[maxSize];
    }

    public Stack() {
        this(10);
    }

    public Integer pop(){
        if(count < 0){
            throw new RuntimeException("nema ničega");
        }

        int result = backingArray[count];
        backingArray[count]=0;
        count--;

        return result;
    }

    public void push (int input){
        if (count == backingArray.length){
            throw new RuntimeException("pun sam");
        }

        backingArray[count++ + 1] = input;
    }

    public Integer peek (){
        if(count < 0){
            throw new RuntimeException("nema ničega");
        }
        return backingArray[count];
    }

    @SuppressWarnings("Duplicates")
    public void remove(int input){
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
    public String toString(){
        if(backingArray[0] == 0){
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

    public int size(){
        return count + 1;
    }
}
