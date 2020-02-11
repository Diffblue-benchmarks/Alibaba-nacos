package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigInfo4Beta
 *
 * @author Diffblue JCover
 */

public class ConfigInfo4BetaTest {

    @Test(timeout=10000)
    public void getBetaIpsReturnsNull() {
        assertThat(new ConfigInfo4Beta().getBetaIps(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setBetaIpsToFoo() {
        ConfigInfo4Beta configInfo4Beta = new ConfigInfo4Beta();
        configInfo4Beta.setBetaIps("foo");
        assertThat(configInfo4Beta.getBetaIps(), is("foo"));
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new ConfigInfo4Beta("something", "foo", "bar", "foo", "foo").equals(new Object()), is(false));
        assertThat(new ConfigInfo4Beta().equals("foo"), is(false));
    }
}
