package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.SubscriberStatus
 *
 * @author Diffblue JCover
 */

public class SubscriberStatusTest {

    @Test(timeout=10000)
    public void getGroupKeyReturnsNull() {
        assertThat(new SubscriberStatus().getGroupKey(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getLastTimeReturnsNull() {
        assertThat(new SubscriberStatus().getLastTime(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getMd5ReturnsNull() {
        assertThat(new SubscriberStatus().getMd5(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getServerIpReturnsNull() {
        assertThat(new SubscriberStatus().getServerIp(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getStatusReturnsNull() {
        assertThat(new SubscriberStatus().getStatus(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setGroupKey() {
        SubscriberStatus subscriberStatus = new SubscriberStatus();
        subscriberStatus.setGroupKey("New York");
        assertThat(subscriberStatus.getGroupKey(), is("New York"));
    }

    @Test(timeout=10000)
    public void setLastTimeToOne() {
        SubscriberStatus subscriberStatus = new SubscriberStatus();
        subscriberStatus.setLastTime(1L);
        assertThat(subscriberStatus.getLastTime(), is(1L));
    }

    @Test(timeout=10000)
    public void setMd5() {
        SubscriberStatus subscriberStatus = new SubscriberStatus();
        subscriberStatus.setMd5("New York");
        assertThat(subscriberStatus.getMd5(), is("New York"));
    }

    @Test(timeout=10000)
    public void setServerIp() {
        SubscriberStatus subscriberStatus = new SubscriberStatus();
        subscriberStatus.setServerIp("New York");
        assertThat(subscriberStatus.getServerIp(), is("New York"));
    }

    @Test(timeout=10000)
    public void setStatusToFalse() {
        SubscriberStatus subscriberStatus = new SubscriberStatus();
        subscriberStatus.setStatus(false);
        assertThat(subscriberStatus.getStatus(), is(false));
    }
}
