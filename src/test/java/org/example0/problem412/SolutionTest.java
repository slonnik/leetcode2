package org.example0.problem412;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().fizzBuzz(3)).containsExactlyInAnyOrder("1", "2", "Fizz");
    }

    @Test
    void testTwo() {
        assertThat(new Solution().fizzBuzz(5)).containsExactlyInAnyOrder("1","2","Fizz","4","Buzz");
    }

    @Test
    void testThree() {
        assertThat(new Solution().fizzBuzz(15))
                .containsExactlyInAnyOrder("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");
    }
}
