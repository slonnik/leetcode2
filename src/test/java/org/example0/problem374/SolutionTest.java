package org.example0.problem374;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution(6).guessNumber(10)).isEqualTo(6);
    }

    @Test
    void testTwo() {
        assertThat(new Solution(1).guessNumber(1)).isEqualTo(1);
    }

    @Test
    void testThree() {
        assertThat(new Solution(1).guessNumber(2)).isEqualTo(1);
    }
}
