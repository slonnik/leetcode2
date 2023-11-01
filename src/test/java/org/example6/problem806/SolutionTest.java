package org.example6.problem806;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        var data = new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        assertThat(new Solution().numberOfLines(data, "abcdefghijklmnopqrstuvwxyz")).containsExactly(3, 60);
    }

    @Test
    void testTwo() {
        var data = new int[]{4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        assertThat(new Solution().numberOfLines(data, "bbbcccdddaaa")).containsExactly(2, 4);
    }
}
