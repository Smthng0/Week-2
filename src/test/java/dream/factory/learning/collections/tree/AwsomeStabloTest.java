package dream.factory.learning.collections.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class AwsomeStabloTest {

    @Test
    public void megaTest_method() throws Exception {
        AwesomeStablo stablo = new AwesomeStablo();
        stablo.insert("x");
        stablo.insert("z");
        stablo.insert("y");
        stablo.insert("a");
        stablo.insert("b");

        System.out.println(stablo.size());
        System.out.println(stablo.inOrder());
    }
}