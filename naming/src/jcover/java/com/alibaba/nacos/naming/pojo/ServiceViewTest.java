package com.alibaba.nacos.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.pojo.ServiceView
 *
 * @author Diffblue Cover
 */

public class ServiceViewTest {

    @Test
    public void factory() {
        ServiceView serviceView = new ServiceView();
        serviceView.setClusterCount(-1);
        serviceView.setGroupName("bar");
        serviceView.setHealthyInstanceCount(0);
        serviceView.setIpCount(1);
        serviceView.setName("Acme");
        assertThat(serviceView.getClusterCount(), is(-1));
        assertThat(serviceView.getGroupName(), is("bar"));
        assertThat(serviceView.getHealthyInstanceCount(), is(0));
        assertThat(serviceView.getIpCount(), is(1));
        assertThat(serviceView.getName(), is("Acme"));
    }
}
