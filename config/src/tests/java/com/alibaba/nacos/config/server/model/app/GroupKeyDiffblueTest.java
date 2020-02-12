package com.alibaba.nacos.config.server.model.app;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.app.GroupKey
 *
 * @author Diffblue JCover
 */

public class GroupKeyDiffblueTest {

    @Test(timeout=10000)
    public void getDataIdReturnsNull() {
        assertThat(new GroupKey("foo").getDataId(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getGroupReturnsFoo() {
        assertThat(new GroupKey("foo").getGroup(), is("foo"));
    }

    @Test(timeout=10000)
    public void setDataIdToSomething() {
        GroupKey groupKey = new GroupKey("foo");
        groupKey.setDataId("something");
        assertThat(groupKey.getDataId(), is("something"));
        assertThat(groupKey.getGroupkeyString(), is("something+foo"));
    }

    @Test(timeout=10000)
    public void setGroupToFoo() {
        new GroupKey("foo").setGroup("foo");
    }
}
