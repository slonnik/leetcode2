package org.example6.problem783;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        var node = new Solution.TreeNode(4,
                new Solution.TreeNode(2, new Solution.TreeNode(1), new Solution.TreeNode(3)),
                new Solution.TreeNode(6));
        assertThat(new Solution().minDiffInBST(node)).isEqualTo(1);
    }

    @Test
    void testTwo() {
        var node = new Solution.TreeNode(1, new Solution.TreeNode(0),
                new Solution.TreeNode(48, new Solution.TreeNode(12), new Solution.TreeNode(49)));
        assertThat(new Solution().minDiffInBST(node)).isEqualTo(1);
    }
}
