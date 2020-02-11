package com.alibaba.nacos.config.server.service;

import java.util.concurrent.TimeUnit;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.TimerTaskService
 *
 * @author Diffblue JCover
 */

public class TimerTaskServiceTest {

    @Test(timeout=10000)
    public void scheduleWithFixedDelayDelayIsOneAndInitialDelayIsOneAndUnitIsNANOSECONDS() {
        TimerTaskService.scheduleWithFixedDelay(Thread.currentThread(), 1L, 1L, TimeUnit.NANOSECONDS);
    }
}
