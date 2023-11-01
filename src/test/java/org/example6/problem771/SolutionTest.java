package org.example6.problem771;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().numJewelsInStones("aA","aAAbbbb")).isEqualTo(3);
    }
}
