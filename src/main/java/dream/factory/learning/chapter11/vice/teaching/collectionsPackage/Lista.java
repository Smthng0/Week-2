package dream.factory.learning.chapter11.vice.teaching.collectionsPackage;

public class Lista extends BaseLista {
    private Node tail = null;


    public void addToLast(int input) {
        if(head == null){
            this.head = new Node(input);
            tail = this.head;
            return;
        }

        Node novi = new Node(input);
        novi.setPreviousNode(tail);
        tail.setNextNode(novi);
        this.tail = tail.getNextNode();

    }

    public void addToFirst(int input){
        Node novi = new Node(input);
        novi.setNextNode(head);
        if(head != null){
            head.setPreviousNode(novi);
        }
        head = novi;

        if (head.getNextNode() == null){
            tail = head;
        }
    }


    public Node getLastNode () {
        if (head == null){
            return head;
        }

        return tail;
    }



    @Override
    public void add(int input) {
        addToLast(input);
    }

    @Override
    public void remove(int input) {
        //hm...?
    }

    public Integer removeFromHead(int input) {
        if(head == null){
            return null;
        }

        Node iterator = head;
        while (iterator.getNextNode() != null
                && iterator.getNextNode().getValue() != input){
            iterator = iterator.getNextNode();
        }

        if (iterator == null){
            return null;
        }
        Node toRemove = iterator;
        if (iterator.getPreviousNode() == null){
            head = iterator.getNextNode();
            head.setPreviousNode(null);
        } else{
            //
        }


        Node previousNode = iterator.getPreviousNode();
        Node nextNode = iterator.getNextNode();

        if (nextNode != null){
            previousNode.setNextNode(nextNode);
        } else {
            tail = previousNode;
        }


        nextNode.setPreviousNode(previousNode);


        return toRemove.getValue();
    }
}
