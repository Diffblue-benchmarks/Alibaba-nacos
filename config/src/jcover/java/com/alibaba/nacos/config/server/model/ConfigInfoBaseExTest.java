package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigInfoBaseEx
 *
 * @author Diffblue Cover
 */

class ConfigInfoBaseExTest {

    @Test
    void factory1() {
        ConfigInfoBaseEx configInfoBaseEx = new ConfigInfoBaseEx();
        configInfoBaseEx.setMessage("ConfigInfoBaseEx s");
        configInfoBaseEx.setStatus(1);
        configInfoBaseEx.setContent("hello");
        configInfoBaseEx.setDataId("1234");
        configInfoBaseEx.setGroup("/some/path.html");
        configInfoBaseEx.setId(1L);
        configInfoBaseEx.setMd5("/some/path.html");
        assertThat(configInfoBaseEx.getMessage(), is("ConfigInfoBaseEx s"));
        assertThat(configInfoBaseEx.getStatus(), is(1));
        assertThat(configInfoBaseEx.getContent(), is("hello"));
        assertThat(configInfoBaseEx.getDataId(), is("1234"));
        assertThat(configInfoBaseEx.getGroup(), is("/some/path.html"));
        assertThat(configInfoBaseEx.getId(), is(1L));
        assertThat(configInfoBaseEx.getMd5(), is("/some/path.html"));
    }

    @Test
    void factory2() {
        ConfigInfoBaseEx configInfoBaseEx = new ConfigInfoBaseEx("1234", "ConfigInfoBaseEx s", "hello");
        configInfoBaseEx.setMessage("/some/path.html");
        configInfoBaseEx.setStatus(1);
        configInfoBaseEx.setContent("hello");
        configInfoBaseEx.setDataId("1234");
        configInfoBaseEx.setGroup("/some/path.html");
        configInfoBaseEx.setId(1L);
        configInfoBaseEx.setMd5("/some/path.html");
        assertThat(configInfoBaseEx.getMessage(), is("/some/path.html"));
        assertThat(configInfoBaseEx.getStatus(), is(1));
        assertThat(configInfoBaseEx.getContent(), is("hello"));
        assertThat(configInfoBaseEx.getDataId(), is("1234"));
        assertThat(configInfoBaseEx.getGroup(), is("/some/path.html"));
        assertThat(configInfoBaseEx.getId(), is(1L));
        assertThat(configInfoBaseEx.getMd5(), is("/some/path.html"));
    }

    @Test
    void factory3() {
        ConfigInfoBaseEx configInfoBaseEx = new ConfigInfoBaseEx("1234", "ConfigInfoBaseEx s", "hello", 1, "/some/path.html");
        configInfoBaseEx.setMessage("/some/path.html");
        configInfoBaseEx.setStatus(1);
        configInfoBaseEx.setContent("hello");
        configInfoBaseEx.setDataId("1234");
        configInfoBaseEx.setGroup("/some/path.html");
        configInfoBaseEx.setId(1L);
        configInfoBaseEx.setMd5("/some/path.html");
        assertThat(configInfoBaseEx.getMessage(), is("/some/path.html"));
        assertThat(configInfoBaseEx.getStatus(), is(1));
        assertThat(configInfoBaseEx.getContent(), is("hello"));
        assertThat(configInfoBaseEx.getDataId(), is("1234"));
        assertThat(configInfoBaseEx.getGroup(), is("/some/path.html"));
        assertThat(configInfoBaseEx.getId(), is(1L));
        assertThat(configInfoBaseEx.getMd5(), is("/some/path.html"));
    }

    @Test
    void equalsReturnsFalse() {
        assertThat(new ConfigInfoBaseEx().equals(new Object()), is(false));
    }
}
