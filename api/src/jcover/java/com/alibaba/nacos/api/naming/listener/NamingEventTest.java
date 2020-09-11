package com.alibaba.nacos.api.naming.listener;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;

import com.alibaba.nacos.api.naming.pojo.Instance;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.api.naming.listener.NamingEvent
 *
 * @author Diffblue Cover
 */

class NamingEventTest {

    @Test
    void factory1() {
        NamingEvent namingEvent =
             new NamingEvent("Acme", "Acme", "foo", new ArrayList<Instance>());
        namingEvent.setClusters("foo");
        namingEvent.setGroupName("Acme");
        namingEvent.setInstances(new ArrayList<Instance>());
        namingEvent.setServiceName("Acme");
        assertThat(namingEvent.getClusters(), is("foo"));
        assertThat(namingEvent.getGroupName(), is("Acme"));
        assertThat(namingEvent.getInstances(), empty());
        assertThat(namingEvent.getServiceName(), is("Acme"));
    }

    @Test
    void factory2() {
        NamingEvent namingEvent =
             new NamingEvent("Acme", new ArrayList<Instance>());
        namingEvent.setClusters("foo");
        namingEvent.setGroupName("Acme");
        namingEvent.setInstances(new ArrayList<Instance>());
        namingEvent.setServiceName("Acme");
        assertThat(namingEvent.getClusters(), is("foo"));
        assertThat(namingEvent.getGroupName(), is("Acme"));
        assertThat(namingEvent.getInstances(), empty());
        assertThat(namingEvent.getServiceName(), is("Acme"));
    }
}
