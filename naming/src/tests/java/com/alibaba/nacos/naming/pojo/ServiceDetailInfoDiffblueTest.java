package com.alibaba.nacos.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.pojo.ServiceDetailInfo
 *
 * @author Diffblue JCover
 */

public class ServiceDetailInfoDiffblueTest {

    @Test(timeout=10000)
    public void getClusterMapReturnsNull() {
        assertThat(new ServiceDetailInfo().getClusterMap(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getGroupNameReturnsNull() {
        assertThat(new ServiceDetailInfo().getGroupName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getMetadataReturnsNull() {
        assertThat(new ServiceDetailInfo().getMetadata(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getServiceNameReturnsNull() {
        assertThat(new ServiceDetailInfo().getServiceName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setClusterMapToEmpty() {
        ServiceDetailInfo serviceDetailInfo = new ServiceDetailInfo();
        Map<String, ClusterInfo> clusterMap = new HashMap<String, ClusterInfo>();
        serviceDetailInfo.setClusterMap(clusterMap);
        assertThat(serviceDetailInfo.getClusterMap(), sameInstance(clusterMap));
    }

    @Test(timeout=10000)
    public void setGroupName() {
        ServiceDetailInfo serviceDetailInfo = new ServiceDetailInfo();
        serviceDetailInfo.setGroupName("/bin/bash");
        assertThat(serviceDetailInfo.getGroupName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setMetadataToEmpty() {
        ServiceDetailInfo serviceDetailInfo = new ServiceDetailInfo();
        Map<String, String> metadata = new HashMap<String, String>();
        serviceDetailInfo.setMetadata(metadata);
        assertThat(serviceDetailInfo.getMetadata(), sameInstance(metadata));
    }

    @Test(timeout=10000)
    public void setServiceName() {
        ServiceDetailInfo serviceDetailInfo = new ServiceDetailInfo();
        serviceDetailInfo.setServiceName("/bin/bash");
        assertThat(serviceDetailInfo.getServiceName(), is("/bin/bash"));
    }
}
