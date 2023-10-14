package org.example4.problem671;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.example4.problem671.Solution.TreeNode;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    void testOne() {
        var node = new TreeNode(2, new TreeNode(2), new TreeNode(5, new TreeNode(5), new TreeNode(7)));
        assertThat(new Solution().findSecondMinimumValue(node)).isEqualTo(5);
    }

    @Test
    void testTwo() {
        var node = new TreeNode(2, new TreeNode(2), new TreeNode(2));
        assertThat(new Solution().findSecondMinimumValue(node)).isEqualTo(-1);
    }

    @Test
    void testThree() {
        var node = new TreeNode(5, new TreeNode(5), new TreeNode(6));
        assertThat(new Solution().findSecondMinimumValue(node)).isEqualTo(6);
    }

    @Test
    void testFour() {
        var node = new TreeNode(2, new TreeNode(2), new TreeNode(2147483647));
        assertThat(new Solution().findSecondMinimumValue(node)).isEqualTo(2147483647);
    }

}
