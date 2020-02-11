package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.AccumulateStatCount
 *
 * @author Diffblue JCover
 */

public class AccumulateStatCountTest {

    @Test(timeout=10000)
    public void increaseReturnsOne() {
        assertThat(new AccumulateStatCount().increase(), is(1L));
    }

    @Test(timeout=10000)
    public void statReturnsZero() {
        assertThat(new AccumulateStatCount().stat(), is(0L));
    }
}
