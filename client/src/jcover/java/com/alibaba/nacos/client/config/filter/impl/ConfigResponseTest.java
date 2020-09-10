package com.alibaba.nacos.client.config.filter.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.filter.impl.ConfigResponse
 *
 * @author Diffblue Cover
 */

class ConfigResponseTest {

    @Test
    void factory() {
        ConfigResponse configResponse = new ConfigResponse();
        configResponse.setContent("hello");
        configResponse.setDataId("1234");
        configResponse.setGroup("/bin/bash");
        configResponse.setTenant("/bin/bash");
        // pojo ConfigResponse
    }

    @Test
    void getTenant() {
        ConfigResponse configResponse = new ConfigResponse();
        configResponse.setTenant("/bin/bash");
        assertThat(configResponse.getTenant(), is("/bin/bash"));
    }

    @Test
    void getDataId() {
        ConfigResponse configResponse = new ConfigResponse();
        configResponse.setDataId("1234");
        assertThat(configResponse.getDataId(), is("1234"));
    }

    @Test
    void getGroup() {
        ConfigResponse configResponse = new ConfigResponse();
        configResponse.setGroup("/bin/bash");
        assertThat(configResponse.getGroup(), is("/bin/bash"));
    }

    @Test
    void getContentReturnsHello() {
        ConfigResponse configResponse = new ConfigResponse();
        configResponse.setContent("hello");
        assertThat(configResponse.getContent(), is("hello"));
    }

    @Test
    void getParameterKeyIsKeyReturnsNull() {
        assertThat(new ConfigResponse().getParameter("key"), is(nullValue()));
    }
}
