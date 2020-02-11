package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigInfoBase
 *
 * @author Diffblue JCover
 */

public class ConfigInfoBaseTest {

    @Test(timeout=10000)
    public void compareTo() {
        assertThat(new ConfigInfoBase("bar", "ZGF0YQ==", "ZGF0YQ==").compareTo(new ConfigInfoBase("something", "ZGF0YQ==", "ZGF0YQ==")), is(-17));
        assertThat(new ConfigInfoBase().compareTo((ConfigInfoBase)null), is(1));
        assertThat(new ConfigInfoBase("something", "bar", "ZGF0YQ==").compareTo(new ConfigInfoBase("something", "ZGF0YQ==", "ZGF0YQ==")), is(8));
        assertThat(new ConfigInfoBase("something", "ZGF0YQ==", "bar").compareTo(new ConfigInfoBase("something", "ZGF0YQ==", "ZGF0YQ==")), is(8));
        assertThat(new ConfigInfoBase().compareTo(new ConfigInfoBase("something", "bar", "ZGF0YQ==")), is(-1));
        assertThat(new ConfigInfoBase("something", null, "bar").compareTo(new ConfigInfoBase("something", "ZGF0YQ==", "ZGF0YQ==")), is(-1));
        assertThat(new ConfigInfoBase("something", "ZGF0YQ==", null).compareTo(new ConfigInfoBase("something", "ZGF0YQ==", "bar")), is(-1));
        assertThat(new ConfigInfoBase("something", "bar", "ZGF0YQ==").compareTo(new ConfigInfoBase()), is(1));
        assertThat(new ConfigInfoBase("something", "ZGF0YQ==", "ZGF0YQ==").compareTo(new ConfigInfoBase("something", null, "ZGF0YQ==")), is(1));
        assertThat(new ConfigInfoBase("something", "ZGF0YQ==", "ZGF0YQ==").compareTo(new ConfigInfoBase("something", "ZGF0YQ==", null)), is(1));
        assertThat(new ConfigInfoBase().compareTo(new ConfigInfoBase()), is(0));
        assertThat(new ConfigInfoBase("something", "ZGF0YQ==", "ZGF0YQ==").compareTo(new ConfigInfoBase("something", "ZGF0YQ==", "ZGF0YQ==")), is(0));
        assertThat(new ConfigInfoBase("something", null, "ZGF0YQ==").compareTo(new ConfigInfoBase("something", null, "ZGF0YQ==")), is(0));
        assertThat(new ConfigInfoBase("something", "ZGF0YQ==", null).compareTo(new ConfigInfoBase("something", "ZGF0YQ==", null)), is(0));
    }

    @Test(timeout=10000)
    public void getIdReturnsZero() {
        assertThat(new ConfigInfoBase().getId(), is(0L));
    }

    @Test(timeout=10000)
    public void getMd5ReturnsNull() {
        assertThat(new ConfigInfoBase().getMd5(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setContent() {
        ConfigInfoBase configInfoBase = new ConfigInfoBase();
        configInfoBase.setContent("ZGF0YQ==");
        assertThat(configInfoBase.getContent(), is("ZGF0YQ=="));
    }

    @Test(timeout=10000)
    public void setDataIdToSomething() {
        ConfigInfoBase configInfoBase = new ConfigInfoBase();
        configInfoBase.setDataId("something");
        assertThat(configInfoBase.getDataId(), is("something"));
    }

    @Test(timeout=10000)
    public void setGroup() {
        ConfigInfoBase configInfoBase = new ConfigInfoBase();
        configInfoBase.setGroup("ZGF0YQ==");
        assertThat(configInfoBase.getGroup(), is("ZGF0YQ=="));
    }

    @Test(timeout=10000)
    public void setIdToOne() {
        ConfigInfoBase configInfoBase = new ConfigInfoBase();
        configInfoBase.setId(1L);
        assertThat(configInfoBase.getId(), is(1L));
    }

    @Test(timeout=10000)
    public void setMd5() {
        ConfigInfoBase configInfoBase = new ConfigInfoBase();
        configInfoBase.setMd5("ZGF0YQ==");
        assertThat(configInfoBase.getMd5(), is("ZGF0YQ=="));
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new ConfigInfoBase("something", "bar", "foo").equals(new Object()), is(false));
        assertThat(new ConfigInfoBase().equals("foo"), is(false));
        assertThat(new ConfigInfoBase("something", "bar", null).equals("foo"), is(false));
        assertThat(new ConfigInfoBase().equals(null), is(false));
    }
}
