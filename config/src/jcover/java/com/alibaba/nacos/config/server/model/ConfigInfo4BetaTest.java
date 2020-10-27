package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigInfo4Beta
 *
 * @author Diffblue Cover
 */

class ConfigInfo4BetaTest {

    @Test
    void factory1() {
        ConfigInfo4Beta configInfo4Beta = new ConfigInfo4Beta();
        configInfo4Beta.setBetaIps("/some/path.html");
        configInfo4Beta.setAppName("Acme");
        configInfo4Beta.setTenant("/some/path.html");
        configInfo4Beta.setContent("hello");
        configInfo4Beta.setDataId("1234");
        configInfo4Beta.setGroup("/some/path.html");
        configInfo4Beta.setId(1L);
        configInfo4Beta.setMd5("/some/path.html");
        assertThat(configInfo4Beta.getBetaIps(), is("/some/path.html"));
        assertThat(configInfo4Beta.getAppName(), is("Acme"));
        assertThat(configInfo4Beta.getTenant(), is("/some/path.html"));
        assertThat(configInfo4Beta.getContent(), is("hello"));
        assertThat(configInfo4Beta.getDataId(), is("1234"));
        assertThat(configInfo4Beta.getGroup(), is("/some/path.html"));
        assertThat(configInfo4Beta.getId(), is(1L));
        assertThat(configInfo4Beta.getMd5(), is("/some/path.html"));
    }

    @Test
    void factory2() {
        ConfigInfo4Beta configInfo4Beta =
             new ConfigInfo4Beta("1234", "/some/path.html", "Acme", "hello", "/some/path.html");
        configInfo4Beta.setBetaIps("/some/path.html");
        configInfo4Beta.setAppName("Acme");
        configInfo4Beta.setTenant("/some/path.html");
        configInfo4Beta.setContent("hello");
        configInfo4Beta.setDataId("1234");
        configInfo4Beta.setGroup("/some/path.html");
        configInfo4Beta.setId(1L);
        configInfo4Beta.setMd5("/some/path.html");
        assertThat(configInfo4Beta.getBetaIps(), is("/some/path.html"));
        assertThat(configInfo4Beta.getAppName(), is("Acme"));
        assertThat(configInfo4Beta.getTenant(), is("/some/path.html"));
        assertThat(configInfo4Beta.getContent(), is("hello"));
        assertThat(configInfo4Beta.getDataId(), is("1234"));
        assertThat(configInfo4Beta.getGroup(), is("/some/path.html"));
        assertThat(configInfo4Beta.getId(), is(1L));
        assertThat(configInfo4Beta.getMd5(), is("/some/path.html"));
    }

    @Test
    void testEquals() {
        assertThat(new ConfigInfo4Beta().equals(new Object()), is(false));
        assertThat(new ConfigInfo4Beta().equals(new Object()), is(false));
    }
}
