package dream.factory.learning.collections;

public class Queue {
    Lista queue = new Lista();

    public void enqueue(int input) {
        queue.addToFirst(input);
    }

    public Integer deqeueu() {
        return queue.removeLast();
    }

    public Integer size (){
        return queue.size();
    }

    @Override
    public String toString () {
        return queue.toString();
    }
}
