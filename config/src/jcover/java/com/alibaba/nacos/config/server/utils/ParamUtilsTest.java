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
    void checkParam1() throws com.alibaba.nacos.config.server.exception.NacosException {
        HashMap<String, Object> configAdvanceInfo =
             new HashMap<String, Object>();
        configAdvanceInfo.put("config_tags", "foo");
        ParamUtils.checkParam(configAdvanceInfo);
    }

    @Test
    void checkParam2() throws com.alibaba.nacos.config.server.exception.NacosException {
        HashMap<String, Object> configAdvanceInfo =
             new HashMap<String, Object>();
        configAdvanceInfo.put("desc", "foo");
        ParamUtils.checkParam(configAdvanceInfo);
    }

    @Test
    void checkParam3() throws com.alibaba.nacos.config.server.exception.NacosException {
        HashMap<String, Object> configAdvanceInfo =
             new HashMap<String, Object>();
        configAdvanceInfo.put("effect", "foo");
        ParamUtils.checkParam(configAdvanceInfo);
    }

    @Test
    void checkParam4() throws com.alibaba.nacos.config.server.exception.NacosException {
        HashMap<String, Object> configAdvanceInfo =
             new HashMap<String, Object>();
        configAdvanceInfo.put("schema", "foo");
        ParamUtils.checkParam(configAdvanceInfo);
    }

    @Test
    void checkParam5() throws com.alibaba.nacos.config.server.exception.NacosException {
        HashMap<String, Object> configAdvanceInfo =
             new HashMap<String, Object>();
        configAdvanceInfo.put("type", "foo");
        ParamUtils.checkParam(configAdvanceInfo);
    }

    @Test
    void checkParam6() throws com.alibaba.nacos.config.server.exception.NacosException {
        HashMap<String, Object> configAdvanceInfo =
             new HashMap<String, Object>();
        configAdvanceInfo.put("use", "foo");
        ParamUtils.checkParam(configAdvanceInfo);
    }
}
