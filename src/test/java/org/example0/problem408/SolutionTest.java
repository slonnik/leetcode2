package org.example0.problem408;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().validWordAbbreviation("internationalization", "i12iz4n")).isTrue();
    }

    @Test
    void testTwo() {
        assertThat(new Solution().validWordAbbreviation("apple", "a2e")).isFalse();
    }

    @Test
    void testThree() {
        assertThat(new Solution().validWordAbbreviation("a", "01")).isFalse();
    }

    @Test
    void testFour() {
        assertThat(new Solution().validWordAbbreviation("hi", "h01")).isFalse();
    }

    @Test
    void testFive() {
        assertThat(new Solution().validWordAbbreviation("word", "3e")).isFalse();
    }

    @Test
    void testSix() {
        assertThat(new Solution().validWordAbbreviation("a", "2")).isFalse();
    }
}


