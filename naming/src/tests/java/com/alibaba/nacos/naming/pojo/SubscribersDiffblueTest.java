package com.alibaba.nacos.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.pojo.Subscribers
 *
 * @author Diffblue JCover
 */

public class SubscribersDiffblueTest {

    @Test(timeout=10000)
    public void getSubscribersReturnsNull() {
        assertThat(new Subscribers().getSubscribers(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setSubscribersToEmpty() {
        Subscribers subscribers1 = new Subscribers();
        List<Subscriber> subscribers2 = new ArrayList<Subscriber>();
        subscribers1.setSubscribers(subscribers2);
        assertThat(subscribers1.getSubscribers(), sameInstance(subscribers2));
    }
}
