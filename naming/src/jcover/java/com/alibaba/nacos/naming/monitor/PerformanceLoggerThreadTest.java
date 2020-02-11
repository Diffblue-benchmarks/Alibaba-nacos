package com.alibaba.nacos.naming.monitor;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.monitor.PerformanceLoggerThread
 *
 * @author Diffblue JCover
 */

public class PerformanceLoggerThreadTest {

    @Test(timeout=10000)
    public void init() {
        new PerformanceLoggerThread().init();
    }
}
