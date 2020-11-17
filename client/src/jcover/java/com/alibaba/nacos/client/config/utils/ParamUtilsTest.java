package com.alibaba.nacos.client.config.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.utils.ParamUtils
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
    void checkKeyParam() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkKeyParam("1234", "data");
    }

    @Test
    void checkTDGGroupIsDataAndTenantIsBar() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkTDG("bar", "1234", "data");
    }

    @Test
    void checkKeyParamDataIdIsBar() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkKeyParam("bar", "data", "1234");
    }

    @Test
    void checkKeyParamDataIdsIsBar() throws com.alibaba.nacos.api.exception.NacosException {
        ArrayList<String> dataIds = new ArrayList<String>();
        dataIds.add("bar");
        ParamUtils.checkKeyParam(dataIds, "data");
    }

    @Test
    void checkParamGroupIsBar() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkParam("1234", "bar", "data");
    }

    @Test
    void checkParamDataIdIsBarAndGroupIsFoo() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkParam("bar", "foo", "1234", "data");
    }

    @Test
    void checkTenantTenantIsData() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkTenant("data");
    }

    @Test
    void checkBetaIps() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkBetaIps(",");
    }

    @Test
    void checkContentContentIsHello() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkContent("hello");
    }
}
