package com.alibaba.nacos.config.server.model.capacity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.capacity.TenantCapacity
 *
 * @author Diffblue Cover
 */

class TenantCapacityTest {

    @Test
    void factory() {
        TenantCapacity tenantCapacity = new TenantCapacity();
        tenantCapacity.setTenant("/some/path.html");
        tenantCapacity.setGmtCreate(Timestamp.valueOf("2019-12-31 23:10:59"));
        tenantCapacity.setGmtModified(Timestamp.valueOf("2019-12-31 23:10:59"));
        tenantCapacity.setId(1L);
        tenantCapacity.setMaxAggrCount(1);
        tenantCapacity.setMaxAggrSize(1);
        tenantCapacity.setMaxSize(1);
        tenantCapacity.setQuota(1);
        tenantCapacity.setUsage(1);
        assertThat(tenantCapacity.getTenant(), is("/some/path.html"));
        assertThat(tenantCapacity.getId(), is(1L));
        assertThat(tenantCapacity.getMaxAggrCount(), is(1));
        assertThat(tenantCapacity.getMaxAggrSize(), is(1));
        assertThat(tenantCapacity.getMaxSize(), is(1));
        assertThat(tenantCapacity.getQuota(), is(1));
        assertThat(tenantCapacity.getUsage(), is(1));
    }
}
