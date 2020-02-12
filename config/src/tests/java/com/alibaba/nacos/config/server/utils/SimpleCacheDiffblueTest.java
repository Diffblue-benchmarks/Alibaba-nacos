package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.SimpleCache
 *
 * @author Diffblue JCover
 */

public class SimpleCacheDiffblueTest {

    @Test(timeout=10000)
    public void getKeyIsFooReturnsNull() {
        assertThat(new SimpleCache<Object>().get("foo"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void put() {
        new SimpleCache<Object>().put("foo", new Object(), 1L);
    }

    @Test(timeout=10000)
    public void putEIsNull() {
        new SimpleCache<Object>().put("foo", null, 1L);
    }

    @Test(timeout=10000)
    public void putKeyIsNull() {
        new SimpleCache<Object>().put(null, new Object(), 1L);
    }
}
