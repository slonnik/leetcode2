package org.example4.problem682;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().calPoints(new String[]{"5","2","C","D","+"})).isEqualTo(30);
    }
}
