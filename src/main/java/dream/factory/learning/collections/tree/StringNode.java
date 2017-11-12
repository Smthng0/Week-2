package dream.factory.learning.collections.tree;

public class StringNode {
    private String value;
    private StringNode leftNode;
    private StringNode rightNode;

    public StringNode(String input){
        this.value = input;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public StringNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(StringNode leftNode) {
        this.leftNode = leftNode;
    }

    public StringNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(StringNode rightNode) {
        this.rightNode = rightNode;
    }

    public void addLeft(String input){
        StringNode node = new StringNode(input);

        /*
        if (isHead(root)){
            return;
        }
         isto ko doli...*/

        this.setLeftNode(node);
    }

    public void addRight(String input){
        StringNode node = new StringNode(input);

        /*
        if (isHead(input)){
            return;
        }
           trebam tu dodat provjeru za head (ako nema head, onda novi node postaje head) */

        this.setRightNode(node);
    }
}
