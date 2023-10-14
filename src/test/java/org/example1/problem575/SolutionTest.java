package org.example1.problem575;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().distributeCandies(new int[] {1,1,2,2,3,3})).isEqualTo(3);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().distributeCandies(new int[] {1,1,2,3})).isEqualTo(2);
    }

    @Test
    void testThree() {
        assertThat(new Solution().distributeCandies(new int[] {6,6,6,6})).isEqualTo(1);
    }
}
