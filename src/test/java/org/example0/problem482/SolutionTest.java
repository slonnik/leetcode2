package org.example0.problem482;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().licenseKeyFormatting("5F3Z-2e-9-w", 4)).isEqualTo("5F3Z-2E9W");
    }

    @Test
    void testTwo() {
        assertThat(new Solution().licenseKeyFormatting("2-5g-3-J", 2)).isEqualTo("2-5G-3J");
    }

    @Test
    void testThree() {
        assertThat(new Solution().licenseKeyFormatting("--a-a-a-a--", 2)).isEqualTo("AA-AA");
    }

    @Test
    void testFour() {
        assertThat(new Solution().licenseKeyFormatting("---", 3)).isEqualTo("AA-AA");
    }


}
