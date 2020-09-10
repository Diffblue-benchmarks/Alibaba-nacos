package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigInfoEx
 *
 * @author Diffblue Cover
 */

class ConfigInfoExTest {

    @Test
    void factory1() {
        ConfigInfoEx configInfoEx = new ConfigInfoEx();
        configInfoEx.setMessage("ConfigInfoEx s");
        configInfoEx.setStatus(1);
        configInfoEx.setAppName("Acme");
        configInfoEx.setTenant("/some/path.html");
        configInfoEx.setContent("hello");
        configInfoEx.setDataId("1234");
        configInfoEx.setGroup("/some/path.html");
        configInfoEx.setId(1L);
        configInfoEx.setMd5("/some/path.html");
        assertThat(configInfoEx.getMessage(), is("ConfigInfoEx s"));
        assertThat(configInfoEx.getStatus(), is(1));
        assertThat(configInfoEx.getAppName(), is("Acme"));
        assertThat(configInfoEx.getTenant(), is("/some/path.html"));
        assertThat(configInfoEx.getContent(), is("hello"));
        assertThat(configInfoEx.getDataId(), is("1234"));
        assertThat(configInfoEx.getGroup(), is("/some/path.html"));
        assertThat(configInfoEx.getId(), is(1L));
        assertThat(configInfoEx.getMd5(), is("/some/path.html"));
    }

    @Test
    void factory2() {
        ConfigInfoEx configInfoEx =
             new ConfigInfoEx("1234", "ConfigInfoEx s", "hello");
        configInfoEx.setMessage("/some/path.html");
        configInfoEx.setStatus(1);
        configInfoEx.setAppName("Acme");
        configInfoEx.setTenant("/some/path.html");
        configInfoEx.setContent("hello");
        configInfoEx.setDataId("1234");
        configInfoEx.setGroup("/some/path.html");
        configInfoEx.setId(1L);
        configInfoEx.setMd5("/some/path.html");
        assertThat(configInfoEx.getMessage(), is("/some/path.html"));
        assertThat(configInfoEx.getStatus(), is(1));
        assertThat(configInfoEx.getAppName(), is("Acme"));
        assertThat(configInfoEx.getTenant(), is("/some/path.html"));
        assertThat(configInfoEx.getContent(), is("hello"));
        assertThat(configInfoEx.getDataId(), is("1234"));
        assertThat(configInfoEx.getGroup(), is("/some/path.html"));
        assertThat(configInfoEx.getId(), is(1L));
        assertThat(configInfoEx.getMd5(), is("/some/path.html"));
    }

    @Test
    void factory3() {
        ConfigInfoEx configInfoEx =
             new ConfigInfoEx("1234", "ConfigInfoEx s", "hello", 1, "/some/path.html");
        configInfoEx.setMessage("/some/path.html");
        configInfoEx.setStatus(1);
        configInfoEx.setAppName("Acme");
        configInfoEx.setTenant("/some/path.html");
        configInfoEx.setContent("hello");
        configInfoEx.setDataId("1234");
        configInfoEx.setGroup("/some/path.html");
        configInfoEx.setId(1L);
        configInfoEx.setMd5("/some/path.html");
        assertThat(configInfoEx.getMessage(), is("/some/path.html"));
        assertThat(configInfoEx.getStatus(), is(1));
        assertThat(configInfoEx.getAppName(), is("Acme"));
        assertThat(configInfoEx.getTenant(), is("/some/path.html"));
        assertThat(configInfoEx.getContent(), is("hello"));
        assertThat(configInfoEx.getDataId(), is("1234"));
        assertThat(configInfoEx.getGroup(), is("/some/path.html"));
        assertThat(configInfoEx.getId(), is(1L));
        assertThat(configInfoEx.getMd5(), is("/some/path.html"));
    }

    @Test
    void equalsReturnsFalse() {
        assertThat(new ConfigInfoEx().equals(new Object()), is(false));
    }
}
