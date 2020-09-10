package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.TenantInfo
 *
 * @author Diffblue Cover
 */

class TenantInfoTest {

    @Test
    void factory() {
        TenantInfo tenantInfo = new TenantInfo();
        tenantInfo.setTenantDesc("/some/path.html");
        tenantInfo.setTenantId("1234");
        tenantInfo.setTenantName("Acme");
        assertThat(tenantInfo.getTenantDesc(), is("/some/path.html"));
        assertThat(tenantInfo.getTenantId(), is("1234"));
        assertThat(tenantInfo.getTenantName(), is("Acme"));
    }
}
