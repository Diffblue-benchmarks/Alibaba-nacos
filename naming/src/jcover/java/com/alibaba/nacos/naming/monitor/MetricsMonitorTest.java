package com.alibaba.nacos.naming.monitor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Meter;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.monitor.MetricsMonitor
 *
 * @author Diffblue JCover
 */

public class MetricsMonitorTest {

    @Test(timeout=10000)
    public void getAvgPushCostMonitor() {
        AtomicLong result = MetricsMonitor.getAvgPushCostMonitor();
        assertThat(result.getAndDecrement(), is(0L));
        assertThat(result.getAndIncrement(), is(-1L));
    }

    @Test(timeout=10000)
    public void getDiskException() {
        Counter result = MetricsMonitor.getDiskException();
        assertThat(result.getId().getBaseUnit(), is(nullValue()));
        assertThat(result.getId().getDescription(), is(nullValue()));
        assertThat(result.getId().getName(), is("nacos_exception"));
        assertThat(result.getId().getTags(), hasSize(2));
        // pojo String
        // pojo String
        // pojo String
        // pojo String
        // pojo Iterable<io.micrometer.core.instrument.Tag>
        assertThat(result.getId().getType(), is(Meter.Type.COUNTER));
    }

    @Test(timeout=10000)
    public void getDomCountMonitor() {
        AtomicInteger result = MetricsMonitor.getDomCountMonitor();
        assertThat(result.getAndDecrement(), is(0));
        assertThat(result.getAndIncrement(), is(-1));
    }

    @Test(timeout=10000)
    public void getFailedPushMonitor() {
        AtomicInteger result = MetricsMonitor.getFailedPushMonitor();
        assertThat(result.getAndDecrement(), is(0));
        assertThat(result.getAndIncrement(), is(-1));
    }

    @Test(timeout=10000)
    public void getHttpHealthCheckMonitor() {
        AtomicInteger result = MetricsMonitor.getHttpHealthCheckMonitor();
        assertThat(result.getAndDecrement(), is(0));
        assertThat(result.getAndIncrement(), is(-1));
    }

    @Test(timeout=10000)
    public void getIpCountMonitor() {
        AtomicInteger result = MetricsMonitor.getIpCountMonitor();
        assertThat(result.getAndDecrement(), is(0));
        assertThat(result.getAndIncrement(), is(-1));
    }

    @Test(timeout=10000)
    public void getLeaderSendBeatFailedException() {
        Counter result = MetricsMonitor.getLeaderSendBeatFailedException();
        assertThat(result.getId().getBaseUnit(), is(nullValue()));
        assertThat(result.getId().getDescription(), is(nullValue()));
        assertThat(result.getId().getName(), is("nacos_exception"));
        assertThat(result.getId().getTags(), hasSize(2));
        // pojo String
        // pojo String
        // pojo String
        // pojo String
        // pojo Iterable<io.micrometer.core.instrument.Tag>
        assertThat(result.getId().getType(), is(Meter.Type.COUNTER));
    }

    @Test(timeout=10000)
    public void getLeaderStatusMonitor() {
        AtomicLong result = MetricsMonitor.getLeaderStatusMonitor();
        assertThat(result.getAndDecrement(), is(0L));
        assertThat(result.getAndIncrement(), is(-1L));
    }

    @Test(timeout=10000)
    public void getMaxPushCostMonitor() {
        AtomicLong result = MetricsMonitor.getMaxPushCostMonitor();
        assertThat(result.getAndDecrement(), is(0L));
        assertThat(result.getAndIncrement(), is(-1L));
    }

    @Test(timeout=10000)
    public void getMysqlHealthCheckMonitor() {
        AtomicInteger result = MetricsMonitor.getMysqlHealthCheckMonitor();
        assertThat(result.getAndDecrement(), is(0));
        assertThat(result.getAndIncrement(), is(-1));
    }

    @Test(timeout=10000)
    public void getTcpHealthCheckMonitor() {
        AtomicInteger result = MetricsMonitor.getTcpHealthCheckMonitor();
        assertThat(result.getAndDecrement(), is(0));
        assertThat(result.getAndIncrement(), is(-1));
    }

    @Test(timeout=10000)
    public void getTotalPushMonitor() {
        AtomicInteger result = MetricsMonitor.getTotalPushMonitor();
        assertThat(result.getAndDecrement(), is(0));
        assertThat(result.getAndIncrement(), is(-1));
    }
}
