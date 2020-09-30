package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.HistoryContext
 *
 * @author Diffblue Cover
 */

class HistoryContextTest {

    @Test
    void factory1() {
        HistoryContext historyContext = new HistoryContext();
        historyContext.setAppName("Acme");
        @SuppressWarnings("unchecked")
        Page<ConfigHistoryInfo> configs = mock(Page.class);
        historyContext.setConfigs(configs);
        historyContext.setDataId("1234");
        historyContext.setGroup("hello");
        historyContext.setServerId("1234");
        historyContext.setStatusCode(1);
        historyContext.setStatusMsg("on time");
        historyContext.setSuccess(false);
        historyContext.setTenant("hello");
        assertThat(historyContext.getAppName(), is("Acme"));
        assertThat(historyContext.getConfigs(), sameInstance(configs));
        assertThat(historyContext.getDataId(), is("1234"));
        assertThat(historyContext.getGroup(), is("hello"));
        assertThat(historyContext.getServerId(), is("1234"));
        assertThat(historyContext.getStatusCode(), is(1));
        assertThat(historyContext.getStatusMsg(), is("on time"));
        assertThat(historyContext.getTenant(), is("hello"));
        assertThat(historyContext.isSuccess(), is(false));
    }

    @Test
    void factory2() {
        Page<ConfigHistoryInfo> configs1 = new Page<ConfigHistoryInfo>();
        ArrayList<ConfigHistoryInfo> pageItems1 =
             new ArrayList<ConfigHistoryInfo>();
        ConfigHistoryInfo configHistoryInfo1 = new ConfigHistoryInfo();
        configHistoryInfo1.setAppName("Acme");
        configHistoryInfo1.setContent("hello");
        configHistoryInfo1.setCreatedTime(Timestamp.valueOf("2019-12-31 23:10:59"));
        configHistoryInfo1.setDataId("1234");
        configHistoryInfo1.setGroup("/some/path.html");
        configHistoryInfo1.setId(1L);
        configHistoryInfo1.setLastId(1L);
        configHistoryInfo1.setLastModifiedTime(Timestamp.valueOf("2019-12-31 23:10:59"));
        configHistoryInfo1.setMd5("/some/path.html");
        configHistoryInfo1.setOpType("BASIC");
        configHistoryInfo1.setSrcIp("/some/path.html");
        configHistoryInfo1.setSrcUser("John Smith");
        configHistoryInfo1.setTenant("/some/path.html");
        pageItems1.add(configHistoryInfo1);
        configs1.setPageItems(pageItems1);
        configs1.setPageNumber(1);
        configs1.setPagesAvailable(1);
        configs1.setTotalCount(1);
        HistoryContext historyContext =
             new HistoryContext("1234", "1234", "hello", 200, "on time", configs1);
        historyContext.setAppName("Acme");
        Page<ConfigHistoryInfo> configs2 = new Page<ConfigHistoryInfo>();
        ArrayList<ConfigHistoryInfo> pageItems2 =
             new ArrayList<ConfigHistoryInfo>();
        ConfigHistoryInfo configHistoryInfo2 = new ConfigHistoryInfo();
        configHistoryInfo2.setAppName("Acme");
        configHistoryInfo2.setContent("hello");
        configHistoryInfo2.setCreatedTime(Timestamp.valueOf("2019-12-31 23:10:59"));
        configHistoryInfo2.setDataId("1234");
        configHistoryInfo2.setGroup("/some/path.html");
        configHistoryInfo2.setId(1L);
        configHistoryInfo2.setLastId(1L);
        configHistoryInfo2.setLastModifiedTime(Timestamp.valueOf("2019-12-31 23:10:59"));
        configHistoryInfo2.setMd5("/some/path.html");
        configHistoryInfo2.setOpType("BASIC");
        configHistoryInfo2.setSrcIp("/some/path.html");
        configHistoryInfo2.setSrcUser("John Smith");
        configHistoryInfo2.setTenant("/some/path.html");
        pageItems2.add(configHistoryInfo2);
        configs2.setPageItems(pageItems2);
        configs2.setPageNumber(1);
        configs2.setPagesAvailable(1);
        configs2.setTotalCount(1);
        historyContext.setConfigs(configs2);
        historyContext.setDataId("1234");
        historyContext.setGroup("hello");
        historyContext.setServerId("1234");
        historyContext.setStatusCode(1);
        historyContext.setStatusMsg("on time");
        historyContext.setSuccess(false);
        historyContext.setTenant("hello");
        assertThat(historyContext.getAppName(), is("Acme"));
        assertThat(historyContext.getConfigs(), sameInstance(configs2));
        assertThat(historyContext.getDataId(), is("1234"));
        assertThat(historyContext.getGroup(), is("hello"));
        assertThat(historyContext.getServerId(), is("1234"));
        assertThat(historyContext.getStatusCode(), is(1));
        assertThat(historyContext.getStatusMsg(), is("on time"));
        assertThat(historyContext.getTenant(), is("hello"));
        assertThat(historyContext.isSuccess(), is(false));
    }

    @Test
    void factory3() {
        @SuppressWarnings("unchecked")
        Page<ConfigHistoryInfo> configs1 = mock(Page.class);
        HistoryContext historyContext =
             new HistoryContext("1234", "1234", "hello", 1, "on time", configs1);
        historyContext.setAppName("Acme");
        Page<ConfigHistoryInfo> configs2 = new Page<ConfigHistoryInfo>();
        ArrayList<ConfigHistoryInfo> pageItems =
             new ArrayList<ConfigHistoryInfo>();
        ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();
        configHistoryInfo.setAppName("Acme");
        configHistoryInfo.setContent("hello");
        configHistoryInfo.setCreatedTime(Timestamp.valueOf("2019-12-31 23:10:59"));
        configHistoryInfo.setDataId("1234");
        configHistoryInfo.setGroup("/some/path.html");
        configHistoryInfo.setId(1L);
        configHistoryInfo.setLastId(1L);
        configHistoryInfo.setLastModifiedTime(Timestamp.valueOf("2019-12-31 23:10:59"));
        configHistoryInfo.setMd5("/some/path.html");
        configHistoryInfo.setOpType("BASIC");
        configHistoryInfo.setSrcIp("/some/path.html");
        configHistoryInfo.setSrcUser("John Smith");
        configHistoryInfo.setTenant("/some/path.html");
        pageItems.add(configHistoryInfo);
        configs2.setPageItems(pageItems);
        configs2.setPageNumber(1);
        configs2.setPagesAvailable(1);
        configs2.setTotalCount(1);
        historyContext.setConfigs(configs2);
        historyContext.setDataId("1234");
        historyContext.setGroup("hello");
        historyContext.setServerId("1234");
        historyContext.setStatusCode(1);
        historyContext.setStatusMsg("on time");
        historyContext.setSuccess(false);
        historyContext.setTenant("hello");
        assertThat(historyContext.getAppName(), is("Acme"));
        assertThat(historyContext.getConfigs(), sameInstance(configs2));
        assertThat(historyContext.getDataId(), is("1234"));
        assertThat(historyContext.getGroup(), is("hello"));
        assertThat(historyContext.getServerId(), is("1234"));
        assertThat(historyContext.getStatusCode(), is(1));
        assertThat(historyContext.getStatusMsg(), is("on time"));
        assertThat(historyContext.getTenant(), is("hello"));
        assertThat(historyContext.isSuccess(), is(false));
    }
}
