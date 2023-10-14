package org.example0.problem405;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().toHex(26)).isEqualTo("1a");
    }

    @Test
    void testNegative() {
        assertThat(new Solution().toHex(-1)).isEqualTo("ffffffff");
    }
}
