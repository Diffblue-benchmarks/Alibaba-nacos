package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.AuthType
 *
 * @author Diffblue JCover
 */

public class AuthTypeTest {

    @Test(timeout=10000)
    public void valuesReturnsGROUPGROUP_DATAIDTENANT_GROUPTENANT() {
        AuthType[] result = AuthType.values();
        assertThat(result[0], is(AuthType.GROUP));
        assertThat(result[1], is(AuthType.GROUP_DATAID));
        assertThat(result[2], is(AuthType.TENANT_GROUP));
        assertThat(result[3], is(AuthType.TENANT));
    }
}
