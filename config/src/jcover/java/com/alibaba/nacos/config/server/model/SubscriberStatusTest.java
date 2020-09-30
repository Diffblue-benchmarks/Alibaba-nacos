package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.SubscriberStatus
 *
 * @author Diffblue Cover
 */

class SubscriberStatusTest {

    @Test
    void factory1() {
        SubscriberStatus subscriberStatus = new SubscriberStatus();
        subscriberStatus.setGroupKey("key");
        subscriberStatus.setLastTime(1L);
        subscriberStatus.setMd5("on time");
        subscriberStatus.setServerIp("/some/path.html");
        subscriberStatus.setStatus(false);
        assertThat(subscriberStatus.getGroupKey(), is("key"));
        assertThat(subscriberStatus.getLastTime(), is(1L));
        assertThat(subscriberStatus.getMd5(), is("on time"));
        assertThat(subscriberStatus.getServerIp(), is("/some/path.html"));
        assertThat(subscriberStatus.getStatus(), is(false));
    }

    @Test
    void factory2() {
        SubscriberStatus subscriberStatus =
             new SubscriberStatus("key", false, "on time", 1L);
        subscriberStatus.setGroupKey("key");
        subscriberStatus.setLastTime(1L);
        subscriberStatus.setMd5("on time");
        subscriberStatus.setServerIp("/some/path.html");
        subscriberStatus.setStatus(false);
        assertThat(subscriberStatus.getGroupKey(), is("key"));
        assertThat(subscriberStatus.getLastTime(), is(1L));
        assertThat(subscriberStatus.getMd5(), is("on time"));
        assertThat(subscriberStatus.getServerIp(), is("/some/path.html"));
        assertThat(subscriberStatus.getStatus(), is(false));
    }
}
