package org.example4.problem717;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().isOneBitCharacter(new int[]{1,0,0})).isTrue();
    }

    @Test
    void testTwo() {
        assertThat(new Solution().isOneBitCharacter(new int[]{1,1,1,0})).isFalse();
    }
}
