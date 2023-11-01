package org.example6.problem804;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"})).isEqualTo(2);
    }
}
