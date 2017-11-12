package dream.factory.learning.collections.tree;


import java.util.Stack;

public class StringTree implements Tree<String> {
    private StringNode root;

    @Override
    public int size(){
        Stack<StringNode>  stack = new Stack<>();
        if (this.root == null){
            return 0;
        }

        stack.push(root);
        int size = 0;

        while (! stack.isEmpty()){
            StringNode node = stack.pop();
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

    public String inorder(StringNode node){
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
        StringNode node = new StringNode(s);
        if (root == null){
            root = node;
            return;
        }

        Stack<StringNode>  stack = new Stack<>();

        stack.push(root);
        while (!stack.empty()){
            StringNode popNode = stack.pop();
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
