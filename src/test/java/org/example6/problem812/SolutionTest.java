package org.example6.problem812;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        var input = new int[][]{{0,0},{0,1},{1,0},{0,2},{2,0}};
        assertThat(new Solution().largestTriangleArea(input)).isEqualTo(2.0);
    }

    @Test
    void testTwo() {
        var input = new int[][]{{1,0},{0,0},{0,1}};
        assertThat(new Solution().largestTriangleArea(input)).isEqualTo(0.5);
    }

    @Test
    void testThree() {
        var input = new int[][]{{4,6},{6,5},{3,1}};
        assertThat(new Solution().largestTriangleArea(input)).isEqualTo(5.5);
    }


}
