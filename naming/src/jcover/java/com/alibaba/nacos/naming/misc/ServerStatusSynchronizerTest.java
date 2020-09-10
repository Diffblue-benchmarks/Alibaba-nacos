package com.alibaba.nacos.naming.misc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.misc.ServerStatusSynchronizer
 *
 * @author Diffblue Cover
 */

public class ServerStatusSynchronizerTest {

    @Test
    public void send1() {
        new ServerStatusSynchronizer().send(":", new Message());
    }

    @Test
    public void send2() {
        new ServerStatusSynchronizer().send("S failed to request serverStatus, remote server:", new Message());
    }

    @Test
    public void sendServerIPIsBar() {
        new ServerStatusSynchronizer().send("bar", new Message());
    }

    @Test
    public void sendServerIPIsEmpty() {
        new ServerStatusSynchronizer().send("", new Message());
    }

    @Test
    public void getKeyIsKeyReturnsNull() {
        assertThat(new ServerStatusSynchronizer().get("/some/path.html", "key"), is(nullValue()));
    }
}
