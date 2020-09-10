package com.alibaba.nacos.client.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.utils.TenantUtil
 *
 * @author Diffblue Cover
 */

class TenantUtilTest {

    @Test
    void getUserTenantForAcmReturnsEmpty() {
        assertThat(TenantUtil.getUserTenantForAcm(), is(""));
    }

    @Test
    void getUserTenantForAnsReturnsNull() {
        assertThat(TenantUtil.getUserTenantForAns(), is(nullValue()));
    }
}
