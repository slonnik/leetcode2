package org.example6.problem703;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class KthLargestTest {

    @Test
    void testOne() {
        var solution = new KthLargest(3, new int[]{4, 5, 8, 2});
        assertThat(solution.add(3)).isEqualTo(4);
        assertThat(solution.add(5)).isEqualTo(5);
        assertThat(solution.add(10)).isEqualTo(5);
        assertThat(solution.add(9)).isEqualTo(8);
        assertThat(solution.add(4)).isEqualTo(8);
    }

    @Test
    void testTwo() {
        var solution = new KthLargest(1, new int[]{});
        assertThat(solution.add(-3)).isEqualTo(-3);
        assertThat(solution.add(-2)).isEqualTo(-2);
        assertThat(solution.add(-4)).isEqualTo(-2);
        assertThat(solution.add(0)).isEqualTo(0);
        assertThat(solution.add(4)).isEqualTo(4);
    }

    @Test
    void testThree() {
        var solution = new KthLargest(3, new int[]{5, -1});
        assertThat(solution.add(2)).isEqualTo(-1);
        assertThat(solution.add(1)).isEqualTo(1);
        assertThat(solution.add(-1)).isEqualTo(1);
        assertThat(solution.add(3)).isEqualTo(2);
        assertThat(solution.add(4)).isEqualTo(3);
    }
}
