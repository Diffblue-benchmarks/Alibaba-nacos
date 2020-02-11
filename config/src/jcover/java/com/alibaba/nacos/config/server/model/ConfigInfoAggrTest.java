package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigInfoAggr
 *
 * @author Diffblue JCover
 */

public class ConfigInfoAggrTest {

    @Test(timeout=10000)
    public void getAppNameReturnsNull() {
        assertThat(new ConfigInfoAggr().getAppName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getContentReturnsNull() {
        assertThat(new ConfigInfoAggr().getContent(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getDataIdReturnsNull() {
        assertThat(new ConfigInfoAggr().getDataId(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getDatumIdReturnsNull() {
        assertThat(new ConfigInfoAggr().getDatumId(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getGroupReturnsNull() {
        assertThat(new ConfigInfoAggr().getGroup(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getIdReturnsZero() {
        assertThat(new ConfigInfoAggr().getId(), is(0L));
    }

    @Test(timeout=10000)
    public void getTenantReturnsNull() {
        assertThat(new ConfigInfoAggr().getTenant(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setAppName() {
        ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();
        configInfoAggr.setAppName("/bin/bash");
        assertThat(configInfoAggr.getAppName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setContentToFoo() {
        ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();
        configInfoAggr.setContent("foo");
        assertThat(configInfoAggr.getContent(), is("foo"));
    }

    @Test(timeout=10000)
    public void setDataIdToSomething() {
        ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();
        configInfoAggr.setDataId("something");
        assertThat(configInfoAggr.getDataId(), is("something"));
    }

    @Test(timeout=10000)
    public void setDatumIdToFoo() {
        ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();
        configInfoAggr.setDatumId("foo");
        assertThat(configInfoAggr.getDatumId(), is("foo"));
    }

    @Test(timeout=10000)
    public void setGroupToFoo() {
        ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();
        configInfoAggr.setGroup("foo");
        assertThat(configInfoAggr.getGroup(), is("foo"));
    }

    @Test(timeout=10000)
    public void setIdToOne() {
        ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();
        configInfoAggr.setId(1L);
        assertThat(configInfoAggr.getId(), is(1L));
    }

    @Test(timeout=10000)
    public void setTenantToFoo() {
        ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();
        configInfoAggr.setTenant("foo");
        assertThat(configInfoAggr.getTenant(), is("foo"));
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new ConfigInfoAggr("something", "ConfigInfoAggr d", "bar", "foo").equals(new Object()), is(false));
        assertThat(new ConfigInfoAggr("something", "ConfigInfoAggr d", "foo", "bar", "foo").equals(new Object()), is(false));
        assertThat(new ConfigInfoAggr().equals("foo"), is(false));
        assertThat(new ConfigInfoAggr().equals(null), is(false));
    }
}
