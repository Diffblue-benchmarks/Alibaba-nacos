package com.alibaba.nacos.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;

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
        subscribers1.setSubscribers(new ArrayList<Subscriber>());
        assertThat(subscribers1.getSubscribers(), empty());
    }
}
