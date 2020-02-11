package com.alibaba.nacos.config.server.monitor;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.monitor.PrintMemoryTask
 *
 * @author Diffblue JCover
 */

public class PrintMemoryTaskTest {

    @Test(timeout=10000)
    public void run() {
        new PrintMemoryTask().run();
    }
}
