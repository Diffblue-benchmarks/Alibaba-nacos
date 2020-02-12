package com.alibaba.nacos.client.config.filter.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.nacos.api.config.filter.IConfigContext;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.filter.impl.ConfigResponse
 *
 * @author Diffblue JCover
 */

public class ConfigResponseDiffblueTest {

    @Test(timeout=10000)
    public void getConfigContext() {
        ConfigResponse configResponse = new ConfigResponse();
        IConfigContext result = configResponse.getConfigContext();
        // pojo IConfigContext
        assertThat(configResponse.getConfigContext(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getContentReturnsNull() {
        assertThat(new ConfigResponse().getContent(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getDataIdReturnsNull() {
        assertThat(new ConfigResponse().getDataId(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getGroupReturnsNull() {
        assertThat(new ConfigResponse().getGroup(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getParameterKeyIsNameReturnsNull() {
        assertThat(new ConfigResponse().getParameter("name"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTenantReturnsNull() {
        assertThat(new ConfigResponse().getTenant(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setContent() {
        ConfigResponse configResponse = new ConfigResponse();
        configResponse.setContent("/bin/bash");
        assertThat(configResponse.getContent(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setDataIdToSomething() {
        ConfigResponse configResponse = new ConfigResponse();
        configResponse.setDataId("something");
        assertThat(configResponse.getDataId(), is("something"));
    }

    @Test(timeout=10000)
    public void setGroup() {
        ConfigResponse configResponse = new ConfigResponse();
        configResponse.setGroup("/bin/bash");
        assertThat(configResponse.getGroup(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setTenant() {
        ConfigResponse configResponse = new ConfigResponse();
        configResponse.setTenant("/bin/bash");
        assertThat(configResponse.getTenant(), is("/bin/bash"));
    }
}
