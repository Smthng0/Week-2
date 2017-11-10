package dream.factory.learning.collections.tree;

public class Node {
    private String value;
    private Node leftNode;
    private Node rightNode;

    public Node (String input){
        this.value = input;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public void addLeft(String input){
        Node node = new Node(input);

        /*
        if (isHead(root)){
            return;
        }
         isto ko doli...*/

        this.setLeftNode(node);
    }

    public void addRight(String input){
        Node node = new Node(input);

        /*
        if (isHead(input)){
            return;
        }
           trebam tu dodat provjeru za head (ako nema head, onda novi node postaje head) */

        this.setRightNode(node);
    }
}
