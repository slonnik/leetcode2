package org.example3.problem643;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4)).isEqualTo(12.75);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().findMaxAverage(new int[]{5}, 1)).isEqualTo(5);
    }
}

