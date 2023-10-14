package org.example5.problem760;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().anagramMappings(new int[]{12,28,46,32,50}, new int[]{50,12,32,46,28}))
                .containsExactly(1,4,3,2,0);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().anagramMappings(new int[]{84,46}, new int[]{84,46}))
                .containsExactly(0,1);
    }
}
