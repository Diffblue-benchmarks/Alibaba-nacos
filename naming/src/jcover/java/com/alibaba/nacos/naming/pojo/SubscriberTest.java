package com.alibaba.nacos.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.pojo.Subscriber
 *
 * @author Diffblue Cover
 */

public class SubscriberTest {

    @Test
    public void factory() {
        Subscriber subscriber =
             new Subscriber("foo", "foo", "foo", "foo", "1234", "Acme");
        subscriber.setAddrStr("foo");
        subscriber.setAgent("foo");
        subscriber.setApp("foo");
        subscriber.setIp("foo");
        subscriber.setNamespaceId("1234");
        subscriber.setServiceName("Acme");
        assertThat(subscriber.getAddrStr(), is("foo"));
        assertThat(subscriber.getAgent(), is("foo"));
        assertThat(subscriber.getApp(), is("foo"));
        assertThat(subscriber.getIp(), is("foo"));
        assertThat(subscriber.getNamespaceId(), is("1234"));
        assertThat(subscriber.getServiceName(), is("Acme"));
    }

    @Test
    public void testEquals() {
        assertThat(new Subscriber("bar", "foo", "foo", "foo", "1234", "Acme").equals(new Object()), is(false));
        assertThat(new Subscriber("bar", "foo", "foo", "foo", "1234", "Acme").equals(null), is(false));
    }
}
