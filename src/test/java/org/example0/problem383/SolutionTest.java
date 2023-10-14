package org.example0.problem383;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
       assertThat(new Solution().canConstruct("aa", "aab")).isTrue();
    }

    @Test
    void testTwo() {
        assertThat(new Solution().canConstruct("aa", "ab")).isFalse();
    }

    @Test
    void testThree() {
        assertThat(new Solution().canConstruct("a", "b")).isFalse();
    }
}
