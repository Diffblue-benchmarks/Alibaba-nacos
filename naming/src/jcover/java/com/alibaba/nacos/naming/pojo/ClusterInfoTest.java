package com.alibaba.nacos.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;

import java.util.ArrayList;

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
        clusterInfo.setHosts(new ArrayList<IpAddressInfo>());
        assertThat(clusterInfo.getHosts(), empty());
    }
}
