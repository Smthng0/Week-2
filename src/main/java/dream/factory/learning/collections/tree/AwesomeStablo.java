package dream.factory.learning.collections.tree;


import dream.factory.learning.collections.example.ViceInterface;
import dream.factory.learning.collections.exceptions.FraneCheckedException;

import java.util.Stack;

public class AwesomeStablo implements BinaryTree<String> {
    private Node root;

    @Override
    public int size(){
        Stack<Node>  stack = new Stack<>();
        if (this.root == null){
            return 0;
        }

        stack.push(root);
        int size = 0;

        while (! stack.isEmpty()){
            Node node = stack.pop();
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
        return 0;
    }

    @Override
    public String inOrder() {
        return inorder(root);
    }

    public String inorder(Node node){
        String result = node.getValue() + " ";

        if(node.getLeftNode() != null){
            result += inorder(node.getLeftNode());
        }

        if(node.getRightNode() != null){
            result += inorder(node.getRightNode());
        }

        return result;
    }

    @Override
    public String preOrder() {
        return "Frane je stablo";
    }

    @Override
    public String postOrder() {
        return "Frane tree-hugger";
    }

    @Override
    public void insert(String s) {
        Node node = new Node (s);
        if (root == null){
            root = node;
            return;
        }

        Stack<Node>  stack = new Stack<>();

        stack.push(root);
        while (!stack.empty()){
            Node popNode = stack.pop();
            if (popNode.getRightNode() == null){
                popNode.setRightNode(node);
                break;
            } else if (popNode.getLeftNode() == null){
                popNode.setLeftNode(node);
                break;
            } else {

                if (popNode.getRightNode() != null){
                    stack.push(popNode.getRightNode());
                } else if (popNode.getLeftNode() != null){
                    stack.push(popNode.getLeftNode());
                }

            }
        }

    }



}
