package com.alibaba.nacos.client.config.filter.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.nacos.api.config.filter.IConfigContext;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.filter.impl.ConfigRequest
 *
 * @author Diffblue JCover
 */

public class ConfigRequestDiffblueTest {

    @Test(timeout=10000)
    public void getConfigContext() {
        ConfigRequest configRequest = new ConfigRequest();
        IConfigContext result = configRequest.getConfigContext();
        // pojo IConfigContext
        assertThat(configRequest.getConfigContext(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getContentReturnsNull() {
        assertThat(new ConfigRequest().getContent(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getDataIdReturnsNull() {
        assertThat(new ConfigRequest().getDataId(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getGroupReturnsNull() {
        assertThat(new ConfigRequest().getGroup(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getParameterKeyIsNameReturnsNull() {
        assertThat(new ConfigRequest().getParameter("name"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTenantReturnsNull() {
        assertThat(new ConfigRequest().getTenant(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setContent() {
        ConfigRequest configRequest = new ConfigRequest();
        configRequest.setContent("/bin/bash");
        assertThat(configRequest.getContent(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setDataIdToSomething() {
        ConfigRequest configRequest = new ConfigRequest();
        configRequest.setDataId("something");
        assertThat(configRequest.getDataId(), is("something"));
    }

    @Test(timeout=10000)
    public void setGroup() {
        ConfigRequest configRequest = new ConfigRequest();
        configRequest.setGroup("/bin/bash");
        assertThat(configRequest.getGroup(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setTenant() {
        ConfigRequest configRequest = new ConfigRequest();
        configRequest.setTenant("/bin/bash");
        assertThat(configRequest.getTenant(), is("/bin/bash"));
    }
}
