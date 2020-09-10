package com.alibaba.nacos.naming.misc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.misc.ServiceStatusSynchronizer
 *
 * @author Diffblue Cover
 */

public class ServiceStatusSynchronizerTest {

    @Test
    public void send1() {
        new ServiceStatusSynchronizer().send(":", new Message());
    }

    @Test
    public void send2() {
        new ServiceStatusSynchronizer().send("S Failed to get service status from ", new Message());
    }

    @Test
    public void sendServerIPIsBar() {
        new ServiceStatusSynchronizer().send("bar", new Message());
    }

    @Test
    public void sendServerIPIsNull() {
        new ServiceStatusSynchronizer().send(null, new Message());
    }

    @Test
    public void get() {
        assertThat(new ServiceStatusSynchronizer().get("bar", "key"), is(nullValue()));
        assertThat(new ServiceStatusSynchronizer().get(null, "key"), is(nullValue()));
    }
}
