package com.alibaba.nacos.client.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.utils.TenantUtil
 *
 * @author Diffblue JCover
 */

public class TenantUtilTest {

    @Test(timeout=10000)
    public void getUserTenantForAcmReturnsEmpty() {
        assertThat(TenantUtil.getUserTenantForAcm(), is(""));
    }

    @Test(timeout=10000)
    public void getUserTenantForAnsReturnsNull() {
        assertThat(TenantUtil.getUserTenantForAns(), is(nullValue()));
    }
}
