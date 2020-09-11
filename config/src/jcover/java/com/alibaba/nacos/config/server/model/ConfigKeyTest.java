package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigKey
 *
 * @author Diffblue Cover
 */

class ConfigKeyTest {

    @Test
    void factory1() {
        ConfigKey configKey = new ConfigKey();
        configKey.setAppName("Acme");
        configKey.setDataId("1234");
        configKey.setGroup("key");
        assertThat(configKey.getAppName(), is("Acme"));
        assertThat(configKey.getDataId(), is("1234"));
        assertThat(configKey.getGroup(), is("key"));
    }

    @Test
    void factory2() {
        ConfigKey configKey = new ConfigKey("Acme", "1234", "key");
        configKey.setAppName("Acme");
        configKey.setDataId("1234");
        configKey.setGroup("key");
        assertThat(configKey.getAppName(), is("Acme"));
        assertThat(configKey.getDataId(), is("1234"));
        assertThat(configKey.getGroup(), is("key"));
    }
}
