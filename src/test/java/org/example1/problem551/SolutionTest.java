package org.example1.problem551;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().checkRecord("PPALLP")).isTrue();
    }

    @Test
    void testTwo() {
        assertThat(new Solution().checkRecord("PPALLL")).isFalse();
    }
}
