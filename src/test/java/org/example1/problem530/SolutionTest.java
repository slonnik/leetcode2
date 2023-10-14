package org.example1.problem530;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution()
                .getMinimumDifference(new Solution.TreeNode(4, new Solution.TreeNode(2, new Solution.TreeNode(1), new Solution.TreeNode(3)), new Solution.TreeNode(6))))
                .isEqualTo(1);
    }

    @Test
    void testTwo() {
        assertThat(new Solution()
                .getMinimumDifference(new Solution.TreeNode(1, new Solution.TreeNode(0), new Solution.TreeNode(48, new Solution.TreeNode(12), new Solution.TreeNode(49)))))
                .isEqualTo(1);
    }

    @Test
    void testThree() {
        var node = new Solution.TreeNode(236, new Solution.TreeNode(104, null, new Solution.TreeNode(227)), new Solution.TreeNode(701, null, new Solution.TreeNode(911)));
        assertThat(new Solution()
                .getMinimumDifference(node))
                .isEqualTo(9);
    }
}
