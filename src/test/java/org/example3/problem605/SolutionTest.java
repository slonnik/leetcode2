package org.example3.problem605;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().canPlaceFlowers(new int[]{1,0,0,0,1}, 1)).isTrue();
    }

    @Test
    void testTwo() {
        assertThat(new Solution().canPlaceFlowers(new int[]{1,0,0,0,1}, 2)).isFalse();
    }

    @Test
    void testThree() {
        assertThat(new Solution().canPlaceFlowers(new int[]{0,1,0}, 1)).isFalse();
    }

}
