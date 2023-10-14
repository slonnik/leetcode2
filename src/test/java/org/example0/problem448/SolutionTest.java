package org.example0.problem448;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1})).contains(5, 6);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().findDisappearedNumbers(new int[]{1, 1})).contains(2);
    }
}
