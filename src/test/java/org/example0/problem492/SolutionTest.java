package org.example0.problem492;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().constructRectangle(4)).containsExactly(2,2);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().constructRectangle(37)).containsExactly(37,1);
    }

    @Test
    void testThree() {
        assertThat(new Solution().constructRectangle(122122)).containsExactly(427,286);
    }
}
