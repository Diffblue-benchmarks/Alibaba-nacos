package com.alibaba.nacos.config.server.monitor;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Meter;
import io.micrometer.core.instrument.Timer;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.monitor.MetricsMonitor
 *
 * @author Diffblue JCover
 */

public class MetricsMonitorTest {

    @Test(timeout=10000)
    public void getConfigCountMonitor() {
        AtomicInteger result = MetricsMonitor.getConfigCountMonitor();
        assertThat(result.getAndDecrement(), is(0));
        assertThat(result.getAndIncrement(), is(-1));
    }

    @Test(timeout=10000)
    public void getConfigMonitor() {
        AtomicInteger result = MetricsMonitor.getConfigMonitor();
        assertThat(result.getAndDecrement(), is(0));
        assertThat(result.getAndIncrement(), is(-1));
    }

    @Test(timeout=10000)
    public void getConfigNotifyException() {
        Counter result = MetricsMonitor.getConfigNotifyException();
        assertThat(result.getId().getBaseUnit(), is(nullValue()));
        assertThat(result.getId().getDescription(), is(nullValue()));
        assertThat(result.getId().getName(), is("nacos_exception"));
        assertThat(result.getId().getTags().size(), is(2));
        // pojo String
        // pojo String
        // pojo String
        // pojo String
        // pojo Iterable<io.micrometer.core.instrument.Tag>
        assertThat(result.getId().getType(), is(Meter.Type.COUNTER));
    }

    @Test(timeout=10000)
    public void getDbException() {
        Counter result = MetricsMonitor.getDbException();
        assertThat(result.getId().getBaseUnit(), is(nullValue()));
        assertThat(result.getId().getDescription(), is(nullValue()));
        assertThat(result.getId().getName(), is("nacos_exception"));
        assertThat(result.getId().getTags().size(), is(2));
        // pojo String
        // pojo String
        // pojo String
        // pojo String
        // pojo Iterable<io.micrometer.core.instrument.Tag>
        assertThat(result.getId().getType(), is(Meter.Type.COUNTER));
    }

    @Test(timeout=10000)
    public void getDumpTaskMonitor() {
        AtomicInteger result = MetricsMonitor.getDumpTaskMonitor();
        assertThat(result.getAndDecrement(), is(0));
        assertThat(result.getAndIncrement(), is(-1));
    }

    @Test(timeout=10000)
    public void getIllegalArgumentException() {
        Counter result = MetricsMonitor.getIllegalArgumentException();
        assertThat(result.getId().getBaseUnit(), is(nullValue()));
        assertThat(result.getId().getDescription(), is(nullValue()));
        assertThat(result.getId().getName(), is("nacos_exception"));
        assertThat(result.getId().getTags().size(), is(2));
        // pojo String
        // pojo String
        // pojo String
        // pojo String
        // pojo Iterable<io.micrometer.core.instrument.Tag>
        assertThat(result.getId().getType(), is(Meter.Type.COUNTER));
    }

    @Test(timeout=10000)
    public void getLongPollingMonitor() {
        AtomicInteger result = MetricsMonitor.getLongPollingMonitor();
        assertThat(result.getAndDecrement(), is(0));
        assertThat(result.getAndIncrement(), is(-1));
    }

    @Test(timeout=10000)
    public void getNacosException() {
        Counter result = MetricsMonitor.getNacosException();
        assertThat(result.getId().getBaseUnit(), is(nullValue()));
        assertThat(result.getId().getDescription(), is(nullValue()));
        assertThat(result.getId().getName(), is("nacos_exception"));
        assertThat(result.getId().getTags().size(), is(2));
        // pojo String
        // pojo String
        // pojo String
        // pojo String
        // pojo Iterable<io.micrometer.core.instrument.Tag>
        assertThat(result.getId().getType(), is(Meter.Type.COUNTER));
    }

    @Test(timeout=10000)
    public void getNotifyRtTimer() {
        Timer result = MetricsMonitor.getNotifyRtTimer();
        assertThat(result.getId().getBaseUnit(), is("seconds"));
        assertThat(result.getId().getDescription(), is(nullValue()));
        assertThat(result.getId().getName(), is("nacos_timer"));
        assertThat(result.getId().getTags().size(), is(2));
        // pojo String
        // pojo String
        // pojo String
        // pojo String
        // pojo Iterable<io.micrometer.core.instrument.Tag>
        assertThat(result.getId().getType(), is(Meter.Type.TIMER));
    }

    @Test(timeout=10000)
    public void getNotifyTaskMonitor() {
        AtomicInteger result = MetricsMonitor.getNotifyTaskMonitor();
        assertThat(result.getAndDecrement(), is(0));
        assertThat(result.getAndIncrement(), is(-1));
    }

    @Test(timeout=10000)
    public void getPublishMonitor() {
        AtomicInteger result = MetricsMonitor.getPublishMonitor();
        assertThat(result.getAndDecrement(), is(0));
        assertThat(result.getAndIncrement(), is(-1));
    }

    @Test(timeout=10000)
    public void getUnhealthException() {
        Counter result = MetricsMonitor.getUnhealthException();
        assertThat(result.getId().getBaseUnit(), is(nullValue()));
        assertThat(result.getId().getDescription(), is(nullValue()));
        assertThat(result.getId().getName(), is("nacos_exception"));
        assertThat(result.getId().getTags().size(), is(2));
        // pojo String
        // pojo String
        // pojo String
        // pojo String
        // pojo Iterable<io.micrometer.core.instrument.Tag>
        assertThat(result.getId().getType(), is(Meter.Type.COUNTER));
    }
}
