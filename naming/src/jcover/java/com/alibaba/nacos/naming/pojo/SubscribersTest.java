package com.alibaba.nacos.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.pojo.Subscribers
 *
 * @author Diffblue Cover
 */

public class SubscribersTest {

    @Test
    public void factory() {
        Subscribers subscribers1 = new Subscribers();
        ArrayList<Subscriber> subscribers2 = new ArrayList<Subscriber>();
        Subscriber subscriber =
             new Subscriber("foo", "foo", "foo", "foo", "1234", "Acme");
        subscriber.setAddrStr("foo");
        subscriber.setAgent("foo");
        subscriber.setApp("foo");
        subscriber.setIp("foo");
        subscriber.setNamespaceId("1234");
        subscriber.setServiceName("Acme");
        subscribers2.add(subscriber);
        subscribers1.setSubscribers(subscribers2);
        assertThat(subscribers1.getSubscribers().size(), is(1));
        assertThat(subscribers1.getSubscribers().get(0), sameInstance(subscriber));
    }
}
