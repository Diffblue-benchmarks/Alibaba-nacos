package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.nacos.config.server.utils.SimpleReadWriteLock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.CacheItem
 *
 * @author Diffblue JCover
 */

public class CacheItemTest {

    @Test(timeout=10000)
    public void getGroupKeyReturnsFoo() {
        assertThat(new CacheItem("foo").getGroupKey(), is("foo"));
    }

    @Test(timeout=10000)
    public void getIps4BetaReturnsNull() {
        assertThat(new CacheItem("foo").getIps4Beta(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getLastModifiedTs4BetaReturnsZero() {
        assertThat(new CacheItem("foo").getLastModifiedTs4Beta(), is(0L));
    }

    @Test(timeout=10000)
    public void getLastModifiedTsReturnsZero() {
        assertThat(new CacheItem("foo").getLastModifiedTs(), is(0L));
    }

    @Test(timeout=10000)
    public void getMd54BetaReturnsEmpty() {
        assertThat(new CacheItem("foo").getMd54Beta(), is(""));
    }

    @Test(timeout=10000)
    public void getMd5ReturnsEmpty() {
        assertThat(new CacheItem("foo").getMd5(), is(""));
    }

    @Test(timeout=10000)
    public void getRwLock() {
        CacheItem cacheItem = new CacheItem("foo");
        SimpleReadWriteLock result = cacheItem.getRwLock();
        // pojo SimpleReadWriteLock
        assertThat(cacheItem.getRwLock(), sameInstance(result));
    }

    @Test(timeout=10000)
    public void getTagLastModifiedTsReturnsNull() {
        assertThat(new CacheItem("foo").getTagLastModifiedTs(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTagMd5ReturnsNull() {
        assertThat(new CacheItem("foo").getTagMd5(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void isBetaReturnsFalse() {
        assertThat(new CacheItem("foo").isBeta(), is(false));
    }

    @Test(timeout=10000)
    public void setBetaToFalse() {
        new CacheItem("foo").setBeta(false);
    }

    @Test(timeout=10000)
    public void setIps4BetaToEmpty() {
        CacheItem cacheItem = new CacheItem("foo");
        List<String> ips4Beta = new ArrayList<String>();
        cacheItem.setIps4Beta(ips4Beta);
        assertThat(cacheItem.getIps4Beta(), sameInstance(ips4Beta));
    }

    @Test(timeout=10000)
    public void setLastModifiedTs4BetaToOne() {
        CacheItem cacheItem = new CacheItem("foo");
        cacheItem.setLastModifiedTs4Beta(1L);
        assertThat(cacheItem.getLastModifiedTs4Beta(), is(1L));
    }

    @Test(timeout=10000)
    public void setLastModifiedTsToOne() {
        CacheItem cacheItem = new CacheItem("foo");
        cacheItem.setLastModifiedTs(1L);
        assertThat(cacheItem.getLastModifiedTs(), is(1L));
    }

    @Test(timeout=10000)
    public void setMd54BetaToFoo() {
        CacheItem cacheItem = new CacheItem("foo");
        cacheItem.setMd54Beta("foo");
        assertThat(cacheItem.getMd54Beta(), is("foo"));
    }

    @Test(timeout=10000)
    public void setMd5ToFoo() {
        CacheItem cacheItem = new CacheItem("foo");
        cacheItem.setMd5("foo");
        assertThat(cacheItem.getMd5(), is("foo"));
    }

    @Test(timeout=10000)
    public void setRwLock() {
        CacheItem cacheItem = new CacheItem("foo");
        SimpleReadWriteLock rwLock = new SimpleReadWriteLock();
        cacheItem.setRwLock(rwLock);
        assertThat(cacheItem.getRwLock(), sameInstance(rwLock));
    }

    @Test(timeout=10000)
    public void setTagLastModifiedTsToEmpty() {
        CacheItem cacheItem = new CacheItem("foo");
        Map<String, Long> tagLastModifiedTs = new HashMap<String, Long>();
        cacheItem.setTagLastModifiedTs(tagLastModifiedTs);
        assertThat(cacheItem.getTagLastModifiedTs(), sameInstance(tagLastModifiedTs));
    }

    @Test(timeout=10000)
    public void setTagMd5ToEmpty() {
        CacheItem cacheItem = new CacheItem("foo");
        Map<String, String> tagMd5 = new HashMap<String, String>();
        cacheItem.setTagMd5(tagMd5);
        assertThat(cacheItem.getTagMd5(), sameInstance(tagMd5));
    }
}
