package org.example0.problem389;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().findTheDifference("abcd", "abcde")).isEqualTo('e');
    }

    @Test
    void testTwo() {
        assertThat(new Solution().findTheDifference("", "y")).isEqualTo('y');
    }
}
