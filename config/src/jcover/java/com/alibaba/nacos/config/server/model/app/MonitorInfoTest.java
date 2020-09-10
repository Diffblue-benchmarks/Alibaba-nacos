package com.alibaba.nacos.config.server.model.app;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.app.MonitorInfo
 *
 * @author Diffblue Cover
 */

class MonitorInfoTest {

    @Test
    void factory() {
        MonitorInfo monitorInfo = new MonitorInfo();
        monitorInfo.setCpuRatio(0);
        monitorInfo.setFgc(1);
        monitorInfo.setFgct(1);
        monitorInfo.setFreeMemory(0L);
        monitorInfo.setGct(1);
        monitorInfo.setLoad(1);
        monitorInfo.setMaxMemory(1L);
        monitorInfo.setTotalMemory(1L);
        monitorInfo.setYgc(1);
        monitorInfo.setYgct(1);
        assertThat(monitorInfo.getCpuRatio(), closeTo(0.0, 0.0));
        assertThat(monitorInfo.getFgc(), is(1));
        assertThat(monitorInfo.getFgct(), closeTo(1.0, 0.0));
        assertThat(monitorInfo.getFreeMemory(), is(0L));
        assertThat(monitorInfo.getGct(), closeTo(1.0, 0.0));
        assertThat(monitorInfo.getLoad(), closeTo(1.0, 0.0));
        assertThat(monitorInfo.getMaxMemory(), is(1L));
        assertThat(monitorInfo.getTotalMemory(), is(1L));
        assertThat(monitorInfo.getYgc(), is(1));
        assertThat(monitorInfo.getYgct(), closeTo(1.0, 0.0));
    }
}
