package com.alibaba.nacos.client.naming.beat;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.naming.beat.BeatInfo
 *
 * @author Diffblue JCover
 */

public class BeatInfoTest {

    @Test(timeout=10000)
    public void getClusterReturnsNull() {
        assertThat(new BeatInfo().getCluster(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getIpReturnsNull() {
        assertThat(new BeatInfo().getIp(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getMetadataReturnsNull() {
        assertThat(new BeatInfo().getMetadata(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getPeriodReturnsZero() {
        assertThat(new BeatInfo().getPeriod(), is(0L));
    }

    @Test(timeout=10000)
    public void getPortReturnsZero() {
        assertThat(new BeatInfo().getPort(), is(0));
    }

    @Test(timeout=10000)
    public void getServiceNameReturnsNull() {
        assertThat(new BeatInfo().getServiceName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getWeightReturnsZero() {
        assertEquals(0.0, new BeatInfo().getWeight(), 0);
    }

    @Test(timeout=10000)
    public void isScheduledReturnsFalse() {
        assertThat(new BeatInfo().isScheduled(), is(false));
    }

    @Test(timeout=10000)
    public void isStoppedReturnsFalse() {
        assertThat(new BeatInfo().isStopped(), is(false));
    }

    @Test(timeout=10000)
    public void setClusterToFoo() {
        BeatInfo beatInfo = new BeatInfo();
        beatInfo.setCluster("foo");
        assertThat(beatInfo.getCluster(), is("foo"));
    }

    @Test(timeout=10000)
    public void setIpToFoo() {
        BeatInfo beatInfo = new BeatInfo();
        beatInfo.setIp("foo");
        assertThat(beatInfo.getIp(), is("foo"));
    }

    @Test(timeout=10000)
    public void setMetadataToEmpty() {
        BeatInfo beatInfo = new BeatInfo();
        Map<String, String> metadata = new HashMap<String, String>();
        beatInfo.setMetadata(metadata);
        assertThat(beatInfo.getMetadata(), sameInstance(metadata));
    }

    @Test(timeout=10000)
    public void setPeriodToOne() {
        BeatInfo beatInfo = new BeatInfo();
        beatInfo.setPeriod(1L);
        assertThat(beatInfo.getPeriod(), is(1L));
    }

    @Test(timeout=10000)
    public void setPortToOne() {
        BeatInfo beatInfo = new BeatInfo();
        beatInfo.setPort(1);
        assertThat(beatInfo.getPort(), is(1));
    }

    @Test(timeout=10000)
    public void setScheduledToFalse() {
        new BeatInfo().setScheduled(false);
    }

    @Test(timeout=10000)
    public void setServiceName() {
        BeatInfo beatInfo = new BeatInfo();
        beatInfo.setServiceName("/bin/bash");
        assertThat(beatInfo.getServiceName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setStoppedToFalse() {
        new BeatInfo().setStopped(false);
    }

    @Test(timeout=10000)
    public void setWeightToOne() {
        BeatInfo beatInfo = new BeatInfo();
        beatInfo.setWeight(1.0);
        assertEquals(1.0, beatInfo.getWeight(), 0);
    }
}
