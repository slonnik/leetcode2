package org.example4.problem693;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().hasAlternatingBits(5)).isTrue();
    }

    @Test
    void testTwo() {
        assertThat(new Solution().hasAlternatingBits(7)).isFalse();
    }
}
