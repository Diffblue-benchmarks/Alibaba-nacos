package com.alibaba.nacos.config.server.monitor;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.monitor.ResponseMonitor
 *
 * @author Diffblue Cover
 */

class ResponseMonitorTest {

    @Test
    void refresh() {
        ResponseMonitor.refresh();
    }

    @Test
    void addConfigTime1() {
        ResponseMonitor.addConfigTime(50L);
    }

    @Test
    void addConfigTime2() {
        ResponseMonitor.addConfigTime(200L);
    }

    @Test
    void addConfigTime3() {
        ResponseMonitor.addConfigTime(500L);
    }

    @Test
    void addConfigTime4() {
        ResponseMonitor.addConfigTime(2_000L);
    }

    @Test
    void addConfigTime5() {
        ResponseMonitor.addConfigTime(3_000L);
    }

    @Test
    void addConfigTimeTimeIsOne() {
        ResponseMonitor.addConfigTime(1L);
    }

    @Test
    void addConfigTimeTimeIsOneHundred() {
        ResponseMonitor.addConfigTime(100L);
    }

    @Test
    void addConfigTimeTimeIsOneThousand() {
        ResponseMonitor.addConfigTime(1_000L);
    }
}
