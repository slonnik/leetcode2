package org.example4.problem661;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest
{

    @Test
    void testOne() {
        assertThat(new Solution().imageSmoother(new int[][]{{100,200,100},{200,50,200},{100,200,100}}))
                .isEqualTo(new int[][]{{137,141,137},{141,138,141},{137,141,137}});
    }
}
