package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.SimpleCache
 *
 * @author Diffblue Cover
 */

class SimpleCacheTest {

    @Test
    void putEIsBar() {
        new SimpleCache<String>().put("key", "bar", 1L);
    }

    @Test
    void putEIsNull() {
        new SimpleCache<String>().put("key", null, 1L);
    }

    @Test
    void putKeyIsNull() {
        new SimpleCache<String>().put(null, "foo=bar", 1L);
    }

    @Test
    void getKeyIsKeyReturnsNull() {
        assertThat(new SimpleCache<String>().get("key"), is(nullValue()));
    }
}
