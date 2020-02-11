package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigInfoBaseEx
 *
 * @author Diffblue JCover
 */

public class ConfigInfoBaseExTest {

    @Test(timeout=10000)
    public void getMessageReturnsNull() {
        assertThat(new ConfigInfoBaseEx().getMessage(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getStatus() {
        assertThat(new ConfigInfoBaseEx("something", "ZGF0YQ==", "ZGF0YQ==", 1, "ZGF0YQ==").getStatus(), is(1));
        assertThat(new ConfigInfoBaseEx().getStatus(), is(0));
    }

    @Test(timeout=10000)
    public void setMessage() {
        ConfigInfoBaseEx configInfoBaseEx = new ConfigInfoBaseEx();
        configInfoBaseEx.setMessage("ZGF0YQ==");
        assertThat(configInfoBaseEx.getMessage(), is("ZGF0YQ=="));
    }

    @Test(timeout=10000)
    public void setStatusToOne() {
        ConfigInfoBaseEx configInfoBaseEx = new ConfigInfoBaseEx();
        configInfoBaseEx.setStatus(1);
        assertThat(configInfoBaseEx.getStatus(), is(1));
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new ConfigInfoBaseEx().equals("foo"), is(false));
        assertThat(new ConfigInfoBaseEx("something", "ConfigInfoBaseEx s", "bar").equals("foo"), is(false));
        assertThat(new ConfigInfoBaseEx("something", "ConfigInfoBaseEx s", "bar", 1, "foo").equals(new Object()), is(false));
    }
}
