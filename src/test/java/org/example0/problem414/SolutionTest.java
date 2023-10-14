package org.example0.problem414;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().thirdMax(new int[] {3,2,1})).isEqualTo(1);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().thirdMax(new int[] {1, 2})).isEqualTo(2);
    }

    @Test
    void testThree() {
        assertThat(new Solution().thirdMax(new int[] {2,2,3,1})).isEqualTo(1);
    }
}

