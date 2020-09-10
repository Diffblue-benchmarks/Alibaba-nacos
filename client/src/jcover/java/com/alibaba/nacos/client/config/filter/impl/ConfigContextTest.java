package com.alibaba.nacos.client.config.filter.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.filter.impl.ConfigContext
 *
 * @author Diffblue Cover
 */

class ConfigContextTest {

    @Test
    void getParameterKeyIsKeyReturnsNull() {
        assertThat(new ConfigContext().getParameter("key"), is(nullValue()));
    }

    @Test
    void setParameterKeyIsKey() {
        new ConfigContext().setParameter("key", new Object());
    }
}
