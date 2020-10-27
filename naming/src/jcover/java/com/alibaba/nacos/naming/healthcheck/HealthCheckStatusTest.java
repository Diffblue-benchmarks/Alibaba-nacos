package com.alibaba.nacos.naming.healthcheck;

import com.alibaba.nacos.naming.core.Instance;

import java.util.HashMap;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.healthcheck.HealthCheckStatus
 *
 * @author Diffblue Cover
 */

public class HealthCheckStatusTest {

    @Test
    public void factory() {
        // pojo HealthCheckStatus new HealthCheckStatus()
    }

    @Test
    public void reset() {
        Instance instance = new Instance();
        instance.setCheckRT(1L);
        HealthCheckStatus.reset(instance);
    }

    @Test
    public void get() {
        // pojo HealthCheckStatus HealthCheckStatus.get(new Instance())
    }

    @Test
    public void remv() {
        Instance instance = new Instance();
        instance.setApp("DE");
        instance.setBeingChecked(false);
        instance.setCheckRT(1L);
        instance.setLastBeat(1L);
        instance.setMarked(false);
        instance.setMockValid(false);
        instance.setTenant("DE");
        instance.setClusterName("John Smith");
        instance.setEnabled(false);
        instance.setEphemeral(false);
        instance.setHealthy(false);
        instance.setInstanceId("1234");
        instance.setIp("DE");
        instance.setMetadata(new HashMap<String, String>());
        instance.setPort(1);
        instance.setServiceName("Acme");
        instance.setWeight(1.0);
        HealthCheckStatus.remv(instance);
    }
}
