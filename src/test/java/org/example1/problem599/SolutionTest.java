package org.example1.problem599;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        assertThat(new Solution().findRestaurant(new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC" },
                new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"}))
                .containsExactlyInAnyOrder("Shogun");
    }

    @Test
    void testTwo() {
        assertThat(new Solution().findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC" },
                new String[]{"KFC","Shogun","Burger King"}))
                .containsExactlyInAnyOrder("Shogun");
    }

    @Test
    void testThree() {
        assertThat(new Solution().findRestaurant(new String[]{"happy","sad","good" },
                new String[]{"sad","happy","good"}))
                .containsExactlyInAnyOrder("sad","happy");
    }
}
