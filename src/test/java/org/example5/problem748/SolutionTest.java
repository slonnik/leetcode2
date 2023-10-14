package org.example5.problem748;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().shortestCompletingWord("1s3 PSt",
                new String[] {"step","steps","stripe","stepple"})).isEqualTo("steps");
    }

    @Test
    void testTwo() {
        assertThat(new Solution().shortestCompletingWord("1s3 456",
                new String[] {"looks","pest","stew","show"})).isEqualTo("pest");
    }

    @Test
    void testThree() {
        assertThat(new Solution().shortestCompletingWord("IE71146",
                new String[] {"recognize","student","choice","similar","less","feel","room","customer","require","course"})).isEqualTo("choice");
    }
}
