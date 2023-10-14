package org.example1.problem594;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().findLHS(new int[]{1,3,2,2,5,2,3,7})).isEqualTo(5);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().findLHS(new int[]{1,2,3,4})).isEqualTo(2);
    }
}
