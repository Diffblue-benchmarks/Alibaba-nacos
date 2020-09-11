package com.alibaba.nacos.config.server.model.capacity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.capacity.Capacity
 *
 * @author Diffblue Cover
 */

class CapacityTest {

    @Test
    void factory1() {
        Capacity capacity = new Capacity();
        capacity.setGmtCreate(null);
        capacity.setGmtModified(Timestamp.valueOf("2019-12-31 23:10:59"));
        capacity.setId(1L);
        capacity.setMaxAggrCount(1);
        capacity.setMaxAggrSize(1);
        capacity.setMaxSize(1);
        capacity.setQuota(1);
        capacity.setUsage(1);
        assertThat(capacity.getId(), is(1L));
        assertThat(capacity.getMaxAggrCount(), is(1));
        assertThat(capacity.getMaxAggrSize(), is(1));
        assertThat(capacity.getMaxSize(), is(1));
        assertThat(capacity.getQuota(), is(1));
        assertThat(capacity.getUsage(), is(1));
    }

    @Test
    void factory2() {
        Capacity capacity = new Capacity();
        capacity.setGmtCreate(Timestamp.valueOf("2019-12-31 23:10:59"));
        capacity.setGmtModified(null);
        capacity.setId(1L);
        capacity.setMaxAggrCount(1);
        capacity.setMaxAggrSize(1);
        capacity.setMaxSize(1);
        capacity.setQuota(1);
        capacity.setUsage(1);
        assertThat(capacity.getId(), is(1L));
        assertThat(capacity.getMaxAggrCount(), is(1));
        assertThat(capacity.getMaxAggrSize(), is(1));
        assertThat(capacity.getMaxSize(), is(1));
        assertThat(capacity.getQuota(), is(1));
        assertThat(capacity.getUsage(), is(1));
    }

    @Test
    void factory3() {
        Capacity capacity = new Capacity();
        capacity.setGmtCreate(Timestamp.valueOf("2019-12-31 23:10:59"));
        capacity.setGmtModified(Timestamp.valueOf("2019-12-31 23:10:59"));
        capacity.setId(1L);
        capacity.setMaxAggrCount(0);
        capacity.setMaxAggrSize(1);
        capacity.setMaxSize(1);
        capacity.setQuota(1);
        capacity.setUsage(1);
        assertThat(capacity.getId(), is(1L));
        assertThat(capacity.getMaxAggrCount(), is(0));
        assertThat(capacity.getMaxAggrSize(), is(1));
        assertThat(capacity.getMaxSize(), is(1));
        assertThat(capacity.getQuota(), is(1));
        assertThat(capacity.getUsage(), is(1));
    }

    @Test
    void getGmtCreate() {
        Capacity capacity = new Capacity();
        capacity.setGmtCreate(Timestamp.valueOf("2019-12-31 23:10:59"));
        assertThat(capacity.getGmtCreate(), equalTo(Timestamp.valueOf("2019-12-31 23:10:59.0")));
    }

    @Test
    void getGmtCreateReturnsNull() {
        assertThat(new Capacity().getGmtCreate(), is(nullValue()));
    }

    @Test
    void getGmtModified() {
        Capacity capacity = new Capacity();
        capacity.setGmtModified(Timestamp.valueOf("2019-12-31 23:10:59"));
        assertThat(capacity.getGmtModified(), equalTo(Timestamp.valueOf("2019-12-31 23:10:59.0")));
    }

    @Test
    void getGmtModifiedReturnsNull() {
        assertThat(new Capacity().getGmtModified(), is(nullValue()));
    }
}
