package org.example4.problem674;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().findLengthOfLCIS(new int[]{1,3,5,4,7})).isEqualTo(3);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().findLengthOfLCIS(new int[]{2,2,2,2})).isEqualTo(1);
    }

    @Test
    void testThree() {
        assertThat(new Solution().findLengthOfLCIS(new int[]{1,3,5,7})).isEqualTo(4);
    }
}
