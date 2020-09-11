package com.alibaba.nacos.config.server.service;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.TimerTaskService
 *
 * @author Diffblue Cover
 */

class TimerTaskServiceTest {

    @Test
    void scheduleWithFixedDelayDelayIsOneAndInitialDelayIsOneAndUnitIsNanoseconds() {
        TimerTaskService.scheduleWithFixedDelay(Thread.currentThread(), 1L, 1L, TimeUnit.NANOSECONDS);
    }
}
