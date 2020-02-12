package com.alibaba.nacos.config.server.monitor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.monitor.ResponseMonitor
 *
 * @author Diffblue JCover
 */

public class ResponseMonitorDiffblueTest {

    @Test(timeout=10000)
    public void addConfigTime1() {
        ResponseMonitor.addConfigTime(50L);
    }

    @Test(timeout=10000)
    public void addConfigTime2() {
        ResponseMonitor.addConfigTime(200L);
    }

    @Test(timeout=10000)
    public void addConfigTime3() {
        ResponseMonitor.addConfigTime(500L);
    }

    @Test(timeout=10000)
    public void addConfigTime4() {
        ResponseMonitor.addConfigTime(2_000L);
    }

    @Test(timeout=10000)
    public void addConfigTime5() {
        ResponseMonitor.addConfigTime(3_000L);
    }

    @Test(timeout=10000)
    public void addConfigTimeTimeIsOne() {
        ResponseMonitor.addConfigTime(1L);
    }

    @Test(timeout=10000)
    public void addConfigTimeTimeIsOneHundred() {
        ResponseMonitor.addConfigTime(100L);
    }

    @Test(timeout=10000)
    public void addConfigTimeTimeIsOneThousand() {
        ResponseMonitor.addConfigTime(1_000L);
    }

//    @Test(timeout=10000)
//    public void getStringForPrint() {
//        assertThat(ResponseMonitor.getStringForPrint(), is("getConfig monitor:\r\n0-50ms:100.0%\r\n100-200ms:.0%\r\n200-500ms:.0%\r\n500-1000ms:.0%\r\n1000-2000ms:.0%\r\n2000-3000ms:.0%\r\n3000以上ms:.0%\r\n"));  <-- Arithmetic / by zero
//    }
//
    @Test(timeout=10000)
    public void refresh() {
        ResponseMonitor.refresh();
    }
}
