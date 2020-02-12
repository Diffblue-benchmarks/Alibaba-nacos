package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.GroupInfo
 *
 * @author Diffblue JCover
 */

public class GroupInfoDiffblueTest {

    @Test(timeout=10000)
    public void getAddressReturnsNull() {
        assertThat(new GroupInfo().getAddress(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getDataIdReturnsNull() {
        assertThat(new GroupInfo().getDataId(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getGroupReturnsNull() {
        assertThat(new GroupInfo().getGroup(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getIdReturnsZero() {
        assertThat(new GroupInfo().getId(), is(0L));
    }

    @Test(timeout=10000)
    public void setAddress() {
        GroupInfo groupInfo = new GroupInfo();
        groupInfo.setAddress("280 Broadway");
        assertThat(groupInfo.getAddress(), is("280 Broadway"));
    }

    @Test(timeout=10000)
    public void setDataIdToSomething() {
        GroupInfo groupInfo = new GroupInfo();
        groupInfo.setDataId("something");
        assertThat(groupInfo.getDataId(), is("something"));
    }

    @Test(timeout=10000)
    public void setGroupToFoo() {
        GroupInfo groupInfo = new GroupInfo();
        groupInfo.setGroup("foo");
        assertThat(groupInfo.getGroup(), is("foo"));
    }

    @Test(timeout=10000)
    public void setIdToOne() {
        GroupInfo groupInfo = new GroupInfo();
        groupInfo.setId(1L);
        assertThat(groupInfo.getId(), is(1L));
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(new GroupInfo().equals("foo"), is(false));
        assertThat(new GroupInfo("280 Broadway", "something", "bar").equals("foo"), is(false));
        assertThat(new GroupInfo().equals(null), is(false));
    }
}
