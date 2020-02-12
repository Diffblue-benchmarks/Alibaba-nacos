package com.alibaba.nacos.naming.core;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.nacos.naming.consistency.persistent.raft.RaftPeerSet;

import java.util.ArrayList;
import java.util.Set;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.core.ServiceManager
 *
 * @author Diffblue JCover
 */

public class ServiceManagerDiffblueTest {

    @Test(timeout=10000)
    public void addUpdatedService2Queue() {
        new ServiceManager().addUpdatedService2Queue("OX13QD", "/bin/bash", "OX13QD", "OX13QD");
    }

    @Test(timeout=10000)
    public void containServiceServiceNameIsDReturnsFalse() {
        assertThat(new ServiceManager().containService("OX13QD", "D"), is(false));
    }

    @Test(timeout=10000)
    public void getAllNamespacesReturnsEmpty() {
        ServiceManager serviceManager = new ServiceManager();
        Set<String> result = serviceManager.getAllNamespaces();
        assertThat(result, empty());
        assertThat(serviceManager.getAllNamespaces(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getAllServiceNameListNamespaceIdIsSmithReturnsEmpty() {
        assertThat(new ServiceManager().getAllServiceNameList("Smith"), empty());
    }

    @Test(timeout=10000)
    public void getInstanceCountReturnsZero() {
        assertThat(new ServiceManager().getInstanceCount(), is(0));
    }

    @Test(timeout=10000)
    public void getInstancePortIsOneAndServiceNameIsDReturnsNull() {
        assertThat(new ServiceManager().getInstance("OX13QD", "D", "OX13QD", "OX13QD", 1), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getPagedClusterState() {
        assertThat(new ServiceManager().getPagedClusterState("New York", 1, 1, "", "New York", new ArrayList<com.alibaba.nacos.naming.consistency.persistent.raft.RaftPeer>(), new RaftPeerSet()), is(0));
        assertThat(new ServiceManager().getPagedClusterState("New York", 1, -1, "New York", "New York", new ArrayList<com.alibaba.nacos.naming.consistency.persistent.raft.RaftPeer>(), new RaftPeerSet()), is(0));
        assertThat(new ServiceManager().getPagedClusterState("New York", 0, 1, "New York", "New York", new ArrayList<com.alibaba.nacos.naming.consistency.persistent.raft.RaftPeer>(), new RaftPeerSet()), is(0));
    }

    @Test(timeout=10000)
    public void getPagedServicePageSizeIsOneAndServiceListIsEmptyAndStartPageIsZeroReturnsZero() {
        assertThat(new ServiceManager().getPagedService("OX13QD", 0, 1, "OX13QD", "OX13QD", new ArrayList<Service>()), is(0));
    }

    @Test(timeout=10000)
    public void getResponsibleInstanceCountReturnsZero() {
        assertThat(new ServiceManager().getResponsibleInstanceCount(), is(0));
    }

    @Test(timeout=10000)
    public void getResponsibleServiceCountReturnsZero() {
        assertThat(new ServiceManager().getResponsibleServiceCount(), is(0));
    }

    @Test(timeout=10000)
    public void getServiceCountReturnsZero() {
        assertThat(new ServiceManager().getServiceCount(), is(0));
    }

    @Test(timeout=10000)
    public void getServiceMapReturnsNull() {
        assertThat(new ServiceManager().getServiceMap("OX13QD"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void interestsReturnsFalse() {
        assertThat(new ServiceManager().interests("OX13QD"), is(false));
    }

    @Test(timeout=10000)
    public void isEmpty() {
        assertThat(new ServiceManager().getAllServiceNames().isEmpty(), is(true));
        assertThat(new ServiceManager().getResponsibleServices().isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void matchUnlistenKeyReturnsFalse() {
        assertThat(new ServiceManager().matchUnlistenKey("OX13QD"), is(false));
    }

    @Test(timeout=10000)
    public void onChange1() throws Exception {
        ServiceManager serviceManager = new ServiceManager();
        Service service = new Service();
        serviceManager.onChange("OX13QD", service);
        assertThat(service.getNamespaceId(), is("public"));
        assertThat(serviceManager.getAllNamespaces(), hasItem("public"));
        assertThat(serviceManager.getAllServiceNames().get("public"), empty());
        assertThat(serviceManager.getResponsibleServices().get("public"), empty());
    }

    @Test(timeout=10000)
    public void onChange2() throws Exception {
        ServiceManager serviceManager = new ServiceManager();
        Service service = new Service("/bin/bash");
        serviceManager.onChange("OX13QD", service);
        assertThat(service.getNamespaceId(), is("public"));
        assertThat(serviceManager.getAllNamespaces(), hasItem("public"));
        assertThat(serviceManager.getAllServiceNames().get("public"), hasItem("/bin/bash"));
        assertThat(serviceManager.getServiceCount(), is(1));
    }

    @Test(timeout=10000)
    public void onChangeServiceIsNull() throws Exception {
        new ServiceManager().onChange("OX13QD", (Service)null);
    }
}
