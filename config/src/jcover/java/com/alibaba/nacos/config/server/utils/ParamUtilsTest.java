package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.ParamUtils
 *
 * @author Diffblue Cover
 */

class ParamUtilsTest {

    @Test
    void isValid() {
        assertThat(ParamUtils.isValid("name"), is(true));
        assertThat(ParamUtils.isValid(null), is(false));
    }

    @Test
    void checkParamContentIsHelloAndDataIdIsBarAndGroupIsName() throws com.alibaba.nacos.config.server.exception.NacosException {
        ParamUtils.checkParam("bar", "name", "1234", "hello");
    }

    @Test
    void checkParamTagIsEmpty() {
        ParamUtils.checkParam("");
    }

    @Test
    void checkParamTagIsName() {
        ParamUtils.checkParam("name");
    }

    @Test
    void checkTenantTenantIsEmpty() {
        ParamUtils.checkTenant("");
    }

    @Test
    void checkTenantTenantIsName() {
        ParamUtils.checkTenant("name");
    }
}
