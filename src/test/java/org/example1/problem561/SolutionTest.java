package org.example1.problem561;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().arrayPairSum(new int[]{1,4,3,2})).isEqualTo(4);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().arrayPairSum(new int[]{6,2,6,5,1,2})).isEqualTo(9);
    }
}
