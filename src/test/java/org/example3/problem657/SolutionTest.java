package org.example3.problem657;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().judgeCircle("UD")).isTrue();
    }

    @Test
    void testTwo() {
        assertThat(new Solution().judgeCircle("LL")).isFalse();
    }
}
