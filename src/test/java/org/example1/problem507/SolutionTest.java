package org.example1.problem507;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().checkPerfectNumber(28)).isTrue();
    }

    @Test
    void testTwo() {
        assertThat(new Solution().checkPerfectNumber(7)).isFalse();
    }
}
