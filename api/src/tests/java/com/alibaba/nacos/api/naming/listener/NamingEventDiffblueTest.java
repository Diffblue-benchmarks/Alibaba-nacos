package com.alibaba.nacos.api.naming.listener;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.api.naming.listener.NamingEvent
 *
 * @author Diffblue JCover
 */

public class NamingEventDiffblueTest {

    @Test(timeout=10000)
    public void getClustersReturnsFoo() {
        assertThat(new NamingEvent("/bin/bash", "/bin/bash", "foo", new ArrayList<com.alibaba.nacos.api.naming.pojo.Instance>()).getClusters(), is("foo"));
    }

    @Test(timeout=10000)
    public void getGroupName() {
        assertThat(new NamingEvent("/bin/bash", "/bin/bash", "foo", new ArrayList<com.alibaba.nacos.api.naming.pojo.Instance>()).getGroupName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void getInstances() {
        List<com.alibaba.nacos.api.naming.pojo.Instance> instances1 = new ArrayList<com.alibaba.nacos.api.naming.pojo.Instance>();
        assertThat(new NamingEvent("/bin/bash", "/bin/bash", "foo", instances1).getInstances(), sameInstance(instances1));
    }

    @Test(timeout=10000)
    public void getServiceName() {
        assertThat(new NamingEvent("/bin/bash", "/bin/bash", "foo", new ArrayList<com.alibaba.nacos.api.naming.pojo.Instance>()).getServiceName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setClustersToFoo() {
        new NamingEvent("/bin/bash", "/bin/bash", "foo", new ArrayList<com.alibaba.nacos.api.naming.pojo.Instance>()).setClusters("foo");
    }

    @Test(timeout=10000)
    public void setGroupName() {
        new NamingEvent("/bin/bash", "/bin/bash", "foo", new ArrayList<com.alibaba.nacos.api.naming.pojo.Instance>()).setGroupName("/bin/bash");
    }

    @Test(timeout=10000)
    public void setInstancesToEmpty() {
        NamingEvent namingEvent = new NamingEvent("/bin/bash", "/bin/bash", "foo", new ArrayList<com.alibaba.nacos.api.naming.pojo.Instance>());
        List<com.alibaba.nacos.api.naming.pojo.Instance> instances2 = new ArrayList<com.alibaba.nacos.api.naming.pojo.Instance>();
        namingEvent.setInstances(instances2);
        assertThat(namingEvent.getInstances(), sameInstance(instances2));
    }

    @Test(timeout=10000)
    public void setServiceName() {
        new NamingEvent("/bin/bash", "/bin/bash", "foo", new ArrayList<com.alibaba.nacos.api.naming.pojo.Instance>()).setServiceName("/bin/bash");
    }
}
