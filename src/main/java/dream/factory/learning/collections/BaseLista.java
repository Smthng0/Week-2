package dream.factory.learning.collections;

public abstract class BaseLista implements BaseCollection {
    protected Node head = null;
    public boolean isEmpty(){
        return head == null;
    }

    public int size() {
        int x = 0;
        Node iterator = this.head;

        while (iterator != null){
            iterator = iterator.getNextNode();
            x++;
        }

        return x;
    }

    @Override
    public String toString() {
        if(head == null){
            return "";
        }

        Node iterator = this.head;
        StringBuilder result = new StringBuilder();
        result.append(iterator.getValue());

        while (iterator.getNextNode() != null){
            result.append(" -> ");
            iterator = iterator.getNextNode();
            result = result.append(iterator.getValue());
        }

        return result.toString();
    }

    public Node getFirstNode() {
        return head;
    }
}
