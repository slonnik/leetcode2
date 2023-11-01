package org.example6.problem700;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        var node = new Solution.TreeNode(4,new Solution.TreeNode(2, new Solution.TreeNode(1),
                new Solution.TreeNode(3)),new Solution.TreeNode(7));
        assertThat(new Solution().searchBST(node, 2).val).isEqualTo(2);
    }
}
