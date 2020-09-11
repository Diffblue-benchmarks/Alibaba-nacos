package com.alibaba.nacos.naming.core;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.core.Instances
 *
 * @author Diffblue Cover
 */

public class InstancesTest {

    @Test
    public void factory() {
        Instances instances = new Instances();
        ArrayList<Instance> instanceList = new ArrayList<Instance>();
        Instance instance = new Instance();
        instance.setApp("DE");
        instance.setBeingChecked(false);
        instance.setCheckRT(1L);
        instance.setLastBeat(1L);
        instance.setMarked(false);
        instance.setMockValid(false);
        instance.setTenant("DE");
        instance.setClusterName("John Smith");
        instance.setEnabled(false);
        instance.setEphemeral(false);
        instance.setHealthy(false);
        instance.setInstanceId("1234");
        instance.setIp("DE");
        HashMap<String, String> metadata = new HashMap<String, String>();
        metadata.put("foo", "foo");
        instance.setMetadata(metadata);
        instance.setPort(1);
        instance.setServiceName("Acme");
        instance.setWeight(1.0);
        instanceList.add(instance);
        instances.setInstanceList(instanceList);
        assertThat(instances.getCachedChecksum(), is(nullValue()));
        assertThat(instances.getInstanceList().size(), is(1));
        assertThat(instances.getInstanceList().get(0), sameInstance(instance));
    }

    @Test
    public void getChecksum1() {
        Instances instances = new Instances();
        assertThat(instances.getChecksum(), is("d41d8cd98f00b204e9800998ecf8427e"));
        assertThat(instances.getCachedChecksum(), is("d41d8cd98f00b204e9800998ecf8427e"));
    }

    @Test
    public void getChecksum2() {
        Instances instances = new Instances();
        ArrayList<Instance> instanceList = new ArrayList<Instance>();
        Instance instance = new Instance();
        instance.setClusterName("John Smith");
        instance.setEnabled(false);
        instance.setHealthy(false);
        instance.setIp("DE");
        HashMap<String, String> metadata = new HashMap<String, String>();
        metadata.put("foo", "foo");
        instance.setMetadata(metadata);
        instance.setPort(1);
        instanceList.add(instance);
        instances.setInstanceList(instanceList);
        assertThat(instances.getChecksum(), is("46019e5e5dcc2298fc9355b651d902a"));
        assertThat(instances.getCachedChecksum(), is("46019e5e5dcc2298fc9355b651d902a"));
    }

    @Test
    public void convertMap2StringMapIsFoo() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("bar", "foo");
        assertThat(new Instances().convertMap2String(map), is("bar:foo,"));
    }

    @Test
    public void convertMap2StringMapIsNullReturnsEmpty() {
        assertThat(new Instances().convertMap2String(null), is(""));
    }
}
