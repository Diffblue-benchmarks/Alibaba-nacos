package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.HistoryContext
 *
 * @author Diffblue JCover
 */

public class HistoryContextTest {

    @Test(timeout=10000)
    public void getAppNameReturnsNull() {
        assertThat(new HistoryContext().getAppName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getConfigsReturnsNull() {
        assertThat(new HistoryContext().getConfigs(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getDataIdReturnsNull() {
        assertThat(new HistoryContext().getDataId(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getGroupReturnsNull() {
        assertThat(new HistoryContext().getGroup(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getServerIdReturnsNull() {
        assertThat(new HistoryContext().getServerId(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getStatusCode() {
        assertThat(new HistoryContext("bar", "something", "foo", 1, "New York", new Page<ConfigHistoryInfo>()).getStatusCode(), is(1));
        assertThat(new HistoryContext().getStatusCode(), is(0));
    }

    @Test(timeout=10000)
    public void getStatusMsgReturnsNull() {
        assertThat(new HistoryContext().getStatusMsg(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTenantReturnsNull() {
        assertThat(new HistoryContext().getTenant(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void isSuccess() {
        assertThat(new HistoryContext().isSuccess(), is(false));
        assertThat(new HistoryContext("foo", "something", "foo", 200, "New York", new Page<ConfigHistoryInfo>()).isSuccess(), is(true));
    }

    @Test(timeout=10000)
    public void setAppName() {
        HistoryContext historyContext = new HistoryContext();
        historyContext.setAppName("/bin/bash");
        assertThat(historyContext.getAppName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setConfigs() {
        HistoryContext historyContext = new HistoryContext();
        Page<ConfigHistoryInfo> configs2 = new Page<ConfigHistoryInfo>();
        historyContext.setConfigs(configs2);
        assertThat(historyContext.getConfigs(), sameInstance(configs2));
    }

    @Test(timeout=10000)
    public void setDataIdToSomething() {
        HistoryContext historyContext = new HistoryContext();
        historyContext.setDataId("something");
        assertThat(historyContext.getDataId(), is("something"));
    }

    @Test(timeout=10000)
    public void setGroupToFoo() {
        HistoryContext historyContext = new HistoryContext();
        historyContext.setGroup("foo");
        assertThat(historyContext.getGroup(), is("foo"));
    }

    @Test(timeout=10000)
    public void setServerIdToFoo() {
        HistoryContext historyContext = new HistoryContext();
        historyContext.setServerId("foo");
        assertThat(historyContext.getServerId(), is("foo"));
    }

    @Test(timeout=10000)
    public void setStatusCodeToOne() {
        HistoryContext historyContext = new HistoryContext();
        historyContext.setStatusCode(1);
        assertThat(historyContext.getStatusCode(), is(1));
    }

    @Test(timeout=10000)
    public void setStatusMsg() {
        HistoryContext historyContext = new HistoryContext();
        historyContext.setStatusMsg("New York");
        assertThat(historyContext.getStatusMsg(), is("New York"));
    }

    @Test(timeout=10000)
    public void setSuccessToFalse() {
        new HistoryContext().setSuccess(false);
    }

    @Test(timeout=10000)
    public void setTenantToFoo() {
        HistoryContext historyContext = new HistoryContext();
        historyContext.setTenant("foo");
        assertThat(historyContext.getTenant(), is("foo"));
    }
}
