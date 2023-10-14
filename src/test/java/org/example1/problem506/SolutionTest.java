package org.example1.problem506;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {

        assertThat(new Solution().findRelativeRanks(new int[]{10,3,8,9,4}))
                .containsExactly("Gold Medal","5","Bronze Medal","Silver Medal","4");
    }

    @Test
    void testTwo() {

        assertThat(new Solution().findRelativeRanks(new int[]{5,4,3,2,1}))
                .containsExactly("Gold Medal","Silver Medal","Bronze Medal","4","5");
    }
}
