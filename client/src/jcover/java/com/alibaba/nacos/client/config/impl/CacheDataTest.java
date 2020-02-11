package com.alibaba.nacos.client.config.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.client.config.filter.impl.ConfigFilterChainManager;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.impl.CacheData
 *
 * @author Diffblue JCover
 */

public class CacheDataTest {

    @Test(timeout=10000)
    public void addListener1() {
        CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "CacheData ", "something", "something", "something");
        Listener listener = mock(Listener.class);
        cacheData.addListener(listener);
        assertThat(cacheData.getListeners().size(), is(1));
        assertThat(cacheData.getListeners().get(0), sameInstance(listener));
    }

    @Test(timeout=10000)
    public void addListener2() {
        CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "CacheData ", "bar", "something");
        Listener listener = mock(Listener.class);
        cacheData.addListener(listener);
        assertThat(cacheData.getListeners().size(), is(1));
        assertThat(cacheData.getListeners().get(0), sameInstance(listener));
    }

    @Test(timeout=10000)
    public void checkListenerMd5() {
        new CacheData(new ConfigFilterChainManager(), "CacheData ", "bar", "something").checkListenerMd5();
    }

    @Test(timeout=10000)
    public void equalsReturnsFalse() {
        assertThat(new CacheData(new ConfigFilterChainManager(), "CacheData ", "bar", "something").equals(new Object()), is(false));
    }

    @Test(timeout=10000)
    public void getContentReturnsNull() {
        assertThat(new CacheData(new ConfigFilterChainManager(), "CacheData ", "something", "something").getContent(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getListenersReturnsEmpty() {
        assertTrue(new CacheData(new ConfigFilterChainManager(), "CacheData ", "something", "something").getListeners().isEmpty());
    }

    @Test(timeout=10000)
    public void getLocalConfigInfoVersionReturnsZero() {
        assertThat(new CacheData(new ConfigFilterChainManager(), "CacheData ", "something", "something").getLocalConfigInfoVersion(), is(0L));
    }

    @Test(timeout=10000)
    public void getMd5ReturnsEmpty() {
        assertThat(new CacheData(new ConfigFilterChainManager(), "CacheData ", "something", "something").getMd5(), is(""));
    }

    @Test(timeout=10000)
    public void getMd5StringConfigIsSomething() {
        assertThat(CacheData.getMd5String("something"), is("437b930db84b8079c2dd804a71936b5f"));
    }

    @Test(timeout=10000)
    public void getTaskIdReturnsZero() {
        assertThat(new CacheData(new ConfigFilterChainManager(), "CacheData ", "something", "something").getTaskId(), is(0));
    }

    @Test(timeout=10000)
    public void getTenantReturnsEmpty() {
        assertThat(new CacheData(new ConfigFilterChainManager(), "CacheData ", "something", "something").getTenant(), is(""));
    }

    @Test(timeout=10000)
    public void isInitializingReturnsTrue() {
        assertThat(new CacheData(new ConfigFilterChainManager(), "CacheData ", "something", "something").isInitializing(), is(true));
    }

    @Test(timeout=10000)
    public void isUseLocalConfigInfoReturnsFalse() {
        assertThat(new CacheData(new ConfigFilterChainManager(), "CacheData ", "something", "something").isUseLocalConfigInfo(), is(false));
    }

    @Test(timeout=10000)
    public void removeListener() {
        Listener listener = mock(Listener.class);
        new CacheData(new ConfigFilterChainManager(), "CacheData ", "something", "something").removeListener(listener);
    }

    @Test(timeout=10000)
    public void setContentToSomething() {
        CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "CacheData ", "something", "something");
        cacheData.setContent("something");
        assertThat(cacheData.getContent(), is("something"));
        assertThat(cacheData.getMd5(), is("437b930db84b8079c2dd804a71936b5f"));
    }

    @Test(timeout=10000)
    public void setInitializingToFalse() {
        CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "CacheData ", "something", "something");
        cacheData.setInitializing(false);
        assertThat(cacheData.isInitializing(), is(false));
    }

    @Test(timeout=10000)
    public void setLocalConfigInfoVersionToOne() {
        CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "CacheData ", "something", "something");
        cacheData.setLocalConfigInfoVersion(1L);
        assertThat(cacheData.getLocalConfigInfoVersion(), is(1L));
    }

    @Test(timeout=10000)
    public void setTaskIdToOne() {
        CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "CacheData ", "something", "something");
        cacheData.setTaskId(1);
        assertThat(cacheData.getTaskId(), is(1));
    }

    @Test(timeout=10000)
    public void setUseLocalConfigInfoToFalse() {
        CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "CacheData ", "something", "something");
        cacheData.setUseLocalConfigInfo(false);
        assertThat(cacheData.getLocalConfigInfoVersion(), is(-1L));
    }

    @Test(timeout=10000)
    public void setUseLocalConfigInfoToTrue() {
        CacheData cacheData = new CacheData(new ConfigFilterChainManager(), "/bin/bash", "something", "something");
        cacheData.setUseLocalConfigInfo(true);
        assertThat(cacheData.isUseLocalConfigInfo(), is(true));
    }
}
