package org.example1.problem557;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {
    @Test
    void testOne(){
        assertThat(new Solution().reverseWords("Let's take LeetCode contest"))
                .isEqualTo("s'teL ekat edoCteeL tsetnoc");
    }

    @Test
    void testTwo(){
        assertThat(new Solution().reverseWords("God Ding")).isEqualTo("doG gniD");
    }
}

