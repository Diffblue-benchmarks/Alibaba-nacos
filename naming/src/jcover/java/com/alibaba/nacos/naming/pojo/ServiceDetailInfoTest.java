package com.alibaba.nacos.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

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
        serviceDetailInfo.setClusterMap(new HashMap<String, ClusterInfo>());
        serviceDetailInfo.setGroupName("Acme");
        serviceDetailInfo.setMetadata(new HashMap<String, String>());
        serviceDetailInfo.setServiceName("Acme");
        assertThat(serviceDetailInfo.getClusterMap().isEmpty(), is(true));
        assertThat(serviceDetailInfo.getGroupName(), is("Acme"));
        assertThat(serviceDetailInfo.getMetadata().isEmpty(), is(true));
        assertThat(serviceDetailInfo.getServiceName(), is("Acme"));
    }
}
