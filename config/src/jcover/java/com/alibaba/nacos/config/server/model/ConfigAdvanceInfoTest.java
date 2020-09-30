package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigAdvanceInfo
 *
 * @author Diffblue Cover
 */

class ConfigAdvanceInfoTest {

    @Test
    void factory() {
        ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();
        configAdvanceInfo.setConfigTags("tag");
        configAdvanceInfo.setCreateIp("bar");
        configAdvanceInfo.setCreateTime(1L);
        configAdvanceInfo.setCreateUser("John Smith");
        configAdvanceInfo.setDesc("foo");
        configAdvanceInfo.setEffect("/some/path.html");
        configAdvanceInfo.setModifyTime(1L);
        configAdvanceInfo.setSchema("/some/path.html");
        configAdvanceInfo.setType("BASIC");
        configAdvanceInfo.setUse("John Smith");
        assertThat(configAdvanceInfo.getConfigTags(), is("tag"));
        assertThat(configAdvanceInfo.getCreateIp(), is("bar"));
        assertThat(configAdvanceInfo.getCreateTime(), is(1L));
        assertThat(configAdvanceInfo.getCreateUser(), is("John Smith"));
        assertThat(configAdvanceInfo.getDesc(), is("foo"));
        assertThat(configAdvanceInfo.getEffect(), is("/some/path.html"));
        assertThat(configAdvanceInfo.getModifyTime(), is(1L));
        assertThat(configAdvanceInfo.getSchema(), is("/some/path.html"));
        assertThat(configAdvanceInfo.getType(), is("BASIC"));
        assertThat(configAdvanceInfo.getUse(), is("John Smith"));
    }
}
