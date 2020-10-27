package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.ParamUtils
 *
 * @author Diffblue Cover
 */

class ParamUtilsTest {

    @Test
    void isValid() {
        assertThat(ParamUtils.isValid("data"), is(true));
        assertThat(ParamUtils.isValid(null), is(false));
    }

    @Test
    void checkParamContentIsDataAndDataIdIsBarAndGroupIsFoo() throws com.alibaba.nacos.config.server.exception.NacosException {
        ParamUtils.checkParam("bar", "foo", "1234", "data");
    }

    @Test
    void checkParamTagIsData() {
        ParamUtils.checkParam("data");
    }

    @Test
    void checkParamTagIsEmpty() {
        ParamUtils.checkParam("");
    }

    @Test
    void checkTenantTenantIsData() {
        ParamUtils.checkTenant("data");
    }

    @Test
    void checkTenantTenantIsEmpty() {
        ParamUtils.checkTenant("");
    }

    @Test
    void checkParam() throws com.alibaba.nacos.config.server.exception.NacosException {
        ParamUtils.checkParam(new HashMap<String, Object>());
    }
}
