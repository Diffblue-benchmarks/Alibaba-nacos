package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.ParamUtils
 *
 * @author Diffblue JCover
 */

public class ParamUtilsDiffblueTest {

    @Test(timeout=10000)
    public void checkParam1() throws com.alibaba.nacos.config.server.exception.NacosException {
        Map<String, Object> configAdvanceInfo = new HashMap<String, Object>();
        ((HashMap<String, Object>)configAdvanceInfo).put("config_tags", "foo");
        ParamUtils.checkParam(configAdvanceInfo);
    }

    @Test(timeout=10000)
    public void checkParam2() throws com.alibaba.nacos.config.server.exception.NacosException {
        Map<String, Object> configAdvanceInfo = new HashMap<String, Object>();
        ((HashMap<String, Object>)configAdvanceInfo).put("desc", "foo");
        ParamUtils.checkParam(configAdvanceInfo);
    }

    @Test(timeout=10000)
    public void checkParam3() throws com.alibaba.nacos.config.server.exception.NacosException {
        Map<String, Object> configAdvanceInfo = new HashMap<String, Object>();
        ((HashMap<String, Object>)configAdvanceInfo).put("effect", "foo");
        ParamUtils.checkParam(configAdvanceInfo);
    }

    @Test(timeout=10000)
    public void checkParam4() throws com.alibaba.nacos.config.server.exception.NacosException {
        Map<String, Object> configAdvanceInfo = new HashMap<String, Object>();
        ((HashMap<String, Object>)configAdvanceInfo).put("schema", "foo");
        ParamUtils.checkParam(configAdvanceInfo);
    }

    @Test(timeout=10000)
    public void checkParam5() throws com.alibaba.nacos.config.server.exception.NacosException {
        Map<String, Object> configAdvanceInfo = new HashMap<String, Object>();
        ((HashMap<String, Object>)configAdvanceInfo).put("type", "foo");
        ParamUtils.checkParam(configAdvanceInfo);
    }

    @Test(timeout=10000)
    public void checkParam6() throws com.alibaba.nacos.config.server.exception.NacosException {
        Map<String, Object> configAdvanceInfo = new HashMap<String, Object>();
        ((HashMap<String, Object>)configAdvanceInfo).put("use", "foo");
        ParamUtils.checkParam(configAdvanceInfo);
    }

    @Test(timeout=10000)
    public void checkParamConfigAdvanceInfoIsEmpty() throws com.alibaba.nacos.config.server.exception.NacosException {
        ParamUtils.checkParam(new HashMap<String, Object>());
    }

    @Test(timeout=10000)
    public void checkParamConfigAdvanceInfoIsNull1() throws com.alibaba.nacos.config.server.exception.NacosException {
        Map<String, Object> configAdvanceInfo = new HashMap<String, Object>();
        ((HashMap<String, Object>)configAdvanceInfo).put("config_tags", null);
        ParamUtils.checkParam(configAdvanceInfo);
    }

    @Test(timeout=10000)
    public void checkParamConfigAdvanceInfoIsNull2() throws com.alibaba.nacos.config.server.exception.NacosException {
        Map<String, Object> configAdvanceInfo = new HashMap<String, Object>();
        ((HashMap<String, Object>)configAdvanceInfo).put("desc", null);
        ParamUtils.checkParam(configAdvanceInfo);
    }

    @Test(timeout=10000)
    public void checkParamConfigAdvanceInfoIsNull3() throws com.alibaba.nacos.config.server.exception.NacosException {
        Map<String, Object> configAdvanceInfo = new HashMap<String, Object>();
        ((HashMap<String, Object>)configAdvanceInfo).put("effect", null);
        ParamUtils.checkParam(configAdvanceInfo);
    }

    @Test(timeout=10000)
    public void checkParamConfigAdvanceInfoIsNull4() throws com.alibaba.nacos.config.server.exception.NacosException {
        Map<String, Object> configAdvanceInfo = new HashMap<String, Object>();
        ((HashMap<String, Object>)configAdvanceInfo).put("schema", null);
        ParamUtils.checkParam(configAdvanceInfo);
    }

    @Test(timeout=10000)
    public void checkParamConfigAdvanceInfoIsNull5() throws com.alibaba.nacos.config.server.exception.NacosException {
        Map<String, Object> configAdvanceInfo = new HashMap<String, Object>();
        ((HashMap<String, Object>)configAdvanceInfo).put("type", null);
        ParamUtils.checkParam(configAdvanceInfo);
    }

    @Test(timeout=10000)
    public void checkParamConfigAdvanceInfoIsNull6() throws com.alibaba.nacos.config.server.exception.NacosException {
        Map<String, Object> configAdvanceInfo = new HashMap<String, Object>();
        ((HashMap<String, Object>)configAdvanceInfo).put("use", null);
        ParamUtils.checkParam(configAdvanceInfo);
    }

    @Test(timeout=10000)
    public void checkParamDataIdIsBarAndDatumIdIsNameAndGroupIsFoo() throws com.alibaba.nacos.config.server.exception.NacosException {
        ParamUtils.checkParam("bar", "foo", "name", "content is blank");
    }

    @Test(timeout=10000)
    public void checkParamTagIsEmpty() {
        ParamUtils.checkParam("");
    }

    @Test(timeout=10000)
    public void checkParamTagIsName() {
        ParamUtils.checkParam("name");
    }

    @Test(timeout=10000)
    public void checkTenantTenantIsEmpty() {
        ParamUtils.checkTenant("");
    }

    @Test(timeout=10000)
    public void checkTenantTenantIsName() {
        ParamUtils.checkTenant("name");
    }

    @Test(timeout=10000)
    public void isValid() {
        assertThat(ParamUtils.isValid("name"), is(true));
        assertThat(ParamUtils.isValid(null), is(false));
    }
}
