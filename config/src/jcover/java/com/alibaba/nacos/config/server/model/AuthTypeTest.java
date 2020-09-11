package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.AuthType
 *
 * @author Diffblue Cover
 */

class AuthTypeTest {

    @Test
    void valuesReturnsGroupGroup_dataidTenant_groupTenant() {
        AuthType[] result = AuthType.values();
        assertThat(result[0], is(AuthType.GROUP));
        assertThat(result[1], is(AuthType.GROUP_DATAID));
        assertThat(result[2], is(AuthType.TENANT_GROUP));
        assertThat(result[3], is(AuthType.TENANT));
    }
}
