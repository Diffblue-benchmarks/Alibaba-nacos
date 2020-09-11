package com.alibaba.nacos.config.server.constant;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.constant.CounterMode
 *
 * @author Diffblue Cover
 */

class CounterModeTest {

    @Test
    void valuesReturnsIncrementDecrement() {
        CounterMode[] result = CounterMode.values();
        assertThat(result[0], is(CounterMode.INCREMENT));
        assertThat(result[1], is(CounterMode.DECREMENT));
    }

    @Test
    void reverse() {
        assertThat(CounterMode.INCREMENT.reverse(), is(CounterMode.DECREMENT));
        assertThat(CounterMode.DECREMENT.reverse(), is(CounterMode.INCREMENT));
    }
}
