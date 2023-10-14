package org.example3.problem645;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().findErrorNums(new int[]{1,2,2,4})).containsExactlyInAnyOrder(2, 3);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().findErrorNums(new int[]{1,1})).containsExactlyInAnyOrder(1, 2);
    }

    @Test
    void testThree() {
        assertThat(new Solution().findErrorNums(new int[]{2,2})).containsExactlyInAnyOrder(2, 1);
    }

    @Test
    void testFour() {
        assertThat(new Solution().findErrorNums(new int[]{3,2,2})).containsExactlyInAnyOrder(2, 1);
    }

    @Test
    void testFive() {
        assertThat(new Solution().findErrorNums(new int[]{3,2,3,4,6,5})).containsExactlyInAnyOrder(3, 1);
    }
}
