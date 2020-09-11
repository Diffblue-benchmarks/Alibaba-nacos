package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.GroupInfo
 *
 * @author Diffblue Cover
 */

class GroupInfoTest {

    @Test
    void factory1() {
        GroupInfo groupInfo = new GroupInfo();
        groupInfo.setAddress("280 Broadway");
        groupInfo.setDataId("1234");
        groupInfo.setGroup("bar");
        groupInfo.setId(1L);
        assertThat(groupInfo.getAddress(), is("280 Broadway"));
        assertThat(groupInfo.getDataId(), is("1234"));
        assertThat(groupInfo.getGroup(), is("bar"));
        assertThat(groupInfo.getId(), is(1L));
    }

    @Test
    void factory2() {
        GroupInfo groupInfo = new GroupInfo("280 Broadway", "1234", "foo");
        groupInfo.setAddress("280 Broadway");
        groupInfo.setDataId("1234");
        groupInfo.setGroup("bar");
        groupInfo.setId(1L);
        assertThat(groupInfo.getAddress(), is("280 Broadway"));
        assertThat(groupInfo.getDataId(), is("1234"));
        assertThat(groupInfo.getGroup(), is("bar"));
        assertThat(groupInfo.getId(), is(1L));
    }

    @Test
    void testEquals() {
        assertThat(new GroupInfo().equals(new Object()), is(false));
        assertThat(new GroupInfo().equals(null), is(false));
    }
}
