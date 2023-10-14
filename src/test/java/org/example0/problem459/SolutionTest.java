package org.example0.problem459;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().repeatedSubstringPattern("abab")).isTrue();
    }

    @Test
    void testTwo() {
        assertThat(new Solution().repeatedSubstringPattern("ababab")).isTrue();
    }

    @Test
    void testThree() {
        assertThat(new Solution().repeatedSubstringPattern("aba")).isFalse();
    }

    @Test
    void testFour() {
        assertThat(new Solution().repeatedSubstringPattern("abcabcabcabc")).isTrue();
    }
}
