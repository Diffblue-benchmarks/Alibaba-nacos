package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.GroupKey
 *
 * @author Diffblue JCover
 */

public class GroupKeyTest {

    @Test(timeout=10000)
    public void getKey() {
        assertThat(GroupKey.getKey("something", "bar", "foo"), is("something+bar+foo"));
        assertThat(GroupKey.getKey("something", "foo"), is("something+foo"));
    }

    @Test(timeout=10000)
    public void getKeyTenant() {
        assertThat(GroupKey.getKeyTenant("something", "bar", "foo"), is("something+bar+foo"));
        assertThat(GroupKey.getKeyTenant("something", "foo", ""), is("something+foo"));
    }

    @Test(timeout=10000)
    public void parseKeyGroupKeyIsFooReturnsNullFooNull() {
        assertArrayEquals(new String[] { null, "foo", null }, GroupKey.parseKey("foo"));
    }
}
