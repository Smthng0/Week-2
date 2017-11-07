package dream.factory.learning.chapter11.vice.teaching.collectionsPackage;

public class FraninaLista {
    protected Node root = null;

    public void addToLast(int input) {
        if(root == null){
            this.root = new Node(input);
            return;
        }

        Node iterator = root;
        while (iterator.getNextNode() != null){
            iterator = iterator.getNextNode();
        }

        Node novi = new Node(input);
        iterator.setNextNode(novi);
    }

    public void addToFirst(int input){
        Node novi = new Node(input);
        novi.setNextNode(root);
        root = novi;
    }

    public int size() {
        int x = 0;
        Node iterator = this.root;

        while (iterator != null){
            iterator = iterator.getNextNode();
            x++;
        }

        return x;
    }

    public Node getLastNode () {
        if (root == null){
            return root;
        }

        return findLastNode2(root);
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
    public String toString() {
        if(root == null){
            return "";
        }

        Node iterator = this.root;
        StringBuilder result = new StringBuilder();
        result.append(iterator.getValue());

        while (iterator.getNextNode() != null){
            result.append(" -> ");
            iterator = iterator.getNextNode();
            result = result.append(iterator.getValue());
        }

        return result.toString();
    }

}
