package com.alibaba.nacos.client.monitor;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.monitor.MetricsMonitor
 *
 * @author Diffblue Cover
 */

class MetricsMonitorTest {

    @Test
    void getServiceInfoMapSizeMonitor() {
        // pojo io.prometheus.client.Gauge.Child MetricsMonitor.getServiceInfoMapSizeMonitor()
    }

    @Test
    void getDom2BeatSizeMonitor() {
        // pojo io.prometheus.client.Gauge.Child MetricsMonitor.getDom2BeatSizeMonitor()
    }

    @Test
    void getListenConfigCountMonitor() {
        // pojo io.prometheus.client.Gauge.Child MetricsMonitor.getListenConfigCountMonitor()
    }

    @Test
    void getConfigRequestMonitorCodeIsDEAndMethodIsGET() {
        // pojo io.prometheus.client.Histogram.Timer MetricsMonitor.getConfigRequestMonitor("GET", "/some/path.html", "DE")
    }

    @Test
    void getNamingRequestMonitorCodeIsDEAndMethodIsGET() {
        // pojo io.prometheus.client.Histogram.Child MetricsMonitor.getNamingRequestMonitor("GET", "/some/path.html", "DE")
    }
}
