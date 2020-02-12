package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.concurrent.atomic.AtomicLong;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.TimeoutUtils
 *
 * @author Diffblue JCover
 */

public class TimeoutUtilsDiffblueTest {

    @Test(timeout=10000)
    public void addTotalTimeTimeIsOne() {
        TimeoutUtils timeoutUtils = new TimeoutUtils(1L, 1L);
        timeoutUtils.addTotalTime(1L);
        assertThat(timeoutUtils.getTotalTime().getAndDecrement(), is(1L));
        assertThat(timeoutUtils.getTotalTime().getAndIncrement(), is(0L));
    }

    @Test(timeout=10000)
    public void getTotalTime() {
        TimeoutUtils timeoutUtils = new TimeoutUtils(1L, 1L);
        AtomicLong result = timeoutUtils.getTotalTime();
        assertThat(result.getAndDecrement(), is(0L));
        assertThat(result.getAndIncrement(), is(-1L));
        assertThat(timeoutUtils.getTotalTime(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void initLastResetTime() {
        new TimeoutUtils(0L, 1L).initLastResetTime();
    }

    @Test(timeout=10000)
    public void isTimeout() {
        assertThat(new TimeoutUtils(0L, 1L).isTimeout(), is(false));
        assertThat(new TimeoutUtils(-1L, 1L).isTimeout(), is(true));
    }

    @Test(timeout=10000)
    public void resetTotalTime() {
        new TimeoutUtils(0L, 1L).resetTotalTime();
    }
}
