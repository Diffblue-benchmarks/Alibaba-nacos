package com.alibaba.nacos.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.pojo.ServiceDetailInfo
 *
 * @author Diffblue Cover
 */

public class ServiceDetailInfoTest {

    @Test
    public void factory() {
        ServiceDetailInfo serviceDetailInfo = new ServiceDetailInfo();
        HashMap<String, ClusterInfo> clusterMap =
             new HashMap<String, ClusterInfo>();
        ClusterInfo x33 = new ClusterInfo();
        x33.setHosts(new ArrayList<IpAddressInfo>());
        clusterMap.put("foo", x33);
        serviceDetailInfo.setClusterMap(clusterMap);
        serviceDetailInfo.setGroupName("Acme");
        HashMap<String, String> metadata = new HashMap<String, String>();
        metadata.put("foo", "foo");
        serviceDetailInfo.setMetadata(metadata);
        serviceDetailInfo.setServiceName("Acme");
        assertThat(serviceDetailInfo.getClusterMap().get("foo"), sameInstance(x33));
        assertThat(serviceDetailInfo.getGroupName(), is("Acme"));
        assertThat(serviceDetailInfo.getMetadata().get("foo"), is("foo"));
        assertThat(serviceDetailInfo.getServiceName(), is("Acme"));
    }
}
