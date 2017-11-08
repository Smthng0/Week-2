package dream.factory.learning.chapter11.vice.teaching.collectionsPackage;

public class Lista extends BaseLista {


    public void addToLast(int input) {
        if(head == null){
            this.head = new Node(input);
            return;
        }

        Node iterator = head;
        while (iterator.getNextNode() != null){
            iterator = iterator.getNextNode();
        }

        Node novi = new Node(input);
        iterator.setNextNode(novi);
    }

    public void addToFirst(int input){
        Node novi = new Node(input);
        novi.setNextNode(head);
        head = novi;
    }

    public Node getLastNode () {
        if (head == null){
            return head;
        }

        return findLastNode2(head);
    }

    private Node findLastNode(Node node){
        if(node.getNextNode() == null){
            return node;
        }

        return findLastNode(node.getNextNode());
    }

    private Node findLastNode2(Node node){
        while (node.getNextNode() != null){
            node = node.getNextNode();
        }

        return node;
    }


    @Override
    public void add(int input) {
        //TODO: NAPIŠI
    }

    @Override
    public void remove(int input) {
        //TODO: NAPIŠI
    }
}
