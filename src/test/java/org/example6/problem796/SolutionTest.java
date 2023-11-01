package org.example6.problem796;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().rotateString("abcde", "cdeab")).isTrue();
    }

    @Test
    void testTwo() {
        assertThat(new Solution().rotateString("abcde", "abced")).isFalse();
    }
}
