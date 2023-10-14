package org.example5.problem724;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().pivotIndex(new int[] {1,7,3,6,5,6})).isEqualTo(3);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().pivotIndex(new int[] {1,2,3})).isEqualTo(-1);
    }

    @Test
    void testFour() {
        assertThat(new Solution().pivotIndex(new int[] {2,-1,1})).isEqualTo(0);
    }

    @Test
    void testFive() {
        assertThat(new Solution().pivotIndex(new int[] {-1,1, 2})).isEqualTo(2);
    }
}
