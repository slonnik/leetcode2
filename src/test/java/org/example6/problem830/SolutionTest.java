package org.example6.problem830;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().largeGroupPositions("abbxxxxzzy")).containsExactly(List.of(3,6));
    }

    @Test
    void testTwo() {
        assertThat(new Solution().largeGroupPositions("abc")).isEmpty();
    }

    @Test
    void testThree() {
        assertThat(new Solution().largeGroupPositions("abcdddeeeeaabbbcd")).containsExactly(List.of(3,5),List.of(6,9), List.of(12,14));
    }

    @Test
    void testFour() {
        assertThat(new Solution().largeGroupPositions("aaa")).containsExactly(List.of(0,2));
    }
}
