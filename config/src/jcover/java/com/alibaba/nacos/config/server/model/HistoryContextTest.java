package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

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
        Page<ConfigHistoryInfo> configs2 = new Page<ConfigHistoryInfo>();
        configs2.setPageItems(new ArrayList<ConfigHistoryInfo>());
        configs2.setPageNumber(0);
        configs2.setPagesAvailable(1);
        configs2.setTotalCount(1);
        historyContext.setConfigs(configs2);
        historyContext.setDataId("1234");
        historyContext.setGroup("hello");
        historyContext.setServerId("1234");
        historyContext.setStatusCode(1);
        historyContext.setStatusMsg("New York");
        historyContext.setSuccess(false);
        historyContext.setTenant("hello");
        assertThat(historyContext.getAppName(), is("Acme"));
        assertThat(historyContext.getConfigs(), sameInstance(configs2));
        assertThat(historyContext.getDataId(), is("1234"));
        assertThat(historyContext.getGroup(), is("hello"));
        assertThat(historyContext.getServerId(), is("1234"));
        assertThat(historyContext.getStatusCode(), is(1));
        assertThat(historyContext.getStatusMsg(), is("New York"));
        assertThat(historyContext.getTenant(), is("hello"));
        assertThat(historyContext.isSuccess(), is(false));
    }

    @Test
    void factory2() {
        Page<ConfigHistoryInfo> configs1 = new Page<ConfigHistoryInfo>();
        configs1.setPageItems(new ArrayList<ConfigHistoryInfo>());
        configs1.setPageNumber(1);
        configs1.setPagesAvailable(1);
        configs1.setTotalCount(1);
        HistoryContext historyContext =
             new HistoryContext("1234", "1234", "hello", 0, "New York", configs1);
        historyContext.setAppName("Acme");
        Page<ConfigHistoryInfo> configs2 = new Page<ConfigHistoryInfo>();
        configs2.setPageItems(new ArrayList<ConfigHistoryInfo>());
        configs2.setPageNumber(1);
        configs2.setPagesAvailable(1);
        configs2.setTotalCount(1);
        historyContext.setConfigs(configs2);
        historyContext.setDataId("1234");
        historyContext.setGroup("hello");
        historyContext.setServerId("1234");
        historyContext.setStatusCode(1);
        historyContext.setStatusMsg("New York");
        historyContext.setSuccess(false);
        historyContext.setTenant("hello");
        assertThat(historyContext.getAppName(), is("Acme"));
        assertThat(historyContext.getConfigs(), sameInstance(configs2));
        assertThat(historyContext.getDataId(), is("1234"));
        assertThat(historyContext.getGroup(), is("hello"));
        assertThat(historyContext.getServerId(), is("1234"));
        assertThat(historyContext.getStatusCode(), is(1));
        assertThat(historyContext.getStatusMsg(), is("New York"));
        assertThat(historyContext.getTenant(), is("hello"));
        assertThat(historyContext.isSuccess(), is(false));
    }

    @Test
    void factory3() {
        Page<ConfigHistoryInfo> configs1 = new Page<ConfigHistoryInfo>();
        configs1.setPageItems(new ArrayList<ConfigHistoryInfo>());
        configs1.setPageNumber(1);
        configs1.setPagesAvailable(1);
        configs1.setTotalCount(1);
        HistoryContext historyContext =
             new HistoryContext("1234", "1234", "hello", 200, "New York", configs1);
        historyContext.setAppName("Acme");
        Page<ConfigHistoryInfo> configs2 = new Page<ConfigHistoryInfo>();
        configs2.setPageItems(new ArrayList<ConfigHistoryInfo>());
        configs2.setPageNumber(1);
        configs2.setPagesAvailable(1);
        configs2.setTotalCount(1);
        historyContext.setConfigs(configs2);
        historyContext.setDataId("1234");
        historyContext.setGroup("hello");
        historyContext.setServerId("1234");
        historyContext.setStatusCode(1);
        historyContext.setStatusMsg("New York");
        historyContext.setSuccess(false);
        historyContext.setTenant("hello");
        assertThat(historyContext.getAppName(), is("Acme"));
        assertThat(historyContext.getConfigs(), sameInstance(configs2));
        assertThat(historyContext.getDataId(), is("1234"));
        assertThat(historyContext.getGroup(), is("hello"));
        assertThat(historyContext.getServerId(), is("1234"));
        assertThat(historyContext.getStatusCode(), is(1));
        assertThat(historyContext.getStatusMsg(), is("New York"));
        assertThat(historyContext.getTenant(), is("hello"));
        assertThat(historyContext.isSuccess(), is(false));
    }
}
