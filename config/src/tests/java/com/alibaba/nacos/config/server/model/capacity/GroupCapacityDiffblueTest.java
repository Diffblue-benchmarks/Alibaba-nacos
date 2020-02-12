package com.alibaba.nacos.config.server.model.capacity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.capacity.GroupCapacity
 *
 * @author Diffblue JCover
 */

public class GroupCapacityDiffblueTest {

    @Test(timeout=10000)
    public void getGroupReturnsNull() {
        assertThat(new GroupCapacity().getGroup(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setGroupToFoo() {
        GroupCapacity groupCapacity = new GroupCapacity();
        groupCapacity.setGroup("foo");
        assertThat(groupCapacity.getGroup(), is("foo"));
    }
}
