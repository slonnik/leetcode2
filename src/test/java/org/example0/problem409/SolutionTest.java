package org.example0.problem409;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().longestPalindrome("abccccdd")).isEqualTo(7);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().longestPalindrome("a")).isEqualTo(1);
    }

    @Test
    void testThree() {
        assertThat(new Solution().longestPalindrome("bb")).isEqualTo(2);
    }

    @Test
    void testFour() {
        assertThat(new Solution().longestPalindrome("ccc")).isEqualTo(3);
    }

    @Test
    void testEx() {

        assertThat(new Solution().longestPalindrome("zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez"))
                .isEqualTo(55);
    }
}
