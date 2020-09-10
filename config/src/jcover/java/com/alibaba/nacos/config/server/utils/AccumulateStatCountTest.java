package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.AccumulateStatCount
 *
 * @author Diffblue Cover
 */

class AccumulateStatCountTest {

    @Test
    void increaseReturnsOne() {
        assertThat(new AccumulateStatCount().increase(), is(1L));
    }

    @Test
    void statReturnsZero() {
        assertThat(new AccumulateStatCount().stat(), is(0L));
    }
}
