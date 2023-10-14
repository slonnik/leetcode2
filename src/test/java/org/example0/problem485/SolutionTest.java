package org.example0.problem485;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1})).isEqualTo(3);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1})).isEqualTo(2);
    }
}

