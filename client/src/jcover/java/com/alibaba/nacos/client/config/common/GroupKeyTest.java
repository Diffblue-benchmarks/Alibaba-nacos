package com.alibaba.nacos.client.config.common;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.common.GroupKey
 *
 * @author Diffblue Cover
 */

class GroupKeyTest {

    @Test
    void getKeyTenant() {
        assertThat(GroupKey.getKeyTenant("1234", "bar", "key"), is("1234+bar+key"));
        assertThat(GroupKey.getKeyTenant("1234", "key", ""), is("1234+key"));
    }

    @Test
    void getKey() {
        assertThat(GroupKey.getKey("1234", "bar", "key"), is("1234+bar+key"));
        assertThat(GroupKey.getKey("1234", "key"), is("1234+key"));
    }

    @Test
    void parseKeyGroupKeyIsKeyReturnsNullKeyNull() {
        assertThat(GroupKey.parseKey("key"), Matchers.arrayContaining(null, "key", null));
    }
}
