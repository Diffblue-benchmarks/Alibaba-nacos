package com.alibaba.nacos.naming.cluster.servers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.cluster.servers.Server
 *
 * @author Diffblue JCover
 */

public class ServerDiffblueTest {

    @Test(timeout=10000)
    public void compareTo() {
        assertThat(new Server().compareTo(new Server()), is(0));
        assertThat(new Server().compareTo((Server)null), is(1));
    }

    @Test(timeout=10000)
    public void getAdWeightReturnsZero() {
        assertThat(new Server().getAdWeight(), is(0));
    }

    @Test(timeout=10000)
    public void getIpReturnsNull() {
        assertThat(new Server().getIp(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getLastRefTimeReturnsZero() {
        assertThat(new Server().getLastRefTime(), is(0L));
    }

    @Test(timeout=10000)
    public void getLastRefTimeStrReturnsNull() {
        assertThat(new Server().getLastRefTimeStr(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getServePortReturnsZero() {
        assertThat(new Server().getServePort(), is(0));
    }

    @Test(timeout=10000)
    public void getSiteReturnsUnknown() {
        assertThat(new Server().getSite(), is("unknown"));
    }

    @Test(timeout=10000)
    public void getWeightReturnsOne() {
        assertThat(new Server().getWeight(), is(1));
    }

    @Test(timeout=10000)
    public void isAliveReturnsFalse() {
        assertThat(new Server().isAlive(), is(false));
    }

    @Test(timeout=10000)
    public void setAdWeightToOne() {
        Server server = new Server();
        server.setAdWeight(1);
        assertThat(server.getAdWeight(), is(1));
    }

    @Test(timeout=10000)
    public void setAliveToFalse() {
        new Server().setAlive(false);
    }

    @Test(timeout=10000)
    public void setIpToFoo() {
        Server server = new Server();
        server.setIp("foo");
        assertThat(server.getIp(), is("foo"));
        assertThat(server.getKey(), is("foo:0"));
    }

    @Test(timeout=10000)
    public void setLastRefTimeStrToSmith() {
        Server server = new Server();
        server.setLastRefTimeStr("Smith");
        assertThat(server.getLastRefTimeStr(), is("Smith"));
    }

    @Test(timeout=10000)
    public void setLastRefTimeToOne() {
        Server server = new Server();
        server.setLastRefTime(1L);
        assertThat(server.getLastRefTime(), is(1L));
    }

    @Test(timeout=10000)
    public void setServePortToOne() {
        Server server = new Server();
        server.setServePort(1);
        assertThat(server.getKey(), is("null:1"));
        assertThat(server.getServePort(), is(1));
    }

    @Test(timeout=10000)
    public void setSiteToFoo() {
        Server server = new Server();
        server.setSite("foo");
        assertThat(server.getSite(), is("foo"));
    }

    @Test(timeout=10000)
    public void setWeightToOne() {
        new Server().setWeight(1);
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new Server().equals("foo"), is(false));
        assertThat(new Server().equals(null), is(false));
    }
}
