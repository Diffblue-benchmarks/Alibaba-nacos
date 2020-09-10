package com.alibaba.nacos.config.server.model.capacity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.capacity.GroupCapacity
 *
 * @author Diffblue Cover
 */

class GroupCapacityTest {

    @Test
    void factory() {
        GroupCapacity groupCapacity = new GroupCapacity();
        groupCapacity.setGroup("/some/path.html");
        groupCapacity.setGmtCreate(Timestamp.valueOf("2019-12-31 23:10:59"));
        groupCapacity.setGmtModified(Timestamp.valueOf("2019-12-31 23:10:59"));
        groupCapacity.setId(1L);
        groupCapacity.setMaxAggrCount(1);
        groupCapacity.setMaxAggrSize(1);
        groupCapacity.setMaxSize(1);
        groupCapacity.setQuota(1);
        groupCapacity.setUsage(1);
        assertThat(groupCapacity.getGroup(), is("/some/path.html"));
        assertThat(groupCapacity.getId(), is(1L));
        assertThat(groupCapacity.getMaxAggrCount(), is(1));
        assertThat(groupCapacity.getMaxAggrSize(), is(1));
        assertThat(groupCapacity.getMaxSize(), is(1));
        assertThat(groupCapacity.getQuota(), is(1));
        assertThat(groupCapacity.getUsage(), is(1));
    }
}
