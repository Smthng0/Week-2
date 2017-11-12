package dream.factory.learning.collections.tree;

public class IntNode {
    private int value;
    private IntNode leftNode;
    private IntNode rightNode;

    public IntNode(int input){
        this.value = input;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(IntNode leftNode) {
        this.leftNode = leftNode;
    }

    public IntNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(IntNode rightNode) {
        this.rightNode = rightNode;
    }

    public void addLeft(int input){
        IntNode node = new IntNode(input);
        this.setLeftNode(node);
    }

    public void addRight(int input) {
        IntNode node = new IntNode(input);
        this.setRightNode(node);
    }
}
