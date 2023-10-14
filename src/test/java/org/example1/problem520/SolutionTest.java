package org.example1.problem520;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().detectCapitalUse("USA")).isTrue();
    }

    @Test
    void testTwo() {
        assertThat(new Solution().detectCapitalUse("FlaG")).isFalse();
    }

    @Test
    void testThree() {
        assertThat(new Solution().detectCapitalUse("leetcode")).isTrue();
    }

    @Test
    void testFour() {
        assertThat(new Solution().detectCapitalUse("Google")).isTrue();
    }

    @Test
    void testFive() {
        assertThat(new Solution().detectCapitalUse("mL")).isFalse();
    }
}
