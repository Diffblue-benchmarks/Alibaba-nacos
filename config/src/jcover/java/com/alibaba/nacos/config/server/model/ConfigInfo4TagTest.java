package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigInfo4Tag
 *
 * @author Diffblue JCover
 */

public class ConfigInfo4TagTest {

    @Test(timeout=10000)
    public void getTagReturnsNull() {
        assertThat(new ConfigInfo4Tag().getTag(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setTagToFoo() {
        ConfigInfo4Tag configInfo4Tag = new ConfigInfo4Tag();
        configInfo4Tag.setTag("foo");
        assertThat(configInfo4Tag.getTag(), is("foo"));
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new ConfigInfo4Tag("something", "foo", "foo", "bar", "foo").equals(new Object()), is(false));
        assertThat(new ConfigInfo4Tag().equals("foo"), is(false));
    }
}
