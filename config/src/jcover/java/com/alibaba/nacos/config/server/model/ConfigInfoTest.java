package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigInfo
 *
 * @author Diffblue Cover
 */

class ConfigInfoTest {

    @Test
    void factory1() {
        ConfigInfo configInfo = new ConfigInfo();
        configInfo.setAppName("Acme");
        configInfo.setTenant("/some/path.html");
        configInfo.setContent("hello");
        configInfo.setDataId("1234");
        configInfo.setGroup("/some/path.html");
        configInfo.setId(1L);
        configInfo.setMd5("/some/path.html");
        assertThat(configInfo.getAppName(), is("Acme"));
        assertThat(configInfo.getTenant(), is("/some/path.html"));
        assertThat(configInfo.getContent(), is("hello"));
        assertThat(configInfo.getDataId(), is("1234"));
        assertThat(configInfo.getGroup(), is("/some/path.html"));
        assertThat(configInfo.getId(), is(1L));
        assertThat(configInfo.getMd5(), is("/some/path.html"));
    }

    @Test
    void factory2() {
        ConfigInfo configInfo = new ConfigInfo("1234", "foo", "hello");
        configInfo.setAppName("Acme");
        configInfo.setTenant("/some/path.html");
        configInfo.setContent("hello");
        configInfo.setDataId("1234");
        configInfo.setGroup("/some/path.html");
        configInfo.setId(1L);
        configInfo.setMd5("/some/path.html");
        assertThat(configInfo.getAppName(), is("Acme"));
        assertThat(configInfo.getTenant(), is("/some/path.html"));
        assertThat(configInfo.getContent(), is("hello"));
        assertThat(configInfo.getDataId(), is("1234"));
        assertThat(configInfo.getGroup(), is("/some/path.html"));
        assertThat(configInfo.getId(), is(1L));
        assertThat(configInfo.getMd5(), is("/some/path.html"));
    }

    @Test
    void factory3() {
        ConfigInfo configInfo = new ConfigInfo("1234", "foo", "Acme", "hello");
        configInfo.setAppName("Acme");
        configInfo.setTenant("/some/path.html");
        configInfo.setContent("hello");
        configInfo.setDataId("1234");
        configInfo.setGroup("/some/path.html");
        configInfo.setId(1L);
        configInfo.setMd5("/some/path.html");
        assertThat(configInfo.getAppName(), is("Acme"));
        assertThat(configInfo.getTenant(), is("/some/path.html"));
        assertThat(configInfo.getContent(), is("hello"));
        assertThat(configInfo.getDataId(), is("1234"));
        assertThat(configInfo.getGroup(), is("/some/path.html"));
        assertThat(configInfo.getId(), is(1L));
        assertThat(configInfo.getMd5(), is("/some/path.html"));
    }

    @Test
    void factory4() {
        ConfigInfo configInfo =
             new ConfigInfo("1234", "foo", "foo", "Acme", "hello");
        configInfo.setAppName("Acme");
        configInfo.setTenant("/some/path.html");
        configInfo.setContent("hello");
        configInfo.setDataId("1234");
        configInfo.setGroup("/some/path.html");
        configInfo.setId(1L);
        configInfo.setMd5("/some/path.html");
        assertThat(configInfo.getAppName(), is("Acme"));
        assertThat(configInfo.getTenant(), is("/some/path.html"));
        assertThat(configInfo.getContent(), is("hello"));
        assertThat(configInfo.getDataId(), is("1234"));
        assertThat(configInfo.getGroup(), is("/some/path.html"));
        assertThat(configInfo.getId(), is(1L));
        assertThat(configInfo.getMd5(), is("/some/path.html"));
    }

    @Test
    void equalsReturnsFalse() {
        assertThat(new ConfigAllInfo().equals(new Object()), is(false));
    }
}
