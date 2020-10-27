package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigInfo4Tag
 *
 * @author Diffblue Cover
 */

class ConfigInfo4TagTest {

    @Test
    void factory1() {
        ConfigInfo4Tag configInfo4Tag = new ConfigInfo4Tag();
        configInfo4Tag.setTag("tag");
        configInfo4Tag.setAppName("Acme");
        configInfo4Tag.setTenant("tag");
        configInfo4Tag.setContent("hello");
        configInfo4Tag.setDataId("1234");
        configInfo4Tag.setGroup("tag");
        configInfo4Tag.setId(1L);
        configInfo4Tag.setMd5("tag");
        assertThat(configInfo4Tag.getTag(), is("tag"));
        assertThat(configInfo4Tag.getAppName(), is("Acme"));
        assertThat(configInfo4Tag.getTenant(), is("tag"));
        assertThat(configInfo4Tag.getContent(), is("hello"));
        assertThat(configInfo4Tag.getDataId(), is("1234"));
        assertThat(configInfo4Tag.getGroup(), is("tag"));
        assertThat(configInfo4Tag.getId(), is(1L));
        assertThat(configInfo4Tag.getMd5(), is("tag"));
    }

    @Test
    void factory2() {
        ConfigInfo4Tag configInfo4Tag =
             new ConfigInfo4Tag("1234", "tag", "tag", "Acme", "hello");
        configInfo4Tag.setTag("tag");
        configInfo4Tag.setAppName("Acme");
        configInfo4Tag.setTenant("tag");
        configInfo4Tag.setContent("hello");
        configInfo4Tag.setDataId("1234");
        configInfo4Tag.setGroup("tag");
        configInfo4Tag.setId(1L);
        configInfo4Tag.setMd5("tag");
        assertThat(configInfo4Tag.getTag(), is("tag"));
        assertThat(configInfo4Tag.getAppName(), is("Acme"));
        assertThat(configInfo4Tag.getTenant(), is("tag"));
        assertThat(configInfo4Tag.getContent(), is("hello"));
        assertThat(configInfo4Tag.getDataId(), is("1234"));
        assertThat(configInfo4Tag.getGroup(), is("tag"));
        assertThat(configInfo4Tag.getId(), is(1L));
        assertThat(configInfo4Tag.getMd5(), is("tag"));
    }

    @Test
    void testEquals() {
        assertThat(new ConfigInfo4Tag().equals(new Object()), is(false));
        assertThat(new ConfigInfo4Tag().equals(new Object()), is(false));
    }
}
