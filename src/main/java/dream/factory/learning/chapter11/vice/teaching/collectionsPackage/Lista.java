package dream.factory.learning.chapter11.vice.teaching.collectionsPackage;

import java.util.Optional;

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
        Optional<Integer> integer = checkCornerCases(input);

        if(integer.isPresent()){
            return integer.get();
        }

        Node iterator = head;
        while (iterator.getNextNode() != null
                && iterator.getNextNode().getValue() != input){
            iterator = iterator.getNextNode();
        }

        update(iterator);

        return iterator.getValue();
    }

    public Integer removeLast(){
        if(tail == null){
            return null;
        }
        int value = tail.getValue();
        tail = tail.getPreviousNode();

        if(tail == null){
            head = null;
        } else {
            tail.setNextNode(null);
        }

        return value;
    }

    public Integer removeFromTail(int input) {
        Optional<Integer> integer = checkCornerCases(input);

        if(integer.isPresent()){
            return integer.get();
        }

        Node iterator = tail;
        while (iterator.getPreviousNode() != null
                && iterator.getValue() != input){
            iterator = iterator.getPreviousNode();
        }

        update(iterator);

        return iterator.getValue();
    }

    public String toStringTail() {
        if(tail == null){
            return "";
        }

        Node iterator = this.tail;
        StringBuilder result = new StringBuilder();
        result.append(iterator.getValue());

        while (iterator.getPreviousNode() != null){
            result.insert(0, " -> ");
            iterator = iterator.getPreviousNode();
            result = result.insert(0, iterator.getValue());
        }

        return result.toString();
    }

    private Optional<Integer> checkCornerCases(int input) {
        if(head == null || tail == null){
            return Optional.ofNullable(null);
        }

        if(tail == head
                && tail.getValue() == input){
            int value = head.getValue();
            tail = head = null;
            return Optional.of(value);
        }

        return Optional.empty();
    }

    private void update(Node iterator) {
        Node previousNode = iterator.getPreviousNode();
        Node nextNode = iterator.getNextNode();

        if(previousNode == null){
            head = nextNode;
            head.setPreviousNode(null);
        } else {
            previousNode.setNextNode(nextNode);
        }

        if (nextNode == null){
            tail = previousNode;
            tail.setNextNode(null);
        } else {
            nextNode.setPreviousNode(previousNode);
        }
    }


}
