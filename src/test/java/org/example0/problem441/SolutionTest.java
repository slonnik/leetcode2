package org.example0.problem441;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().arrangeCoins(5)).isEqualTo(2);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().arrangeCoins(8)).isEqualTo(3);
    }

    @Test
    void testThree() {
        assertThat(new Solution().arrangeCoins(1804289383)).isEqualTo(3);
    }

    @Test
    void testFour() {
        assertThat(new Solution().arrangeCoins(6)).isEqualTo(3);
    }


}
