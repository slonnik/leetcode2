package org.example1.problem563;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.example1.problem563.Solution.TreeNode;

public class SolutionTest {

    @Test
    void testOne() {
        var node = new Solution.TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertThat(new Solution().findTilt(node)).isEqualTo(1);
    }

    @Test
    void testTwo() {
        var node = new Solution.TreeNode(4, new TreeNode(2, new TreeNode(3), new TreeNode(5)),
                new TreeNode(9, null, new TreeNode(7)));
        assertThat(new Solution().findTilt(node)).isEqualTo(15);
    }
}
