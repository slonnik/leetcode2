package org.example3.problem617;

import org.junit.jupiter.api.Test;
import static org.example3.problem617.Solution.TreeNode;

public class SolutionTest {

    @Test
    void testOne() {
        var node1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        var node2 = new TreeNode(7, new TreeNode(10), new TreeNode(15));
        var result = new Solution().mergeTrees(node1, node2);
    }
}
