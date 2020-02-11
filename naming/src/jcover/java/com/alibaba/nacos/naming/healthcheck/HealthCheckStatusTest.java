package com.alibaba.nacos.naming.healthcheck;

import com.alibaba.nacos.naming.core.Instance;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.healthcheck.HealthCheckStatus
 *
 * @author Diffblue JCover
 */

public class HealthCheckStatusTest {

    @Test(timeout=10000)
    public void get() {
        // pojo HealthCheckStatus
    }

    @Test(timeout=10000)
    public void remv() {
        HealthCheckStatus.remv(new Instance());
    }

    @Test(timeout=10000)
    public void reset() {
        HealthCheckStatus.reset(new Instance());
    }
}
