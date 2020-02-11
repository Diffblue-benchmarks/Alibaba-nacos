package com.alibaba.nacos.naming.core;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.nacos.naming.healthcheck.RsInfo;
import com.alibaba.nacos.naming.selector.Selector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.core.Service
 *
 * @author Diffblue JCover
 */

public class ServiceTest {

    @Test(timeout=10000)
    public void addCluster() {
        Service service1 = new Service();
        Cluster cluster = new Cluster();
        service1.addCluster(cluster);
        assertThat(service1.getClusterMap().get(null), sameInstance(cluster));
        assertThat(service1.getServiceString(), is("{\"invalidIPCount\":0,\"ipCount\":0,\"owners\":[],\"protectThreshold\":0.0,\"clusters\":[{\"healthChecker\":{\"type\":\"TCP\"},\"defIPPort\":80,\"defCkport\":80,\"useIPPort4Check\":true,\"sitegroup\":\"\"}]}"));
    }

    @Test(timeout=10000)
    public void allIPs1() {
        List<String> clusters = new ArrayList<String>();
        ((ArrayList<String>)clusters).add("OX13QD");
        assertThat(new Service().allIPs(clusters), empty());
    }

    @Test(timeout=10000)
    public void allIPs2() {
        assertThat(new Service().allIPs(new ArrayList<String>()), empty());
        assertThat(new Service().allIPs(false), empty());
    }

    @Test(timeout=10000)
    public void destroy() throws Exception {
        new Service("0").destroy();
    }

    @Test(timeout=10000)
    public void getIpDeleteTimeout() {
        assertThat(new Service().getIpDeleteTimeout(), is(30_000L));
    }

    @Test(timeout=10000)
    public void getLastModifiedMillisReturnsZero() {
        assertThat(new Service().getLastModifiedMillis(), is(0L));
    }

    @Test(timeout=10000)
    public void getServiceString() {
        assertThat(new Service().getServiceString(), is("{\"invalidIPCount\":0,\"ipCount\":0,\"owners\":[],\"protectThreshold\":0.0,\"clusters\":[]}"));
    }

    @Test(timeout=10000)
    public void healthyInstanceCountReturnsZero() {
        assertThat(new Service().healthyInstanceCount(), is(0));
    }

    @Test(timeout=10000)
    public void interestsReturnsFalse() {
        assertThat(new Service().interests("OX13QD"), is(false));
    }

    @Test(timeout=10000)
    public void matchUnlistenKeyReturnsFalse() {
        assertThat(new Service().matchUnlistenKey("OX13QD"), is(false));
    }

    @Test(timeout=10000)
    public void meetProtectThreshold() {
        assertThat(new Service().meetProtectThreshold(), is(false));
        assertThat(new Service("0").meetProtectThreshold(), is(false));
    }

    @Test(timeout=10000)
    public void onDelete() throws Exception {
        new Service().onDelete("OX13QD");
    }

    @Test(timeout=10000)
    public void processClientBeat() {
        new Service().processClientBeat(new RsInfo());
    }

    @Test(timeout=10000)
    public void recalculateChecksum() {
        new Service().recalculateChecksum();
    }

    @Test(timeout=10000)
    public void setClusterMapToEmpty() {
        Service service1 = new Service();
        Map<String, Cluster> clusterMap = new HashMap<String, Cluster>();
        service1.setClusterMap(clusterMap);
        assertThat(service1.getClusterMap(), sameInstance(clusterMap));
    }

    @Test(timeout=10000)
    public void setEnabledToFalse() {
        Service service = new Service();
        service.setEnabled(false);
        assertThat(service.getEnabled(), is(false));
    }

    @Test(timeout=10000)
    public void setIpDeleteTimeoutToOne() {
        Service service = new Service();
        service.setIpDeleteTimeout(1L);
        assertThat(service.getIpDeleteTimeout(), is(1L));
    }

    @Test(timeout=10000)
    public void setLastModifiedMillisToOne() {
        Service service = new Service();
        service.setLastModifiedMillis(1L);
        assertThat(service.getLastModifiedMillis(), is(1L));
    }

    @Test(timeout=10000)
    public void setNamespaceId() {
        Service service = new Service();
        service.setNamespaceId("OX13QD");
        assertThat(service.getNamespaceId(), is("OX13QD"));
    }

    @Test(timeout=10000)
    public void setOwnersToEmpty() {
        Service service = new Service();
        List<String> owners = new ArrayList<String>();
        service.setOwners(owners);
        assertThat(service.getOwners(), sameInstance(owners));
    }

    @Test(timeout=10000)
    public void setResetWeightToFalse() {
        new Service().setResetWeight(false);
    }

    @Test(timeout=10000)
    public void setSelector() {
        Service service = new Service();
        Selector selector = mock(Selector.class);
        service.setSelector(selector);
        assertThat(service.getSelector(), sameInstance(selector));
    }

    @Test(timeout=10000)
    public void setToken() {
        Service service = new Service();
        service.setToken("OX13QD");
        assertThat(service.getServiceString(), is("{\"invalidIPCount\":0,\"ipCount\":0,\"owners\":[],\"protectThreshold\":0.0,\"clusters\":[],\"token\":\"OX13QD\"}"));
        assertThat(service.getToken(), is("OX13QD"));
    }

    @Test(timeout=10000)
    public void srvIPs() {
        List<String> clusters = new ArrayList<String>();
        ((ArrayList<String>)clusters).add("OX13QD");
        assertThat(new Service().srvIPs(clusters), empty());
    }

    @Test(timeout=10000)
    public void srvIPsClustersIsEmpty() {
        assertThat(new Service().srvIPs(new ArrayList<String>()), empty());
    }

    @Test(timeout=10000)
    public void toJSON() {
        assertThat(new Service().toJSON(), is("{\"checksum\":\"28db44891d718c6872a04bc11ec58ab0\",\"clusterMap\":{},\"enabled\":true,\"ipDeleteTimeout\":30000,\"lastModifiedMillis\":0,\"metadata\":{},\"owners\":[],\"protectThreshold\":0.0,\"resetWeight\":false,\"selector\":{\"type\":\"none\"}}"));
    }

    @Test(timeout=10000)
    public void update() {
        new Service().update(new Service());
    }
}
