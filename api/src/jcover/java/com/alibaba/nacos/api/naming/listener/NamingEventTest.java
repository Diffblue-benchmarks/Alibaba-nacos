package com.alibaba.nacos.api.naming.listener;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.nacos.api.naming.pojo.Instance;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.api.naming.listener.NamingEvent
 *
 * @author Diffblue Cover
 */

class NamingEventTest {

    @Test
    void factory1() {
        ArrayList<Instance> instances1 = new ArrayList<Instance>();
        Instance instance1 = new Instance();
        instance1.setClusterName("John Smith");
        instance1.setEnabled(false);
        instance1.setEphemeral(false);
        instance1.setHealthy(false);
        instance1.setInstanceId("1234");
        instance1.setIp("foo");
        HashMap<String, String> metadata1 = new HashMap<String, String>();
        metadata1.put("foo", "foo");
        instance1.setMetadata(metadata1);
        instance1.setPort(1);
        instance1.setServiceName("Acme");
        instance1.setWeight(1.0);
        instances1.add(instance1);
        NamingEvent namingEvent =
             new NamingEvent("Acme", "Acme", "foo", instances1);
        namingEvent.setClusters("foo");
        namingEvent.setGroupName("Acme");
        ArrayList<Instance> instances2 = new ArrayList<Instance>();
        Instance instance2 = new Instance();
        instance2.setClusterName("John Smith");
        instance2.setEnabled(false);
        instance2.setEphemeral(false);
        instance2.setHealthy(false);
        instance2.setInstanceId("1234");
        instance2.setIp("foo");
        HashMap<String, String> metadata2 = new HashMap<String, String>();
        metadata2.put("foo", "foo");
        instance2.setMetadata(metadata2);
        instance2.setPort(1);
        instance2.setServiceName("Acme");
        instance2.setWeight(1.0);
        instances2.add(instance2);
        namingEvent.setInstances(instances2);
        namingEvent.setServiceName("Acme");
        assertThat(namingEvent.getClusters(), is("foo"));
        assertThat(namingEvent.getGroupName(), is("Acme"));
        assertThat(namingEvent.getInstances().size(), is(1));
        assertThat(namingEvent.getInstances().get(0), sameInstance(instance2));
        assertThat(namingEvent.getServiceName(), is("Acme"));
    }

    @Test
    void factory2() {
        ArrayList<Instance> instances1 = new ArrayList<Instance>();
        Instance instance1 = new Instance();
        instance1.setClusterName("John Smith");
        instance1.setEnabled(false);
        instance1.setEphemeral(false);
        instance1.setHealthy(false);
        instance1.setInstanceId("1234");
        instance1.setIp("foo");
        HashMap<String, String> metadata1 = new HashMap<String, String>();
        metadata1.put("foo", "foo");
        instance1.setMetadata(metadata1);
        instance1.setPort(1);
        instance1.setServiceName("Acme");
        instance1.setWeight(1.0);
        instances1.add(instance1);
        NamingEvent namingEvent = new NamingEvent("Acme", instances1);
        namingEvent.setClusters("foo");
        namingEvent.setGroupName("Acme");
        ArrayList<Instance> instances2 = new ArrayList<Instance>();
        Instance instance2 = new Instance();
        instance2.setClusterName("John Smith");
        instance2.setEnabled(false);
        instance2.setEphemeral(false);
        instance2.setHealthy(false);
        instance2.setInstanceId("1234");
        instance2.setIp("foo");
        HashMap<String, String> metadata2 = new HashMap<String, String>();
        metadata2.put("foo", "foo");
        instance2.setMetadata(metadata2);
        instance2.setPort(1);
        instance2.setServiceName("Acme");
        instance2.setWeight(1.0);
        instances2.add(instance2);
        namingEvent.setInstances(instances2);
        namingEvent.setServiceName("Acme");
        assertThat(namingEvent.getClusters(), is("foo"));
        assertThat(namingEvent.getGroupName(), is("Acme"));
        assertThat(namingEvent.getInstances().size(), is(1));
        assertThat(namingEvent.getInstances().get(0), sameInstance(instance2));
        assertThat(namingEvent.getServiceName(), is("Acme"));
    }
}
