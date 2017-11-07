package dream.factory.learning.chapter11.vice.teaching.collections;

public class Node implements ViceInterface {

    private int value;
    private Node nextNode;

    public Node(int value) {
        this.value = value;
    }

    @Override
    public void add(int input) {
        Node iterator = this;
        while (iterator != null){
            iterator = iterator.nextNode;
        }
    }

    public void addToLast(int input) {
        Node iterator = this;
        while (iterator.nextNode != null){
            iterator = iterator.nextNode;
        }

        Node novi= new Node(input);
        iterator.nextNode = novi;
    }

    public Node addAssFirst(int input){
        Node newRoot = new Node(input);
        newRoot.nextNode = this;
        return newRoot;

    }

    @Override
    public void remove(int input) {

    }

    public int size() {
        int x = 0;
        Node iterator = this;

        while (iterator != null){
            iterator = iterator.nextNode;
            x++;
        }

        return x;
    }

    public void print(){

    }

    @Override
    public String toString() {
        Node iterator = this;
        StringBuilder result = new StringBuilder();
        result.append(iterator.value);

        while (iterator.nextNode != null){
            result.append(" -> ");
            iterator = iterator.nextNode;
            result = result.append(iterator.value);
        }

        return result.toString();
    }
}
