package org.example1.problem500;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().findWords(new String[]{"Hello","Alaska","Dad","Peace"}))
                .containsExactlyInAnyOrder("Alaska", "Dad");
    }

    @Test
    void testTwo() {
        assertThat(new Solution().findWords(new String[]{"omk"})).isEmpty();
    }

    @Test
    void testThree() {
        assertThat(new Solution().findWords(new String[]{"adsdf","sfd"}))
                .containsExactlyInAnyOrder("adsdf","sfd");
    }
}
