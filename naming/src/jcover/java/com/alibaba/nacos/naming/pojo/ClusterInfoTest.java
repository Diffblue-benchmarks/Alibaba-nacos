package com.alibaba.nacos.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.pojo.ClusterInfo
 *
 * @author Diffblue JCover
 */

public class ClusterInfoTest {

    @Test(timeout=10000)
    public void getHostsReturnsNull() {
        assertThat(new ClusterInfo().getHosts(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setHostsToEmpty() {
        ClusterInfo clusterInfo = new ClusterInfo();
        List<IpAddressInfo> hosts = new ArrayList<IpAddressInfo>();
        clusterInfo.setHosts(hosts);
        assertThat(clusterInfo.getHosts(), sameInstance(hosts));
    }
}
