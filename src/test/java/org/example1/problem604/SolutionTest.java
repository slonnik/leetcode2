package org.example1.problem604;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SolutionTest {

    @Test
    void testOne() {
        var stringIterator = new StringIterator("L1e2t1C1o1d1e1");
        assertThat(stringIterator.next()).isEqualTo('L');
        assertThat(stringIterator.next()).isEqualTo('e');
        assertThat(stringIterator.next()).isEqualTo('e');
        assertThat(stringIterator.next()).isEqualTo('t');
        assertThat(stringIterator.next()).isEqualTo('C');
        assertThat(stringIterator.next()).isEqualTo('o');
        assertThat(stringIterator.hasNext()).isTrue();
        assertThat(stringIterator.next()).isEqualTo('d');
        assertThat(stringIterator.hasNext()).isTrue();
        assertThat(stringIterator.next()).isEqualTo('e');
        assertThat(stringIterator.hasNext()).isFalse();
    }
}
