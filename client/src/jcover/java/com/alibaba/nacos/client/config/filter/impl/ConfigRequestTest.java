package com.alibaba.nacos.client.config.filter.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.filter.impl.ConfigRequest
 *
 * @author Diffblue Cover
 */

class ConfigRequestTest {

    @Test
    void factory() {
        ConfigRequest configRequest = new ConfigRequest();
        configRequest.setContent("hello");
        configRequest.setDataId("1234");
        configRequest.setGroup("/some/path.html");
        configRequest.setTenant("/some/path.html");
        // pojo ConfigRequest
    }

    @Test
    void getTenant() {
        ConfigRequest configRequest = new ConfigRequest();
        configRequest.setTenant("/some/path.html");
        assertThat(configRequest.getTenant(), is("/some/path.html"));
    }

    @Test
    void getDataId() {
        ConfigRequest configRequest = new ConfigRequest();
        configRequest.setDataId("1234");
        assertThat(configRequest.getDataId(), is("1234"));
    }

    @Test
    void getGroup() {
        ConfigRequest configRequest = new ConfigRequest();
        configRequest.setGroup("/some/path.html");
        assertThat(configRequest.getGroup(), is("/some/path.html"));
    }

    @Test
    void getContentReturnsHello() {
        ConfigRequest configRequest = new ConfigRequest();
        configRequest.setContent("hello");
        assertThat(configRequest.getContent(), is("hello"));
    }

    @Test
    void getParameterKeyIsKeyReturnsNull() {
        assertThat(new ConfigRequest().getParameter("key"), is(nullValue()));
    }
}
