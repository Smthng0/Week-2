package dream.factory.learning.collections.tree;

import org.junit.Test;

public class StringTreeTest {

    @Test
    public void megaTest_method() throws Exception {
        StringTree stablo = new StringTree();
        stablo.insert("x");
        stablo.insert("z");
        stablo.insert("y");
        stablo.insert("a");
        stablo.insert("b");

        System.out.println(stablo.size());
        System.out.println(stablo.inOrder());
    }
}