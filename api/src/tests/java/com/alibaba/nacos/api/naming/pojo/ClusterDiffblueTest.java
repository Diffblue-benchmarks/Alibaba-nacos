package com.alibaba.nacos.api.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.api.naming.pojo.Cluster
 *
 * @author Diffblue JCover
 */

public class ClusterDiffblueTest {

    @Test(timeout=10000)
    public void getDefaultCheckPort() {
        assertThat(new Cluster().getDefaultCheckPort(), is(80));
    }

    @Test(timeout=10000)
    public void getDefaultPort() {
        assertThat(new Cluster().getDefaultPort(), is(80));
    }

    @Test(timeout=10000)
    public void getHealthChecker() {
        Cluster cluster = new Cluster();
        AbstractHealthChecker result = cluster.getHealthChecker();
        assertThat(result.getType(), is("TCP"));
        assertThat(cluster.getHealthChecker(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getMetadataReturnsEmpty() {
        Cluster cluster = new Cluster();
        Map<String, String> result = cluster.getMetadata();
        assertThat(result.isEmpty(), is(true));
        assertThat(cluster.getMetadata(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getNameReturnsNull() {
        assertThat(new Cluster().getName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getServiceNameReturnsNull() {
        assertThat(new Cluster().getServiceName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void isUseIPPort4Check() {
        assertThat(new Cluster().isUseIPPort4Check(), is(true));
        assertThat(new Cluster("bar").isUseIPPort4Check(), is(true));
    }

    @Test(timeout=10000)
    public void setDefaultCheckPortToOne() {
        Cluster cluster = new Cluster();
        cluster.setDefaultCheckPort(1);
        assertThat(cluster.getDefaultCheckPort(), is(1));
    }

    @Test(timeout=10000)
    public void setDefaultPortToOne() {
        Cluster cluster = new Cluster();
        cluster.setDefaultPort(1);
        assertThat(cluster.getDefaultPort(), is(1));
    }

    @Test(timeout=10000)
    public void setHealthChecker() {
        Cluster cluster = new Cluster();
        AbstractHealthChecker healthChecker = mock(AbstractHealthChecker.class);
        cluster.setHealthChecker(healthChecker);
        assertThat(cluster.getHealthChecker(), sameInstance(healthChecker));
    }

    @Test(timeout=10000)
    public void setMetadataToEmpty() {
        Cluster cluster = new Cluster();
        Map<String, String> metadata = new HashMap<String, String>();
        cluster.setMetadata(metadata);
        assertThat(cluster.getMetadata(), sameInstance(metadata));
    }

    @Test(timeout=10000)
    public void setName() {
        Cluster cluster = new Cluster();
        cluster.setName("/bin/bash");
        assertThat(cluster.getName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setServiceName() {
        Cluster cluster = new Cluster();
        cluster.setServiceName("/bin/bash");
        assertThat(cluster.getServiceName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setUseIPPort4CheckToFalse() {
        Cluster cluster = new Cluster();
        cluster.setUseIPPort4Check(false);
        assertThat(cluster.isUseIPPort4Check(), is(false));
    }
}
