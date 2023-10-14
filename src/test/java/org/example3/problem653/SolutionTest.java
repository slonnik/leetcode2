package org.example3.problem653;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.example3.problem653.Solution.TreeNode;

public class SolutionTest {

    @Test
    void testOne() {
        var node = new TreeNode(5, new TreeNode(3, new TreeNode(2), new TreeNode(4)), new TreeNode(6, null, new TreeNode(7)));

        assertThat(new Solution().findTarget(node, 9)).isTrue();
    }

    @Test
    void testTwo() {
        var node = new TreeNode(1);

        assertThat(new Solution().findTarget(node, 2)).isFalse();
    }

    @Test
    void testThree() {
        var node = new TreeNode(2, new TreeNode(0, new TreeNode(3), new TreeNode(-4)), new TreeNode(1 ));

        assertThat(new Solution().findTarget(node, -1)).isTrue();
    }
}
