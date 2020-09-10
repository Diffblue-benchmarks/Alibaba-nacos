package com.alibaba.nacos.client.naming.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.naming.utils.Pair
 *
 * @author Diffblue Cover
 */

class PairTest {

    @Test
    void itemReturnsFoo() {
        assertThat(new Pair<String>("foo", 1.0).item(), is("foo"));
    }

    @Test
    void weightReturnsOne() {
        assertThat(new Pair<String>("foo", 1.0).weight(), closeTo(1.0, 0.0));
    }
}
