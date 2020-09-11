package com.alibaba.nacos.config.server.model.app;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.app.GroupKey
 *
 * @author Diffblue Cover
 */

class GroupKeyTest {

    @Test
    void factory1() {
        GroupKey groupKey = new GroupKey("foo");
        groupKey.setDataId("1234");
        groupKey.setGroup("key");
        assertThat(groupKey.getDataId(), is("1234"));
        assertThat(groupKey.getGroup(), is("key"));
        assertThat(groupKey.getGroupkeyString(), is("1234+key"));
    }

    @Test
    void factory2() {
        GroupKey groupKey = new GroupKey("1234", "foo");
        groupKey.setDataId("1234");
        groupKey.setGroup("key");
        assertThat(groupKey.getDataId(), is("1234"));
        assertThat(groupKey.getGroup(), is("key"));
        assertThat(groupKey.getGroupkeyString(), is("1234+key"));
    }
}
