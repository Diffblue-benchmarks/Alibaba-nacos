package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigAllInfo
 *
 * @author Diffblue Cover
 */

class ConfigAllInfoTest {

    @Test
    void factory() {
        ConfigAllInfo configAllInfo = new ConfigAllInfo();
        configAllInfo.setConfigTags("tag");
        configAllInfo.setCreateIp("bar");
        configAllInfo.setCreateTime(1L);
        configAllInfo.setCreateUser("John Smith");
        configAllInfo.setDesc("/some/path.html");
        configAllInfo.setEffect("/some/path.html");
        configAllInfo.setModifyTime(1L);
        configAllInfo.setSchema("/some/path.html");
        configAllInfo.setType("BASIC");
        configAllInfo.setUse("John Smith");
        configAllInfo.setAppName("Acme");
        configAllInfo.setTenant("/some/path.html");
        configAllInfo.setContent("hello");
        configAllInfo.setDataId("1234");
        configAllInfo.setGroup("/some/path.html");
        configAllInfo.setId(1L);
        configAllInfo.setMd5("/some/path.html");
        assertThat(configAllInfo.getConfigTags(), is("tag"));
        assertThat(configAllInfo.getCreateIp(), is("bar"));
        assertThat(configAllInfo.getCreateTime(), is(1L));
        assertThat(configAllInfo.getCreateUser(), is("John Smith"));
        assertThat(configAllInfo.getDesc(), is("/some/path.html"));
        assertThat(configAllInfo.getEffect(), is("/some/path.html"));
        assertThat(configAllInfo.getModifyTime(), is(1L));
        assertThat(configAllInfo.getSchema(), is("/some/path.html"));
        assertThat(configAllInfo.getType(), is("BASIC"));
        assertThat(configAllInfo.getUse(), is("John Smith"));
        assertThat(configAllInfo.getAppName(), is("Acme"));
        assertThat(configAllInfo.getTenant(), is("/some/path.html"));
        assertThat(configAllInfo.getContent(), is("hello"));
        assertThat(configAllInfo.getDataId(), is("1234"));
        assertThat(configAllInfo.getGroup(), is("/some/path.html"));
        assertThat(configAllInfo.getId(), is(1L));
        assertThat(configAllInfo.getMd5(), is("/some/path.html"));
    }

    @Test
    void equalsReturnsFalse() {
        assertThat(new ConfigAllInfo().equals(new Object()), is(false));
    }
}
