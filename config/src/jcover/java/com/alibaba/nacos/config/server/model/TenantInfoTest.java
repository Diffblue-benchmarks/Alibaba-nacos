package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.TenantInfo
 *
 * @author Diffblue JCover
 */

public class TenantInfoTest {

    @Test(timeout=10000)
    public void getTenantDescReturnsNull() {
        assertThat(new TenantInfo().getTenantDesc(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTenantIdReturnsNull() {
        assertThat(new TenantInfo().getTenantId(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTenantNameReturnsNull() {
        assertThat(new TenantInfo().getTenantName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setTenantDescToFoo() {
        TenantInfo tenantInfo = new TenantInfo();
        tenantInfo.setTenantDesc("foo");
        assertThat(tenantInfo.getTenantDesc(), is("foo"));
    }

    @Test(timeout=10000)
    public void setTenantIdToFoo() {
        TenantInfo tenantInfo = new TenantInfo();
        tenantInfo.setTenantId("foo");
        assertThat(tenantInfo.getTenantId(), is("foo"));
    }

    @Test(timeout=10000)
    public void setTenantName() {
        TenantInfo tenantInfo = new TenantInfo();
        tenantInfo.setTenantName("/bin/bash");
        assertThat(tenantInfo.getTenantName(), is("/bin/bash"));
    }
}
