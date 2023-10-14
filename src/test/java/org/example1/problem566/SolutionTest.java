package org.example1.problem566;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().matrixReshape(new int[][]{{1,2}, {3, 4}}, 1, 4)).isEqualTo(new int[][]{{1,2,3,4}});
    }

    @Test
    void testTwo() {
        assertThat(new Solution().matrixReshape(new int[][]{{1,2}, {3, 4}}, 2, 2)).isEqualTo(new int[][]{{1,2}, {3, 4}});
    }
}
