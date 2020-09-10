package com.alibaba.nacos.common.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.common.util.Pair
 *
 * @author Diffblue Cover
 */

class PairTest {

    @Test
    void factory() {
        Pair pair = new Pair();
        pair.setKey("key");
        pair.setValue("value");
        assertThat(pair.getKey(), is("key"));
        assertThat(pair.getValue(), is("value"));
    }
}
