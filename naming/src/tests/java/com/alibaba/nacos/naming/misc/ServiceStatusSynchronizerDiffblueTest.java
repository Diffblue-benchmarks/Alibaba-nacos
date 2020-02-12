package com.alibaba.nacos.naming.misc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.misc.ServiceStatusSynchronizer
 *
 * @author Diffblue JCover
 */

public class ServiceStatusSynchronizerDiffblueTest {

    @Test(timeout=10000)
    public void get() {
        assertThat(new ServiceStatusSynchronizer().get("bar", "New York"), is(nullValue()));
        assertThat(new ServiceStatusSynchronizer().get(null, "New York"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void send1() {
        new ServiceStatusSynchronizer().send("New York", new Message());
    }

    @Test(timeout=10000)
    public void send2() {
        new ServiceStatusSynchronizer().send(":", new Message());
    }

    @Test(timeout=10000)
    public void sendServerIPIsBar() {
        new ServiceStatusSynchronizer().send("bar", new Message());
    }

    @Test(timeout=10000)
    public void sendServerIPIsNull() {
        new ServiceStatusSynchronizer().send(null, new Message());
    }
}
