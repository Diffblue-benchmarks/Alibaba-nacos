package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigInfoChanged
 *
 * @author Diffblue JCover
 */

public class ConfigInfoChangedTest {

    @Test(timeout=10000)
    public void getDataIdReturnsNull() {
        assertThat(new ConfigInfoChanged().getDataId(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getGroupReturnsNull() {
        assertThat(new ConfigInfoChanged().getGroup(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTenantReturnsNull() {
        assertThat(new ConfigInfoChanged().getTenant(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setDataIdToSomething() {
        ConfigInfoChanged configInfoChanged = new ConfigInfoChanged();
        configInfoChanged.setDataId("something");
        assertThat(configInfoChanged.getDataId(), is("something"));
    }

    @Test(timeout=10000)
    public void setGroupToFoo() {
        ConfigInfoChanged configInfoChanged = new ConfigInfoChanged();
        configInfoChanged.setGroup("foo");
        assertThat(configInfoChanged.getGroup(), is("foo"));
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new ConfigInfoChanged().equals("foo"), is(false));
        assertThat(new ConfigInfoChanged("something", "ConfigInfoChanged d", "bar").equals("foo"), is(false));
        assertThat(new ConfigInfoChanged().equals(null), is(false));
    }
}
