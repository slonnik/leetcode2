package org.example1.problem572;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.example1.problem572.Solution.TreeNode;

public class SolutionTest {

    @Test
    void testOne() {
        var inputNode = new TreeNode(3, new TreeNode(4, new TreeNode(1), new TreeNode(2, new TreeNode(0), null)), new TreeNode(5));
        var subTree = new TreeNode(4, new TreeNode(1), new TreeNode(2));
        assertThat(new Solution().isSubtree(inputNode, subTree)).isFalse();
    }

    @Test
    void testTwo() {
        var inputNode = new TreeNode(1, new TreeNode(1), null);
        var subTree = new TreeNode(1);
        assertThat(new Solution().isSubtree(inputNode, subTree)).isTrue();
    }
}
