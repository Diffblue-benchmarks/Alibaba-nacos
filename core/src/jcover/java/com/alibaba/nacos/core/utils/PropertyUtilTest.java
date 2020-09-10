package com.alibaba.nacos.core.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.core.utils.PropertyUtil
 *
 * @author Diffblue Cover
 */

class PropertyUtilTest {

    @Test
    void getProperty() {
        assertThat(PropertyUtil.getProperty("key", "value"), is("value"));
        assertThat(PropertyUtil.getProperty("key"), is(nullValue()));
    }

    @Test
    void getPropertyListKeyIsKeyReturnsEmpty() {
        assertThat(PropertyUtil.getPropertyList("key"), empty());
    }
}
