package org.example1.problem496;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2}))
                .containsExactly(-1, 3, -1);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().nextGreaterElement(new int[]{2, 4}, new int[]{1,2,3,4}))
                .containsExactly(3, -1);
    }

    @Test
    void testThree() {
        assertThat(new Solution().nextGreaterElement(new int[]{2, 1, 3}, new int[]{2, 3, 1}))
                .containsExactly(3, -1, -1);
    }
}
