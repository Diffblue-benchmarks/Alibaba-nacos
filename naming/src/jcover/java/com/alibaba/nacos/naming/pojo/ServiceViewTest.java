package com.alibaba.nacos.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.pojo.ServiceView
 *
 * @author Diffblue JCover
 */

public class ServiceViewTest {

    @Test(timeout=10000)
    public void getClusterCountReturnsZero() {
        assertThat(new ServiceView().getClusterCount(), is(0));
    }

    @Test(timeout=10000)
    public void getGroupNameReturnsNull() {
        assertThat(new ServiceView().getGroupName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getHealthyInstanceCountReturnsZero() {
        assertThat(new ServiceView().getHealthyInstanceCount(), is(0));
    }

    @Test(timeout=10000)
    public void getIpCountReturnsZero() {
        assertThat(new ServiceView().getIpCount(), is(0));
    }

    @Test(timeout=10000)
    public void getNameReturnsNull() {
        assertThat(new ServiceView().getName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setClusterCountToOne() {
        ServiceView serviceView = new ServiceView();
        serviceView.setClusterCount(1);
        assertThat(serviceView.getClusterCount(), is(1));
    }

    @Test(timeout=10000)
    public void setGroupName() {
        ServiceView serviceView = new ServiceView();
        serviceView.setGroupName("/bin/bash");
        assertThat(serviceView.getGroupName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setHealthyInstanceCountToOne() {
        ServiceView serviceView = new ServiceView();
        serviceView.setHealthyInstanceCount(1);
        assertThat(serviceView.getHealthyInstanceCount(), is(1));
    }

    @Test(timeout=10000)
    public void setIpCountToOne() {
        ServiceView serviceView = new ServiceView();
        serviceView.setIpCount(1);
        assertThat(serviceView.getIpCount(), is(1));
    }

    @Test(timeout=10000)
    public void setName() {
        ServiceView serviceView = new ServiceView();
        serviceView.setName("/bin/bash");
        assertThat(serviceView.getName(), is("/bin/bash"));
    }
}
