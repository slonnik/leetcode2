package org.example4.problem697;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().findShortestSubArray(new int[]{1,2,2,3,1})).isEqualTo(2);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().findShortestSubArray(new int[]{1,2,2,3,1,4,2})).isEqualTo(6);
    }

    @Test
    void testThree() {
        assertThat(new Solution().findShortestSubArray(new int[]{1})).isEqualTo(1);
    }
}
