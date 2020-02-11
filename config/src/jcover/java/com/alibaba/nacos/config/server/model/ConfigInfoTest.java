package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigInfo
 *
 * @author Diffblue JCover
 */

public class ConfigInfoTest {

    @Test(timeout=10000)
    public void getAppNameReturnsNull() {
        assertThat(new ConfigInfo().getAppName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTenantReturnsNull() {
        assertThat(new ConfigInfo().getTenant(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setAppName() {
        ConfigInfo configInfo = new ConfigInfo();
        configInfo.setAppName("/bin/bash");
        assertThat(configInfo.getAppName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setTenantToFoo() {
        ConfigInfo configInfo = new ConfigInfo();
        configInfo.setTenant("foo");
        assertThat(configInfo.getTenant(), is("foo"));
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new ConfigInfo("something", "bar", "foo").equals(new Object()), is(false));
        assertThat(new ConfigInfo("something", "foo", "bar", "foo").equals(new Object()), is(false));
        assertThat(new ConfigInfo("something", "foo", "foo", "bar", "foo").equals(new Object()), is(false));
        assertThat(new ConfigInfo().equals("foo"), is(false));
    }
}
