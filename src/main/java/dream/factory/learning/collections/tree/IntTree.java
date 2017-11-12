package dream.factory.learning.collections.tree;

import java.util.Stack;

public class IntTree implements Tree<Integer> {
    private IntNode root;
    private String string;


    @Override
    public int size() {
        Stack<IntNode> stack = new Stack<>();
        if (this.root == null){
            return 0;
        }

        stack.push(root);
        int size = 0;

        while (!stack.isEmpty()){
            IntNode node = stack.pop();
            size++;

            if (node.getRightNode() != null){
                stack.push(node.getRightNode());
            }

            if (node.getLeftNode() != null){
                stack.push(node.getLeftNode());
            }

        }

        return size;
    }

    @Override
    public int levels() {
        if (root == null){
            return 0;
        }

        return height(root);
    }

    public int height(IntNode node) {

        if (node == null) {
            return 0;
        }

        int left = height(node.getLeftNode());
        int right = height(node.getRightNode());

        if (left > right) {
            return (left + 1);
        }
        else {
            return(right+1);
        }

    }


    @Override
    public String inOrder() {
        if (root == null){
            return "";
        }

        string = "";

        return inorder(root);
    }

    public String inorder(IntNode node){

        if(node.getLeftNode() != null){
            string = inorder(node.getLeftNode());
        }

        string += node.getValue() + " ";

        if(node.getRightNode() != null){
            string = inorder(node.getRightNode());
        }

        return string;
    }

    @Override
    public String preOrder() {
        if (root == null){
            return "";
        }

        string = "";

        return preorder(root);
    }

    public String preorder(IntNode node){

        string += node.getValue() + " ";

        if(node.getLeftNode() != null){
            string = preorder(node.getLeftNode());
        }

        if(node.getRightNode() != null){
            string = preorder(node.getRightNode());
        }

        return string;
    }

    @Override
    public String postOrder() {
        if (root == null){
            return "";
        }

        string = "";

        return postorder(root);
    }

    public String postorder(IntNode node){

        if(node.getLeftNode() != null){
            string = postorder(node.getLeftNode());
        }

        if(node.getRightNode() != null){
            string = postorder(node.getRightNode());
        }

        string += node.getValue() + " ";

        return string;
    }

    @Override
    public void insert(Integer i) {
        if (root == null) {
            root = new IntNode(i);
            return;
        }

        IntNode iterator = root;
        while (iterator.getLeftNode() != null
                || iterator.getRightNode() != null){
            if (i <= iterator.getValue()){
                if (iterator.getLeftNode() == null){
                    iterator.addLeft(i);
                    return;
                } else {
                    iterator = iterator.getLeftNode();
                }
            } else if (i > iterator.getValue()) {
                if (iterator.getRightNode() == null){
                    iterator.addRight(i);
                    return;
                } else {
                    iterator = iterator.getRightNode();
                }
            }
        }

        if (i <= iterator.getValue()){
            iterator.addLeft(i);
        } else {
            iterator.addRight(i);
        }

    }
}
