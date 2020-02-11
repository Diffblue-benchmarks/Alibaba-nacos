package com.alibaba.nacos.config.server.constant;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.constant.CounterMode
 *
 * @author Diffblue JCover
 */

public class CounterModeTest {

    @Test(timeout=10000)
    public void reverse() {
        assertThat(CounterMode.INCREMENT.reverse(), is(CounterMode.DECREMENT));
        assertThat(CounterMode.DECREMENT.reverse(), is(CounterMode.INCREMENT));
    }

    @Test(timeout=10000)
    public void valuesReturnsINCREMENTDECREMENT() {
        CounterMode[] result = CounterMode.values();
        assertThat(result[0], is(CounterMode.INCREMENT));
        assertThat(result[1], is(CounterMode.DECREMENT));
    }
}
