package dream.factory.learning.collections.tree;

public interface Tree<T> {
    int size();
    int levels();
    String inOrder();
    String preOrder();
    String postOrder();
    void insert(T t);
}
