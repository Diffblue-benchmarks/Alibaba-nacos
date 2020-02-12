package com.alibaba.nacos.config.server.model.app;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.app.MonitorInfo
 *
 * @author Diffblue JCover
 */

public class MonitorInfoDiffblueTest {

    @Test(timeout=10000)
    public void getCpuRatioReturnsZero() {
        assertEquals(0.0, new MonitorInfo().getCpuRatio(), 0);
    }

    @Test(timeout=10000)
    public void getFgcReturnsZero() {
        assertThat(new MonitorInfo().getFgc(), is(0));
    }

    @Test(timeout=10000)
    public void getFgctReturnsZero() {
        assertEquals(0.0, new MonitorInfo().getFgct(), 0);
    }

    @Test(timeout=10000)
    public void getFreeMemoryReturnsZero() {
        assertThat(new MonitorInfo().getFreeMemory(), is(0L));
    }

    @Test(timeout=10000)
    public void getGctReturnsZero() {
        assertEquals(0.0, new MonitorInfo().getGct(), 0);
    }

    @Test(timeout=10000)
    public void getLoadReturnsZero() {
        assertEquals(0.0, new MonitorInfo().getLoad(), 0);
    }

    @Test(timeout=10000)
    public void getMaxMemoryReturnsZero() {
        assertThat(new MonitorInfo().getMaxMemory(), is(0L));
    }

    @Test(timeout=10000)
    public void getTotalMemoryReturnsZero() {
        assertThat(new MonitorInfo().getTotalMemory(), is(0L));
    }

    @Test(timeout=10000)
    public void getYgcReturnsZero() {
        assertThat(new MonitorInfo().getYgc(), is(0));
    }

    @Test(timeout=10000)
    public void getYgctReturnsZero() {
        assertEquals(0.0, new MonitorInfo().getYgct(), 0);
    }

    @Test(timeout=10000)
    public void setCpuRatioToOne() {
        MonitorInfo monitorInfo = new MonitorInfo();
        monitorInfo.setCpuRatio(1);
        assertEquals(1.0, monitorInfo.getCpuRatio(), 0);
    }

    @Test(timeout=10000)
    public void setFgcToOne() {
        MonitorInfo monitorInfo = new MonitorInfo();
        monitorInfo.setFgc(1);
        assertThat(monitorInfo.getFgc(), is(1));
    }

    @Test(timeout=10000)
    public void setFgctToOne() {
        MonitorInfo monitorInfo = new MonitorInfo();
        monitorInfo.setFgct(1);
        assertEquals(1.0, monitorInfo.getFgct(), 0);
    }

    @Test(timeout=10000)
    public void setFreeMemoryToOne() {
        MonitorInfo monitorInfo = new MonitorInfo();
        monitorInfo.setFreeMemory(1L);
        assertThat(monitorInfo.getFreeMemory(), is(1L));
    }

    @Test(timeout=10000)
    public void setGctToOne() {
        MonitorInfo monitorInfo = new MonitorInfo();
        monitorInfo.setGct(1);
        assertEquals(1.0, monitorInfo.getGct(), 0);
    }

    @Test(timeout=10000)
    public void setLoadToOne() {
        MonitorInfo monitorInfo = new MonitorInfo();
        monitorInfo.setLoad(1);
        assertEquals(1.0, monitorInfo.getLoad(), 0);
    }

    @Test(timeout=10000)
    public void setMaxMemoryToOne() {
        MonitorInfo monitorInfo = new MonitorInfo();
        monitorInfo.setMaxMemory(1L);
        assertThat(monitorInfo.getMaxMemory(), is(1L));
    }

    @Test(timeout=10000)
    public void setTotalMemoryToOne() {
        MonitorInfo monitorInfo = new MonitorInfo();
        monitorInfo.setTotalMemory(1L);
        assertThat(monitorInfo.getTotalMemory(), is(1L));
    }

    @Test(timeout=10000)
    public void setYgcToOne() {
        MonitorInfo monitorInfo = new MonitorInfo();
        monitorInfo.setYgc(1);
        assertThat(monitorInfo.getYgc(), is(1));
    }

    @Test(timeout=10000)
    public void setYgctToOne() {
        MonitorInfo monitorInfo = new MonitorInfo();
        monitorInfo.setYgct(1);
        assertEquals(1.0, monitorInfo.getYgct(), 0);
    }
}
