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
        assertThat(ParamUtils.isValid("name"), is(true));
        assertThat(ParamUtils.isValid(null), is(false));
    }

    @Test
    void checkKeyParam() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkKeyParam("1234", "name");
    }

    @Test
    void checkTDGGroupIsNameAndTenantIsBar() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkTDG("bar", "1234", "name");
    }

    @Test
    void checkKeyParamDataIdIsBar() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkKeyParam("bar", "name", "1234");
    }

    @Test
    void checkKeyParamDataIdsIsBar() throws com.alibaba.nacos.api.exception.NacosException {
        ArrayList<String> dataIds = new ArrayList<String>();
        dataIds.add("bar");
        ParamUtils.checkKeyParam(dataIds, "name");
    }

    @Test
    void checkParam() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkParam("1234", "name", "hello");
    }

    @Test
    void checkParamDataIdIsBar() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkParam("bar", "name", "1234", "hello");
    }

    @Test
    void checkTenantTenantIsName() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkTenant("name");
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
