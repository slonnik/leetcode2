package org.example6.problem766;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        var data = new int[][] {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        assertThat(new Solution().isToeplitzMatrix(data)).isTrue();
    }

    @Test
    void testTwo() {
        var data = new int[][] {{44,35,39},{15,44,35},{17,15,44},{80,17,15},{43,80,0},{77,43,80}};
        assertThat(new Solution().isToeplitzMatrix(data)).isFalse();
    }



}
