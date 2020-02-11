package com.alibaba.nacos.config.server.monitor;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.monitor.NotifyTaskQueueMonitorTask
 *
 * @author Diffblue JCover
 */

public class NotifyTaskQueueMonitorTaskTest {

    @Test(timeout=10000)
    public void run() {
        new NotifyTaskQueueMonitorTask(new com.alibaba.nacos.config.server.service.notify.AsyncNotifyService(new com.alibaba.nacos.config.server.service.ServerListService())).run();
    }
}
