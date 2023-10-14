package org.example0.problem476;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().findComplement(5)).isEqualTo(2);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().findComplement(1)).isEqualTo(0);
    }
}
