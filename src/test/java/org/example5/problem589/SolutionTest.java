package org.example5.problem589;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.example5.problem589.Solution.Node;
public class SolutionTest {

    @Test
    void testOne() {
        var node = new Node(1, List.of(new Node(3, List.of(new Node(5), new Node(6))),
                new Node(2), new Node(4)));
        assertThat(new Solution().preorder(node)).containsExactly(1,3,5,6,2,4);
    }
}
