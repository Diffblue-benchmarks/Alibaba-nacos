package com.alibaba.nacos.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.pojo.ClusterInfo
 *
 * @author Diffblue Cover
 */

public class ClusterInfoTest {

    @Test
    public void factory() {
        ClusterInfo clusterInfo = new ClusterInfo();
        ArrayList<IpAddressInfo> hosts = new ArrayList<IpAddressInfo>();
        IpAddressInfo ipAddressInfo = new IpAddressInfo();
        ipAddressInfo.setEnabled(false);
        ipAddressInfo.setIp("280 Broadway");
        ipAddressInfo.setMetadata(new HashMap<String, String>());
        ipAddressInfo.setPort(1);
        ipAddressInfo.setValid(false);
        ipAddressInfo.setWeight(1.0);
        hosts.add(ipAddressInfo);
        clusterInfo.setHosts(hosts);
        assertThat(clusterInfo.getHosts().size(), is(1));
        assertThat(clusterInfo.getHosts().get(0), sameInstance(ipAddressInfo));
    }
}
