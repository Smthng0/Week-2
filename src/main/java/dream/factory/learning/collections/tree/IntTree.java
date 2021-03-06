package dream.factory.learning.collections.tree;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Stack;

public class IntTree implements Tree<Integer>,  Iterable<IntNode> {
    private IntNode root;

    public IntTree() {
    }

    public IntTree(int root) {
        this.root = new IntNode(root);
    }

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

        return inorder(root);
    }

    public String inorder(IntNode node){
        String result = "";

        if(node.getLeftNode() != null){
            result += inorder(node.getLeftNode());
        }

        result += node.getValue() + " ";

        if(node.getRightNode() != null){
            result += inorder(node.getRightNode());
        }

        return result;
    }

    @Override
    public String preOrder() {
        if (root == null){
            return "";
        }

        return preorder(root);
    }

    public String preorder(IntNode node){
        String result = "";

        result += node.getValue() + " ";

        if(node.getLeftNode() != null){
            result += preorder(node.getLeftNode());
        }

        if(node.getRightNode() != null){
            result += preorder(node.getRightNode());
        }

        return result;
    }

    @Override
    public String postOrder() {
        if (root == null){
            return "";
        }

        return postorder(root);
    }

    public String postorder(IntNode node){
        String result = "";

        if(node.getLeftNode() != null){
            result += postorder(node.getLeftNode());
        }

        if(node.getRightNode() != null){
            result += postorder(node.getRightNode());
        }

        result += node.getValue() + " ";

        return result;
    }

    @Override
    public void insert(Integer input) {
        if (root == null) {
            root = new IntNode(input);
            return;
        }

        IntNode iterator = root;
        while (iterator.getLeftNode() != null
                || iterator.getRightNode() != null){

            if (input <= iterator.getValue()){

                if (iterator.getLeftNode() == null){
                    break;
                } else {
                    iterator = iterator.getLeftNode();
                }

            } else if (input > iterator.getValue()) {

                if (iterator.getRightNode() == null){
                    break;
                } else {
                    iterator = iterator.getRightNode();
                }

            }
        }

        if (input <= iterator.getValue()){
            iterator.addLeft(input);
        } else {
            iterator.addRight(input);
        }

    }

    public void remove(Integer input){
        if (root == null) {
            root = new IntNode(input);
            return;
        }

        // za vikend ako imam vremena, slozit nekakav remove
        return;
    }

    @Override
    public Iterator<IntNode> iterator() {
        return new MyTreeIterator(root);
    }

    private class MyTreeIterator
            implements Iterator<IntNode> {
        private ArrayDeque<IntNode> queue = new ArrayDeque();

        public MyTreeIterator(IntNode root) {
            queue.add(root);
        }

        @Override
        public boolean hasNext() {
            return ! queue.isEmpty();
        }

        @Override
        public IntNode next() {
            IntNode node = queue.remove();

            if (node.getLeftNode()!= null){
                queue.add(node.getLeftNode());
            }

            if (node.getRightNode()!= null){
                queue.add(node.getRightNode());
            }

            return node;
        }
    }
}
