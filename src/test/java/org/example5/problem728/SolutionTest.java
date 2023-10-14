package org.example5.problem728;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
       assertThat(new Solution().selfDividingNumbers(1, 22))
               .containsExactlyInAnyOrder(1,2,3,4,5,6,7,8,9,11,12,15,22);
    }

    @Test
    void testTwo() {
        assertThat(new Solution().selfDividingNumbers(47, 85))
                .containsExactlyInAnyOrder(48,55,66,77);
    }
}
