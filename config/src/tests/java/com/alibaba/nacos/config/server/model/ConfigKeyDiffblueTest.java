package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigKey
 *
 * @author Diffblue JCover
 */

public class ConfigKeyDiffblueTest {

    @Test(timeout=10000)
    public void getAppNameReturnsNull() {
        assertThat(new ConfigKey().getAppName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getDataIdReturnsNull() {
        assertThat(new ConfigKey().getDataId(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getGroupReturnsNull() {
        assertThat(new ConfigKey().getGroup(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setAppName() {
        ConfigKey configKey = new ConfigKey();
        configKey.setAppName("/bin/bash");
        assertThat(configKey.getAppName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setDataIdToSomething() {
        ConfigKey configKey = new ConfigKey();
        configKey.setDataId("something");
        assertThat(configKey.getDataId(), is("something"));
    }

    @Test(timeout=10000)
    public void setGroupToFoo() {
        ConfigKey configKey = new ConfigKey();
        configKey.setGroup("foo");
        assertThat(configKey.getGroup(), is("foo"));
    }
}
