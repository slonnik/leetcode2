package org.example0.problem387;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().firstUniqChar("loveleetcode")).isEqualTo(2);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().firstUniqChar("aabb")).isEqualTo(-1);
    }

    @Test
    void testThree() {
        assertThat(new Solution().firstUniqChar("leetcode")).isEqualTo(0);
    }
}
