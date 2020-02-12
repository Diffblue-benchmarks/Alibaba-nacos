package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.GroupKey2
 *
 * @author Diffblue JCover
 */

public class GroupKey2DiffblueTest {

    @Test(timeout=10000)
    public void getKey() {
        assertThat(GroupKey2.getKey("something", "foo"), is("something+foo"));
        assertThat(GroupKey2.getKey("something", "bar", "foo"), is("something+bar+foo"));
        assertThat(GroupKey2.getKey("something", "foo", ""), is("something+foo"));
    }

    @Test(timeout=10000)
    public void parseKeyGroupKeyIsFooReturnsNullFooNull() {
        assertArrayEquals(new String[] { null, "foo", null }, GroupKey2.parseKey("foo"));
    }
}
