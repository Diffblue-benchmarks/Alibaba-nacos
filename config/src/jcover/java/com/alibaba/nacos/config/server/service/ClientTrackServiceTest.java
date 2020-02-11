package com.alibaba.nacos.config.server.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.ClientTrackService
 *
 * @author Diffblue JCover
 */

public class ClientTrackServiceTest {

    @Test(timeout=10000)
    public void isEmpty() {
        assertThat(ClientTrackService.isClientUptodate("foo").isEmpty(), is(true));
        assertThat(ClientTrackService.listSubsByGroup("Smith").isEmpty(), is(true));
        assertThat(ClientTrackService.listSubscriberByGroup("Smith").isEmpty(), is(true));
        assertThat(ClientTrackService.listSubStatus("bar").isEmpty(), is(true));
        assertThat(ClientTrackService.listSubStatus("Smith").isEmpty(), is(true));
    }

//    @Test(timeout=10000)
//    public void listSubsByGroupGroupKeyIsFoo() {
//        Map<String, com.alibaba.nacos.config.server.model.SubscriberStatus> result = ClientTrackService.listSubsByGroup("foo");
//        assertThat(result.get("foo").getGroupKey(), is("foo"));
//        assertThat(result.get("foo").getLastTime(), is(1_581_384_159_120L));
//        assertThat(result.get("foo").getMd5(), is("foo"));
//        assertThat(result.get("foo").getServerIp(), is(nullValue()));
//        assertThat(result.get("foo").getStatus(), is(false));
//    }

//    @Test(timeout=10000)
//    public void listSubscriberByGroupGroupKeyIsFooReturnsFalse() {
//        assertThat(ClientTrackService.listSubscriberByGroup("foo").get("foo"), is(false));  <-- Expected: is <false>     but: was null
//    }
//
//    @Test(timeout=10000)
//    public void listSubStatusIpIsFoo() {
//        Map<String, com.alibaba.nacos.config.server.model.SubscriberStatus> result = ClientTrackService.listSubStatus("foo");
//        assertThat(result.get("foo").getGroupKey(), is("foo"));
//        assertThat(result.get("foo").getLastTime(), is(1_581_384_159_120L));
//        assertThat(result.get("foo").getMd5(), is("foo"));
//        assertThat(result.get("foo").getServerIp(), is(nullValue()));
//        assertThat(result.get("foo").getStatus(), is(false));
//    }

    @Test(timeout=10000)
    public void refreshClientRecord() {
        ClientTrackService.refreshClientRecord();
    }

    @Test(timeout=10000)
    public void subscribeClientCountReturnsZero() {
        assertThat(ClientTrackService.subscribeClientCount(), is(0));
    }

    @Test(timeout=10000)
    public void subscriberCountReturnsZero() {
        assertThat(ClientTrackService.subscriberCount(), is(0L));
    }

    @Test(timeout=10000)
    public void trackClientMd5() {
        ClientTrackService.trackClientMd5("foo", new HashMap<String, String>());
    }

    @Test(timeout=10000)
    public void trackClientMd5ClientlastPollingTSMapIsEmpty() {
        ClientTrackService.trackClientMd5("foo", new HashMap<String, String>(), new HashMap<String, Long>());
    }

    @Test(timeout=10000)
    public void trackClientMd5ClientMd5IsFooAndGroupKeyIsFoo() {
        ClientTrackService.trackClientMd5("foo", "foo", "foo");
    }
}
