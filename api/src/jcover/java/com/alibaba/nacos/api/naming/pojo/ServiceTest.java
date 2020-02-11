package com.alibaba.nacos.api.naming.pojo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.api.naming.pojo.Service
 *
 * @author Diffblue JCover
 */

public class ServiceTest {

    @Test(timeout=10000)
    public void addMetadataKeyIsFooAndValueIsFoo() {
        Service service = new Service();
        service.addMetadata("foo", "foo");
        assertThat(service.getMetadata().get("foo"), is("foo"));
    }

    @Test(timeout=10000)
    public void getAppNameReturnsNull() {
        assertThat(new Service().getAppName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getGroupNameReturnsNull() {
        assertThat(new Service().getGroupName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getMetadataReturnsEmpty() {
        Service service = new Service();
        Map<String, String> result = service.getMetadata();
        assertThat(result.isEmpty(), is(true));
        assertThat(service.getMetadata(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getNameReturnsNull() {
        assertThat(new Service().getName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getProtectThreshold() {
        assertEquals(0.0f, new Service().getProtectThreshold(), 0);
        assertEquals(0.0f, new Service("bar").getProtectThreshold(), 0);
    }

    @Test(timeout=10000)
    public void setAppName() {
        Service service = new Service();
        service.setAppName("/bin/bash");
        assertThat(service.getAppName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setGroupName() {
        Service service = new Service();
        service.setGroupName("/bin/bash");
        assertThat(service.getGroupName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setMetadataToEmpty() {
        Service service = new Service();
        Map<String, String> metadata = new HashMap<String, String>();
        service.setMetadata(metadata);
        assertThat(service.getMetadata(), sameInstance(metadata));
    }

    @Test(timeout=10000)
    public void setName() {
        Service service = new Service();
        service.setName("/bin/bash");
        assertThat(service.getName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setProtectThresholdToOne() {
        Service service = new Service();
        service.setProtectThreshold(1.0f);
        assertEquals(1.0f, service.getProtectThreshold(), 0);
    }
}
