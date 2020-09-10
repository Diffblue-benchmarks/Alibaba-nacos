package com.alibaba.nacos.naming.cluster.servers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.cluster.servers.Server
 *
 * @author Diffblue Cover
 */

public class ServerTest {

    @Test
    public void factory() {
        Server server = new Server();
        server.setAdWeight(0);
        server.setAlive(false);
        server.setIp("bar");
        server.setLastRefTime(1L);
        server.setLastRefTimeStr("Smith");
        server.setServePort(1);
        server.setSite("/some/path.html");
        server.setWeight(1);
        assertThat(server.getAdWeight(), is(0));
        assertThat(server.getIp(), is("bar"));
        assertThat(server.getLastRefTime(), is(1L));
        assertThat(server.getLastRefTimeStr(), is("Smith"));
        assertThat(server.getServePort(), is(1));
        assertThat(server.getSite(), is("/some/path.html"));
        assertThat(server.getWeight(), is(1));
        assertThat(server.isAlive(), is(false));
    }

    @Test
    public void getKey() {
        Server server = new Server();
        server.setIp("/some/path.html");
        server.setServePort(1);
        assertThat(server.getKey(), is("/some/path.html:1"));
    }

    @Test
    public void testEquals() {
        assertThat(new Server().equals(new Object()), is(false));
        assertThat(new Server().equals(null), is(false));
    }

    @Test
    public void compareTo() {
        Server server1 = new Server();
        server1.setIp("bar");
        Server server2 = new Server();
        server2.setIp("/some/path.html");
        assertThat(server1.compareTo(server2), is(51));
    }

    @Test
    public void compareToReturnsZero() {
        Server server1 = new Server();
        server1.setIp("/some/path.html");
        server1.setServePort(1);
        Server server2 = new Server();
        server2.setIp("/some/path.html");
        server2.setServePort(1);
        assertThat(server1.compareTo(server2), is(0));
    }

    @Test
    public void compareToServerIsNullReturnsOne() {
        assertThat(new Server().compareTo((Server) null), is(1));
    }
}
