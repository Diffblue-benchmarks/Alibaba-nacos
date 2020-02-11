package com.alibaba.nacos.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.pojo.Subscriber
 *
 * @author Diffblue JCover
 */

public class SubscriberTest {

    @Test(timeout=10000)
    public void getAddrStrReturnsFoo() {
        assertThat(new Subscriber("foo", "foo", "foo", "foo", "foo", "/bin/bash").getAddrStr(), is("foo"));
    }

    @Test(timeout=10000)
    public void getAgentReturnsFoo() {
        assertThat(new Subscriber("foo", "foo", "foo", "foo", "foo", "/bin/bash").getAgent(), is("foo"));
    }

    @Test(timeout=10000)
    public void getAppReturnsFoo() {
        assertThat(new Subscriber("foo", "foo", "foo", "foo", "foo", "/bin/bash").getApp(), is("foo"));
    }

    @Test(timeout=10000)
    public void getIpReturnsFoo() {
        assertThat(new Subscriber("foo", "foo", "foo", "foo", "foo", "/bin/bash").getIp(), is("foo"));
    }

    @Test(timeout=10000)
    public void getNamespaceIdReturnsFoo() {
        assertThat(new Subscriber("foo", "foo", "foo", "foo", "foo", "/bin/bash").getNamespaceId(), is("foo"));
    }

    @Test(timeout=10000)
    public void getServiceName() {
        assertThat(new Subscriber("foo", "foo", "foo", "foo", "foo", "/bin/bash").getServiceName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setAddrStrToFoo() {
        new Subscriber("foo", "foo", "foo", "foo", "foo", "/bin/bash").setAddrStr("foo");
    }

    @Test(timeout=10000)
    public void setAgentToFoo() {
        new Subscriber("foo", "foo", "foo", "foo", "foo", "/bin/bash").setAgent("foo");
    }

    @Test(timeout=10000)
    public void setAppToFoo() {
        new Subscriber("foo", "foo", "foo", "foo", "foo", "/bin/bash").setApp("foo");
    }

    @Test(timeout=10000)
    public void setIpToFoo() {
        new Subscriber("foo", "foo", "foo", "foo", "foo", "/bin/bash").setIp("foo");
    }

    @Test(timeout=10000)
    public void setNamespaceIdToFoo() {
        new Subscriber("foo", "foo", "foo", "foo", "foo", "/bin/bash").setNamespaceId("foo");
    }

    @Test(timeout=10000)
    public void setServiceName() {
        new Subscriber("foo", "foo", "foo", "foo", "foo", "/bin/bash").setServiceName("/bin/bash");
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new Subscriber("foo", "foo", "foo", "foo", "foo", "bar").equals(new Object()), is(false));
        assertThat(new Subscriber("foo", "foo", "foo", "foo", "foo", "bar").equals(null), is(false));
    }
}
