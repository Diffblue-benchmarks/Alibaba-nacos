package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigHistoryInfo
 *
 * @author Diffblue Cover
 */

class ConfigHistoryInfoTest {

    @Test
    void factory() {
        ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();
        configHistoryInfo.setAppName("Acme");
        configHistoryInfo.setContent("hello");
        configHistoryInfo.setCreatedTime(Timestamp.valueOf("2019-12-31 23:10:59"));
        configHistoryInfo.setDataId("1234");
        configHistoryInfo.setGroup("bar");
        configHistoryInfo.setId(1L);
        configHistoryInfo.setLastId(1L);
        configHistoryInfo.setLastModifiedTime(Timestamp.valueOf("2019-12-31 23:10:59"));
        configHistoryInfo.setMd5("foo");
        configHistoryInfo.setOpType("BASIC");
        configHistoryInfo.setSrcIp("/some/path.html");
        configHistoryInfo.setSrcUser("John Smith");
        configHistoryInfo.setTenant("/some/path.html");
        assertThat(configHistoryInfo.getAppName(), is("Acme"));
        assertThat(configHistoryInfo.getContent(), is("hello"));
        assertThat(configHistoryInfo.getDataId(), is("1234"));
        assertThat(configHistoryInfo.getGroup(), is("bar"));
        assertThat(configHistoryInfo.getId(), is(1L));
        assertThat(configHistoryInfo.getLastId(), is(1L));
        assertThat(configHistoryInfo.getMd5(), is("foo"));
        assertThat(configHistoryInfo.getOpType(), is("BASIC"));
        assertThat(configHistoryInfo.getSrcIp(), is("/some/path.html"));
        assertThat(configHistoryInfo.getSrcUser(), is("John Smith"));
        assertThat(configHistoryInfo.getTenant(), is("/some/path.html"));
    }

    @Test
    void getCreatedTime() {
        ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();
        configHistoryInfo.setCreatedTime(Timestamp.valueOf("2019-12-31 23:10:59"));
        assertThat(configHistoryInfo.getCreatedTime(), equalTo(Timestamp.valueOf("2019-12-31 23:10:59.0")));
    }

    @Test
    void getLastModifiedTime() {
        ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();
        configHistoryInfo.setLastModifiedTime(Timestamp.valueOf("2019-12-31 23:10:59"));
        assertThat(configHistoryInfo.getLastModifiedTime(), equalTo(Timestamp.valueOf("2019-12-31 23:10:59.0")));
    }
}
