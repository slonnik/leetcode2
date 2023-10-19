package org.example5.problem590;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.example5.problem590.Solution.Node;

public class SolutionTest {

    @Test
    void testOne() {
        var node = new Node(1, List.of(new Node(3, List.of(new Node(5), new Node(6))),
                new Node(2), new Node(4)));
        assertThat(new Solution().postorder(node)).containsExactly(5,6,3,2,4,1);
    }
}
