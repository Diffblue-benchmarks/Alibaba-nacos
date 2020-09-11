package com.alibaba.nacos.naming.healthcheck;

import com.alibaba.nacos.naming.core.Service;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.healthcheck.HealthCheckReactor
 *
 * @author Diffblue Cover
 */

public class HealthCheckReactorTest {

    @Test
    public void scheduleCheck() {
        Service service = new Service();
        service.setName("Acme");
        HealthCheckReactor.scheduleCheck(new ClientBeatCheckTask(service));
    }

    @Test
    public void cancelCheck1() {
        Service service = new Service();
        service.setName("Acme");
        HealthCheckReactor.cancelCheck(new ClientBeatCheckTask(service));
    }

    @Test
    public void cancelCheck2() {
        Service service = new Service();
        service.setName("bar");
        HealthCheckReactor.cancelCheck(new ClientBeatCheckTask(service));
    }

    @Test
    public void scheduleNow() {
        // pojo java.util.concurrent.ScheduledFuture<?>
    }
}
