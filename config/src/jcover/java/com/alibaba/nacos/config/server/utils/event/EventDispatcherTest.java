package com.alibaba.nacos.config.server.utils.event;

import com.alibaba.nacos.config.server.service.ConfigDataChangeEvent;
import com.alibaba.nacos.config.server.service.LongPollingService;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.event.EventDispatcher
 *
 * @author Diffblue Cover
 */

class EventDispatcherTest {

    @Test
    void addEventListener1() {
        LongPollingService listener = new LongPollingService();
        HashMap<String, Long> retainIps = new HashMap<String, Long>();
        retainIps.put("foo", 1L);
        listener.setRetainIps(retainIps);
        EventDispatcher.addEventListener(listener);
    }

    @Test
    void addEventListener2() {
        LongPollingService listener = new LongPollingService();
        HashMap<String, Long> retainIps = new HashMap<String, Long>();
        retainIps.put("foo", 1L);
        listener.setRetainIps(retainIps);
        EventDispatcher.addEventListener(listener);
    }

    @Test
    void fireEvent1() {
        EventDispatcher.fireEvent(new ConfigDataChangeEvent("something", "something", 1L));
    }

    @Test
    void fireEvent2() {
        EventDispatcher.fireEvent(new ConfigDataChangeEvent("bar", "something", 1L));
    }

    @Test
    void clear() {
        EventDispatcher.clear();
    }
}
