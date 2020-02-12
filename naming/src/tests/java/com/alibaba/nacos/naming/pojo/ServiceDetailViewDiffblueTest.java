package com.alibaba.nacos.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.nacos.api.naming.pojo.Service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.pojo.ServiceDetailView
 *
 * @author Diffblue JCover
 */

public class ServiceDetailViewDiffblueTest {

    @Test(timeout=10000)
    public void getClustersReturnsNull() {
        assertThat(new ServiceDetailView().getClusters(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getServiceReturnsNull() {
        assertThat(new ServiceDetailView().getService(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setClustersToEmpty() {
        ServiceDetailView serviceDetailView = new ServiceDetailView();
        List<com.alibaba.nacos.api.naming.pojo.Cluster> clusters = new ArrayList<com.alibaba.nacos.api.naming.pojo.Cluster>();
        serviceDetailView.setClusters(clusters);
        assertThat(serviceDetailView.getClusters(), sameInstance(clusters));
    }

    @Test(timeout=10000)
    public void setService() {
        ServiceDetailView serviceDetailView = new ServiceDetailView();
        Service service = new Service();
        serviceDetailView.setService(service);
        assertThat(serviceDetailView.getService(), sameInstance(service));
    }
}
