package dream.factory.learning.chapter11.vice.teaching.collectionsPackage;

public class SortedLinkedList extends BaseLista {

    @Override
    public void add(int input) {

        if(head == null){
            this.head = new Node(input);
            return;
        }

        if (head.getNextNode() != null && head.getNextNode().getValue() > input){
            Node novi = new Node(input);
            novi.setNextNode(head);
            head = novi;
            return;
        }

        Node iterator = head;

        while (iterator.getNextNode() != null && iterator.getNextNode().getValue() < input){
            iterator = iterator.getNextNode();
        }

        Node novi = new Node(input);
        novi.setNextNode(iterator.getNextNode());
        iterator.setNextNode(novi);

    }

    @Override
    public void remove(int input) {
        while (head != null
                && head.getValue() == input){
            head = head.getNextNode();
        }

        if(head == null){
            return;
        }

        Node iterator = head;

        while (iterator.getNextNode() != null
                && iterator.getNextNode().getValue() < input){
            iterator = iterator.getNextNode();
        }

        while (iterator.getNextNode() != null
                && iterator.getNextNode().getValue() == input){
            iterator.setNextNode(iterator.getNextNode().getNextNode());
            iterator.setNextNode(iterator.getNextNode());
        }
    }

}
