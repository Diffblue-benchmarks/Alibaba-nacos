package com.alibaba.nacos.naming.healthcheck;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.healthcheck.HealthCheckCommon
 *
 * @author Diffblue JCover
 */

public class HealthCheckCommonTest {

    @Test(timeout=10000)
    public void init() {
        new HealthCheckCommon().init();
    }
}
