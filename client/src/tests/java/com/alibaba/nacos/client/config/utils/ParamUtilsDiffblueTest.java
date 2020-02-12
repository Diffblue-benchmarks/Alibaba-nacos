package com.alibaba.nacos.client.config.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.utils.ParamUtils
 *
 * @author Diffblue JCover
 */

public class ParamUtilsDiffblueTest {

    @Test(timeout=10000)
    public void checkBetaIps() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkBetaIps(",");
    }

    @Test(timeout=10000)
    public void checkContentContentIsName() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkContent("name");
    }

    @Test(timeout=10000)
    public void checkKeyParam() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkKeyParam("bar", "name");
    }

    @Test(timeout=10000)
    public void checkKeyParamDataIdsIsBar() throws com.alibaba.nacos.api.exception.NacosException {
        List<String> dataIds = new ArrayList<String>();
        ((ArrayList<String>)dataIds).add("bar");
        ParamUtils.checkKeyParam(dataIds, "name");
    }

    @Test(timeout=10000)
    public void checkKeyParamDatumIdIsNameAndGroupIsFoo() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkKeyParam("bar", "foo", "name");
    }

    @Test(timeout=10000)
    public void checkParam() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkParam("bar", "foo", "name");
    }

    @Test(timeout=10000)
    public void checkParamDatumIdIsName() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkParam("bar", "foo", "name", "name");
    }

    @Test(timeout=10000)
    public void checkTDGDataIdIsSomethingAndGroupIsNameAndTenantIsBar() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkTDG("bar", "something", "name");
    }

    @Test(timeout=10000)
    public void checkTenantTenantIsName() throws com.alibaba.nacos.api.exception.NacosException {
        ParamUtils.checkTenant("name");
    }

    @Test(timeout=10000)
    public void isValid() {
        assertThat(ParamUtils.isValid("name"), is(true));
        assertThat(ParamUtils.isValid(null), is(false));
    }
}
