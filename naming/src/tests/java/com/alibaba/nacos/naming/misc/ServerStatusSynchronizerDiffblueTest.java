package com.alibaba.nacos.naming.misc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.misc.ServerStatusSynchronizer
 *
 * @author Diffblue JCover
 */

public class ServerStatusSynchronizerDiffblueTest {

    @Test(timeout=10000)
    public void getReturnsNull() {
        assertThat(new ServerStatusSynchronizer().get("New York", "New York"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void send1() {
        new ServerStatusSynchronizer().send("New York", new Message());
    }

    @Test(timeout=10000)
    public void send2() {
        new ServerStatusSynchronizer().send(":", new Message());
    }

    @Test(timeout=10000)
    public void sendServerIPIsBar() {
        new ServerStatusSynchronizer().send("bar", new Message());
    }

    @Test(timeout=10000)
    public void sendServerIPIsEmpty() {
        new ServerStatusSynchronizer().send("", new Message());
    }
}
