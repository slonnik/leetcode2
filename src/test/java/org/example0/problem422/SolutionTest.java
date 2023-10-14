package org.example0.problem422;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        var data = Arrays.stream(new String[]{"abcd", "bnrt", "crmy", "dtye"}).toList();
        assertThat(new Solution().validWordSquare(data)).isTrue();
    }

    @Test
    void testTwo() {
        var data = Arrays.stream(new String[]{"abcd","bnrt","crm","dt"}).toList();
        assertThat(new Solution().validWordSquare(data)).isTrue();
    }

    @Test
    void testThree() {
        var data = Arrays.stream(new String[]{"ball","area","read","lady"}).toList();
        assertThat(new Solution().validWordSquare(data)).isFalse();
    }

    @Test
    void testFour() {
        var data = Arrays.stream(new String[]{"abc","b"}).toList();
        assertThat(new Solution().validWordSquare(data)).isFalse();
    }
}
