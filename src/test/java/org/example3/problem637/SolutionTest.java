package org.example3.problem637;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.example3.problem637.Solution.TreeNode;

public class SolutionTest {

    @Test
    void testOne() {
        var node = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertThat(new Solution().averageOfLevels(node)).containsExactlyInAnyOrder(3.0, 14.5, 11.0);
    }

    @Test
    void testTwo() {
        var node = new TreeNode(3, new TreeNode(9, new TreeNode(15), new TreeNode(7)), new TreeNode(20));
        assertThat(new Solution().averageOfLevels(node)).containsExactlyInAnyOrder(3.0, 14.5, 11.0);
    }
}
