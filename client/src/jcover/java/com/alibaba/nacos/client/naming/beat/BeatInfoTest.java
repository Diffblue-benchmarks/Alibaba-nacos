package com.alibaba.nacos.client.naming.beat;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.naming.beat.BeatInfo
 *
 * @author Diffblue Cover
 */

class BeatInfoTest {

    @Test
    void factory() {
        BeatInfo beatInfo = new BeatInfo();
        beatInfo.setCluster("John Smith");
        beatInfo.setIp("foo");
        beatInfo.setMetadata(new HashMap<String, String>());
        beatInfo.setPeriod(1L);
        beatInfo.setPort(1);
        beatInfo.setScheduled(false);
        beatInfo.setServiceName("Acme");
        beatInfo.setStopped(false);
        beatInfo.setWeight(1.0);
        assertThat(beatInfo.getCluster(), is("John Smith"));
        assertThat(beatInfo.getIp(), is("foo"));
        assertThat(beatInfo.getMetadata().isEmpty(), is(true));
        assertThat(beatInfo.getPeriod(), is(1L));
        assertThat(beatInfo.getPort(), is(1));
        assertThat(beatInfo.getServiceName(), is("Acme"));
        assertThat(beatInfo.getWeight(), closeTo(1.0, 0.0));
        assertThat(beatInfo.isScheduled(), is(false));
        assertThat(beatInfo.isStopped(), is(false));
    }
}
