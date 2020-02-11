package com.alibaba.nacos.config.server.model.capacity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import java.sql.Timestamp;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.capacity.Capacity
 *
 * @author Diffblue JCover
 */

public class CapacityTest {

    @Test(timeout=10000)
    public void getGmtCreateReturnsNull() {
        assertThat(new Capacity().getGmtCreate(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getGmtModifiedReturnsNull() {
        assertThat(new Capacity().getGmtModified(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getIdReturnsNull() {
        assertThat(new Capacity().getId(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getMaxAggrCountReturnsNull() {
        assertThat(new Capacity().getMaxAggrCount(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getMaxAggrSizeReturnsNull() {
        assertThat(new Capacity().getMaxAggrSize(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getMaxSizeReturnsNull() {
        assertThat(new Capacity().getMaxSize(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getQuotaReturnsNull() {
        assertThat(new Capacity().getQuota(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getUsageReturnsNull() {
        assertThat(new Capacity().getUsage(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setGmtCreate() {
        Capacity capacity = new Capacity();
        capacity.setGmtCreate(new Timestamp(1L));
        assertThat(capacity.getGmtCreate().getNanos(), is(1_000_000));
        assertThat(capacity.getGmtCreate().getTime(), is(1L));
        assertThat(capacity.getGmtCreate().getDate(), is(1));
        assertThat(capacity.getGmtCreate().getDay(), is(4));
        assertThat(capacity.getGmtCreate().getHours(), is(0));
        assertThat(capacity.getGmtCreate().getMinutes(), is(0));
        assertThat(capacity.getGmtCreate().getMonth(), is(0));
        assertThat(capacity.getGmtCreate().getSeconds(), is(0));
        assertThat(capacity.getGmtCreate().getTimezoneOffset(), is(0));
        assertThat(capacity.getGmtCreate().getYear(), is(70));
    }

    @Test(timeout=10000)
    public void setGmtCreateToNull() {
        new Capacity().setGmtCreate(null);
    }

    @Test(timeout=10000)
    public void setGmtModified() {
        Capacity capacity = new Capacity();
        capacity.setGmtModified(new Timestamp(1L));
        assertThat(capacity.getGmtModified().getNanos(), is(1_000_000));
        assertThat(capacity.getGmtModified().getTime(), is(1L));
        assertThat(capacity.getGmtModified().getDate(), is(1));
        assertThat(capacity.getGmtModified().getDay(), is(4));
        assertThat(capacity.getGmtModified().getHours(), is(0));
        assertThat(capacity.getGmtModified().getMinutes(), is(0));
        assertThat(capacity.getGmtModified().getMonth(), is(0));
        assertThat(capacity.getGmtModified().getSeconds(), is(0));
        assertThat(capacity.getGmtModified().getTimezoneOffset(), is(0));
        assertThat(capacity.getGmtModified().getYear(), is(70));
    }

    @Test(timeout=10000)
    public void setGmtModifiedToNull() {
        new Capacity().setGmtModified(null);
    }

    @Test(timeout=10000)
    public void setIdToOne() {
        Capacity capacity = new Capacity();
        capacity.setId(1L);
        assertThat(capacity.getId(), is(1L));
    }

    @Test(timeout=10000)
    public void setMaxAggrCountToOne() {
        Capacity capacity = new Capacity();
        capacity.setMaxAggrCount(1);
        assertThat(capacity.getMaxAggrCount(), is(1));
    }

    @Test(timeout=10000)
    public void setMaxAggrSizeToOne() {
        Capacity capacity = new Capacity();
        capacity.setMaxAggrSize(1);
        assertThat(capacity.getMaxAggrSize(), is(1));
    }

    @Test(timeout=10000)
    public void setMaxSizeToOne() {
        Capacity capacity = new Capacity();
        capacity.setMaxSize(1);
        assertThat(capacity.getMaxSize(), is(1));
    }

    @Test(timeout=10000)
    public void setQuotaToOne() {
        Capacity capacity = new Capacity();
        capacity.setQuota(1);
        assertThat(capacity.getQuota(), is(1));
    }

    @Test(timeout=10000)
    public void setUsageToOne() {
        Capacity capacity = new Capacity();
        capacity.setUsage(1);
        assertThat(capacity.getUsage(), is(1));
    }
}
