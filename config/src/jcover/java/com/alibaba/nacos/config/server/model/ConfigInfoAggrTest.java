package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigInfoAggr
 *
 * @author Diffblue Cover
 */

class ConfigInfoAggrTest {

    @Test
    void factory1() {
        ConfigInfoAggr configInfoAggr = new ConfigInfoAggr();
        configInfoAggr.setAppName("Acme");
        configInfoAggr.setContent("hello");
        configInfoAggr.setDataId("1234");
        configInfoAggr.setDatumId("1234");
        configInfoAggr.setGroup("ConfigInfoAggr d");
        configInfoAggr.setId(1L);
        configInfoAggr.setTenant("/some/path.html");
        assertThat(configInfoAggr.getAppName(), is("Acme"));
        assertThat(configInfoAggr.getContent(), is("hello"));
        assertThat(configInfoAggr.getDataId(), is("1234"));
        assertThat(configInfoAggr.getDatumId(), is("1234"));
        assertThat(configInfoAggr.getGroup(), is("ConfigInfoAggr d"));
        assertThat(configInfoAggr.getId(), is(1L));
        assertThat(configInfoAggr.getTenant(), is("/some/path.html"));
    }

    @Test
    void factory2() {
        ConfigInfoAggr configInfoAggr =
             new ConfigInfoAggr("1234", "ConfigInfoAggr d", "1234", "hello");
        configInfoAggr.setAppName("Acme");
        configInfoAggr.setContent("hello");
        configInfoAggr.setDataId("1234");
        configInfoAggr.setDatumId("1234");
        configInfoAggr.setGroup("/some/path.html");
        configInfoAggr.setId(1L);
        configInfoAggr.setTenant("/some/path.html");
        assertThat(configInfoAggr.getAppName(), is("Acme"));
        assertThat(configInfoAggr.getContent(), is("hello"));
        assertThat(configInfoAggr.getDataId(), is("1234"));
        assertThat(configInfoAggr.getDatumId(), is("1234"));
        assertThat(configInfoAggr.getGroup(), is("/some/path.html"));
        assertThat(configInfoAggr.getId(), is(1L));
        assertThat(configInfoAggr.getTenant(), is("/some/path.html"));
    }

    @Test
    void factory3() {
        ConfigInfoAggr configInfoAggr =
             new ConfigInfoAggr("1234", "ConfigInfoAggr d", "1234", "Acme", "hello");
        configInfoAggr.setAppName("Acme");
        configInfoAggr.setContent("hello");
        configInfoAggr.setDataId("1234");
        configInfoAggr.setDatumId("1234");
        configInfoAggr.setGroup("/some/path.html");
        configInfoAggr.setId(1L);
        configInfoAggr.setTenant("/some/path.html");
        assertThat(configInfoAggr.getAppName(), is("Acme"));
        assertThat(configInfoAggr.getContent(), is("hello"));
        assertThat(configInfoAggr.getDataId(), is("1234"));
        assertThat(configInfoAggr.getDatumId(), is("1234"));
        assertThat(configInfoAggr.getGroup(), is("/some/path.html"));
        assertThat(configInfoAggr.getId(), is(1L));
        assertThat(configInfoAggr.getTenant(), is("/some/path.html"));
    }

    @Test
    void equalsReturnsFalse() {
        assertThat(new ConfigInfoAggr().equals(new Object()), is(false));
    }
}
