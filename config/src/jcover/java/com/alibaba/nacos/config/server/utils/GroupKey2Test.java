package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.GroupKey2
 *
 * @author Diffblue Cover
 */

class GroupKey2Test {

    @Test
    void getKey() {
        assertThat(GroupKey2.getKey("1234", "key"), is("1234+key"));
        assertThat(GroupKey2.getKey("1234", "bar", "key"), is("1234+bar+key"));
        assertThat(GroupKey2.getKey("1234", "key", ""), is("1234+key"));
    }

    @Test
    void parseKeyGroupKeyIsKeyReturnsNullKeyNull() {
        assertThat(GroupKey2.parseKey("key"), Matchers.arrayContaining(null, "key", null));
    }
}
