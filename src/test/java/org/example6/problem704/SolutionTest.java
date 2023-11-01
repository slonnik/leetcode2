package org.example6.problem704;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().search(new int[]{-1,0,3,5,9,12}, 9)).isEqualTo(4);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().search(new int[]{-1,0,3,5,9,12}, 2)).isEqualTo(-1);
    }

}
