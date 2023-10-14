package org.example0.problem401;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @ParameterizedTest
    @CsvSource(value = {"13:3", "8:1", "6:2", "0:0"}, delimiter = ':')
    void testCount(int input, int expectedCount) {
        assertThat(Solution.count(input)).isEqualTo(expectedCount);
    }

    @Test
    void testOne() {
        var result = new Solution().readBinaryWatch(1);
        //assertThat(new Solution().readBinaryWatch(1)).isEqualTo(expectedCount);
    }
}
