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
        configInfoBaseEx.setMessage("an error has happened");
        configInfoBaseEx.setStatus(1);
        configInfoBaseEx.setContent("hello");
        configInfoBaseEx.setDataId("1234");
        configInfoBaseEx.setGroup("ConfigInfoBaseEx s");
        configInfoBaseEx.setId(1L);
        configInfoBaseEx.setMd5("/some/path.html");
        assertThat(configInfoBaseEx.getMessage(), is("an error has happened"));
        assertThat(configInfoBaseEx.getStatus(), is(1));
        assertThat(configInfoBaseEx.getContent(), is("hello"));
        assertThat(configInfoBaseEx.getDataId(), is("1234"));
        assertThat(configInfoBaseEx.getGroup(), is("ConfigInfoBaseEx s"));
        assertThat(configInfoBaseEx.getId(), is(1L));
        assertThat(configInfoBaseEx.getMd5(), is("/some/path.html"));
    }

    @Test
    void factory2() {
        ConfigInfoBaseEx configInfoBaseEx =
             new ConfigInfoBaseEx("1234", "foo", "hello");
        configInfoBaseEx.setMessage("an error has happened");
        configInfoBaseEx.setStatus(1);
        configInfoBaseEx.setContent("hello");
        configInfoBaseEx.setDataId("1234");
        configInfoBaseEx.setGroup("ConfigInfoBaseEx s");
        configInfoBaseEx.setId(1L);
        configInfoBaseEx.setMd5("/some/path.html");
        assertThat(configInfoBaseEx.getMessage(), is("an error has happened"));
        assertThat(configInfoBaseEx.getStatus(), is(1));
        assertThat(configInfoBaseEx.getContent(), is("hello"));
        assertThat(configInfoBaseEx.getDataId(), is("1234"));
        assertThat(configInfoBaseEx.getGroup(), is("ConfigInfoBaseEx s"));
        assertThat(configInfoBaseEx.getId(), is(1L));
        assertThat(configInfoBaseEx.getMd5(), is("/some/path.html"));
    }

    @Test
    void factory3() {
        ConfigInfoBaseEx configInfoBaseEx =
             new ConfigInfoBaseEx("1234", "foo", "hello", 1, "an error has happened");
        configInfoBaseEx.setMessage("an error has happened");
        configInfoBaseEx.setStatus(1);
        configInfoBaseEx.setContent("hello");
        configInfoBaseEx.setDataId("1234");
        configInfoBaseEx.setGroup("ConfigInfoBaseEx s");
        configInfoBaseEx.setId(1L);
        configInfoBaseEx.setMd5("/some/path.html");
        assertThat(configInfoBaseEx.getMessage(), is("an error has happened"));
        assertThat(configInfoBaseEx.getStatus(), is(1));
        assertThat(configInfoBaseEx.getContent(), is("hello"));
        assertThat(configInfoBaseEx.getDataId(), is("1234"));
        assertThat(configInfoBaseEx.getGroup(), is("ConfigInfoBaseEx s"));
        assertThat(configInfoBaseEx.getId(), is(1L));
        assertThat(configInfoBaseEx.getMd5(), is("/some/path.html"));
    }

    @Test
    void equalsReturnsFalse() {
        assertThat(new ConfigInfoBaseEx().equals(new Object()), is(false));
    }
}
