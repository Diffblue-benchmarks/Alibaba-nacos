package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigInfoEx
 *
 * @author Diffblue JCover
 */

public class ConfigInfoExTest {

    @Test(timeout=10000)
    public void getMessageReturnsNull() {
        assertThat(new ConfigInfoEx().getMessage(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getStatus() {
        assertThat(new ConfigInfoEx("something", "foo", "foo", 1, "foo").getStatus(), is(1));
        assertThat(new ConfigInfoEx().getStatus(), is(0));
    }

    @Test(timeout=10000)
    public void setMessageToFoo() {
        ConfigInfoEx configInfoEx = new ConfigInfoEx();
        configInfoEx.setMessage("foo");
        assertThat(configInfoEx.getMessage(), is("foo"));
    }

    @Test(timeout=10000)
    public void setStatusToOne() {
        ConfigInfoEx configInfoEx = new ConfigInfoEx();
        configInfoEx.setStatus(1);
        assertThat(configInfoEx.getStatus(), is(1));
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new ConfigInfoEx().equals("foo"), is(false));
        assertThat(new ConfigInfoEx("something", "ConfigInfoEx s", "bar", 1, "foo").equals(new Object()), is(false));
        assertThat(new ConfigInfoEx("something", "ConfigInfoEx s", "bar").equals("foo"), is(false));
    }
}
