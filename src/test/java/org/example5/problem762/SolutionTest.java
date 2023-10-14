package org.example5.problem762;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
         assertThat(new Solution().countPrimeSetBits(6, 10)).isEqualTo(4);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().countPrimeSetBits(10, 15)).isEqualTo(5);
    }
}
