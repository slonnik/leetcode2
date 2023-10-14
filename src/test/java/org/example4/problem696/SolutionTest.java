package org.example4.problem696;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().countBinarySubstrings("00110011")).isEqualTo(6);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().countBinarySubstrings("10101")).isEqualTo(4);
    }

    @Test
    void testThree() {
        assertThat(new Solution().countBinarySubstrings("00100")).isEqualTo(2);
    }
}
