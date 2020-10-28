package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigInfoWrapper
 *
 * @author Diffblue Cover
 */

class ConfigInfoWrapperTest {

    @Test
    void factory() {
        ConfigInfoWrapper configInfoWrapper = new ConfigInfoWrapper();
        configInfoWrapper.setLastModified(0L);
        configInfoWrapper.setAppName("Acme");
        configInfoWrapper.setTenant("bar");
        configInfoWrapper.setContent("hello");
        configInfoWrapper.setDataId("1234");
        configInfoWrapper.setGroup("/some/path.html");
        configInfoWrapper.setId(1L);
        configInfoWrapper.setMd5("/some/path.html");
        assertThat(configInfoWrapper.getLastModified(), is(0L));
        assertThat(configInfoWrapper.getAppName(), is("Acme"));
        assertThat(configInfoWrapper.getTenant(), is("bar"));
        assertThat(configInfoWrapper.getContent(), is("hello"));
        assertThat(configInfoWrapper.getDataId(), is("1234"));
        assertThat(configInfoWrapper.getGroup(), is("/some/path.html"));
        assertThat(configInfoWrapper.getId(), is(1L));
        assertThat(configInfoWrapper.getMd5(), is("/some/path.html"));
    }

    @Test
    void equalsReturnsFalse() {
        assertThat(new ConfigInfoWrapper().equals(new Object()), is(false));
    }
}
