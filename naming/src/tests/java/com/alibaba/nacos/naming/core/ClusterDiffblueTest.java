package com.alibaba.nacos.naming.core;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.core.Cluster
 *
 * @author Diffblue JCover
 */

public class ClusterDiffblueTest {

    @Test(timeout=10000)
    public void allIPs() {
        assertThat(new Cluster().allIPs(), empty());
        assertThat(new Cluster().allIPs(false), empty());
        assertThat(new Cluster().allIPs(true), empty());
    }

    @Test(timeout=10000)
    public void containsReturnsFalse() {
        assertThat(new Cluster().contains(new Instance("OX13QD", 1)), is(false));
    }

    @Test(timeout=10000)
    public void destroy() {
        new Cluster().destroy();
    }

    @Test(timeout=10000)
    public void getDefCkport() {
        assertThat(new Cluster().getDefCkport(), is(80));
    }

    @Test(timeout=10000)
    public void getDefIPPort() {
        assertThat(new Cluster().getDefIPPort(), is(80));
    }

    @Test(timeout=10000)
    public void getHealthCheckTaskReturnsNull() {
        assertThat(new Cluster().getHealthCheckTask(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getServiceName() {
        assertThat(new Cluster().getServiceName(), is(nullValue()));
        assertThat(new Cluster("0", new Service()).getServiceName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getServiceReturnsNull() {
        assertThat(new Cluster().getService(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getSitegroupReturnsEmpty() {
        assertThat(new Cluster().getSitegroup(), is(""));
    }

    @Test(timeout=10000)
    public void setDefCkportToOne() {
        Cluster cluster = new Cluster();
        cluster.setDefCkport(1);
        assertThat(cluster.getDefCkport(), is(1));
        assertThat(cluster.getDefIPPort(), is(1));
    }

    @Test(timeout=10000)
    public void setDefIPPortToOne() {
        Cluster cluster = new Cluster();
        cluster.setDefIPPort(1);
        assertThat(cluster.getDefIPPort(), is(1));
    }

    @Test(timeout=10000)
    public void setService1() {
        Cluster cluster = new Cluster();
        Service service2 = new Service();
        cluster.setService(service2);
        assertThat(cluster.getService(), sameInstance(service2));
    }

    @Test(timeout=10000)
    public void setService2() {
        new Cluster("0", new Service()).setService(new Service());
    }

    @Test(timeout=10000)
    public void setServiceName() {
        Cluster cluster = new Cluster();
        cluster.setServiceName("/bin/bash");
        assertThat(cluster.getServiceName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setSitegroup() {
        Cluster cluster = new Cluster();
        cluster.setSitegroup("OX13QD");
        assertThat(cluster.getSitegroup(), is("OX13QD"));
    }

    @Test(timeout=10000)
    public void subtract() {
        Collection<Instance> a = new LinkedList<Instance>();
        ((LinkedList<Instance>)a).add(new Instance());
        Collection<Instance> b = new LinkedList<Instance>();
        ((LinkedList<Instance>)b).add(new Instance());
        assertThat(new Cluster().subtract(a, b), empty());
    }

    @Test(timeout=10000)
    public void subtractAIsEmpty() {
        Collection<Instance> b = new LinkedList<Instance>();
        ((LinkedList<Instance>)b).add(new Instance());
        assertThat(new Cluster().subtract(new LinkedList<Instance>(), b), empty());
    }

    @Test(timeout=10000)
    public void subtractAIsEmptyAndBIsEmpty() {
        assertThat(new Cluster().subtract(new LinkedList<Instance>(), new LinkedList<Instance>()), empty());
    }

    @Test(timeout=10000)
    public void subtractBIsEmpty() {
        Collection<Instance> a = new LinkedList<Instance>();
        Instance instance1 = new Instance();
        ((LinkedList<Instance>)a).add(instance1);
        assertThat(new Cluster().subtract(a, new LinkedList<Instance>()), hasSize(1));
        assertThat(new Cluster().subtract(a, new LinkedList<Instance>()).get(0), sameInstance(instance1));
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new Cluster().equals("foo"), is(false));
        assertThat(new Cluster("0", new Service()).equals("foo"), is(false));
        assertThat(new Cluster().equals(null), is(false));
    }

    @Test(timeout=10000)
    public void update() {
        new Cluster("0", new Service()).update(new Cluster());
    }

    @Test(timeout=10000)
    public void updatedIPsAIsEmptyAndBIsEmptyReturnsEmpty() {
        assertThat(new Cluster().updatedIPs(new LinkedList<Instance>(), new LinkedList<Instance>()), empty());
    }

    @Test(timeout=10000)
    public void updateIPsEphemeralIsFalse() {
        new Cluster().updateIPs(new ArrayList<Instance>(), false);
    }

    @Test(timeout=10000)
    public void updateIPsEphemeralIsTrue() {
        new Cluster().updateIPs(new ArrayList<Instance>(), true);
    }
}
