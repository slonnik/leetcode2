package org.example3.problem606;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.example3.problem606.Solution.TreeNode;

public class SolutionTest {

    @Test
    void testOne() {
        var node = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
        assertThat(new Solution().tree2str(node)).isEqualTo("1(2(4))(3)");

    }

    @Test
    void testThree() {
        var node = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3));
        assertThat(new Solution().tree2str(node)).isEqualTo("1(2()(4))(3)");

    }

}
