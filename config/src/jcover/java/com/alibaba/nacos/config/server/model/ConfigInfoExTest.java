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
        configInfoEx.setMessage("an error has happened");
        configInfoEx.setStatus(1);
        configInfoEx.setAppName("Acme");
        configInfoEx.setTenant("ConfigInfoEx s");
        configInfoEx.setContent("hello");
        configInfoEx.setDataId("1234");
        configInfoEx.setGroup("/some/path.html");
        configInfoEx.setId(1L);
        configInfoEx.setMd5("/some/path.html");
        assertThat(configInfoEx.getMessage(), is("an error has happened"));
        assertThat(configInfoEx.getStatus(), is(1));
        assertThat(configInfoEx.getAppName(), is("Acme"));
        assertThat(configInfoEx.getTenant(), is("ConfigInfoEx s"));
        assertThat(configInfoEx.getContent(), is("hello"));
        assertThat(configInfoEx.getDataId(), is("1234"));
        assertThat(configInfoEx.getGroup(), is("/some/path.html"));
        assertThat(configInfoEx.getId(), is(1L));
        assertThat(configInfoEx.getMd5(), is("/some/path.html"));
    }

    @Test
    void factory2() {
        ConfigInfoEx configInfoEx = new ConfigInfoEx("1234", "foo", "hello");
        configInfoEx.setMessage("an error has happened");
        configInfoEx.setStatus(1);
        configInfoEx.setAppName("Acme");
        configInfoEx.setTenant("ConfigInfoEx s");
        configInfoEx.setContent("hello");
        configInfoEx.setDataId("1234");
        configInfoEx.setGroup("/some/path.html");
        configInfoEx.setId(1L);
        configInfoEx.setMd5("/some/path.html");
        assertThat(configInfoEx.getMessage(), is("an error has happened"));
        assertThat(configInfoEx.getStatus(), is(1));
        assertThat(configInfoEx.getAppName(), is("Acme"));
        assertThat(configInfoEx.getTenant(), is("ConfigInfoEx s"));
        assertThat(configInfoEx.getContent(), is("hello"));
        assertThat(configInfoEx.getDataId(), is("1234"));
        assertThat(configInfoEx.getGroup(), is("/some/path.html"));
        assertThat(configInfoEx.getId(), is(1L));
        assertThat(configInfoEx.getMd5(), is("/some/path.html"));
    }

    @Test
    void factory3() {
        ConfigInfoEx configInfoEx =
             new ConfigInfoEx("1234", "foo", "hello", 0, "an error has happened");
        configInfoEx.setMessage("an error has happened");
        configInfoEx.setStatus(1);
        configInfoEx.setAppName("Acme");
        configInfoEx.setTenant("/some/path.html");
        configInfoEx.setContent("hello");
        configInfoEx.setDataId("1234");
        configInfoEx.setGroup("/some/path.html");
        configInfoEx.setId(1L);
        configInfoEx.setMd5("/some/path.html");
        assertThat(configInfoEx.getMessage(), is("an error has happened"));
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
