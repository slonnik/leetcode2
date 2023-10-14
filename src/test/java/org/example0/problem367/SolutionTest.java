package org.example0.problem367;

import org.junit.jupiter.api.Test;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void shouldBeSquareRoot() {
        assertThat(new Solution().isPerfectSquare(81)).isTrue();
    }

    @Test
    void shouldNotBeSquareRoot() {
        var data = pow(2, 31) -1;
        var data2=sqrt(data);
        assertThat(new Solution().isPerfectSquare(2147483647)).isFalse();
    }
}
