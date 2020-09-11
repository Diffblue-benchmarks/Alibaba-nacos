package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.nacos.config.server.utils.SimpleReadWriteLock;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.CacheItem
 *
 * @author Diffblue Cover
 */

class CacheItemTest {

    @Test
    void factory() {
        CacheItem cacheItem = new CacheItem("key");
        cacheItem.setBeta(false);
        cacheItem.setIps4Beta(new ArrayList<String>());
        cacheItem.setLastModifiedTs(1L);
        cacheItem.setLastModifiedTs4Beta(1L);
        cacheItem.setMd5("/some/path.html");
        cacheItem.setMd54Beta("/some/path.html");
        SimpleReadWriteLock rwLock = new SimpleReadWriteLock();
        cacheItem.setRwLock(rwLock);
        HashMap<String, Long> tagLastModifiedTs = new HashMap<String, Long>();
        tagLastModifiedTs.put("HmacMD5", 1L);
        cacheItem.setTagLastModifiedTs(tagLastModifiedTs);
        HashMap<String, String> tagMd5 = new HashMap<String, String>();
        tagMd5.put("foo", "foo");
        cacheItem.setTagMd5(tagMd5);
        assertThat(cacheItem.getGroupKey(), is("key"));
        assertThat(cacheItem.getIps4Beta(), empty());
        assertThat(cacheItem.getLastModifiedTs(), is(1L));
        assertThat(cacheItem.getLastModifiedTs4Beta(), is(1L));
        assertThat(cacheItem.getMd5(), is("/some/path.html"));
        assertThat(cacheItem.getMd54Beta(), is("/some/path.html"));
        assertThat(cacheItem.getRwLock(), sameInstance(rwLock));
        assertThat(cacheItem.getTagLastModifiedTs().get("HmacMD5"), is(1L));
        assertThat(cacheItem.getTagMd5().get("foo"), is("foo"));
        assertThat(cacheItem.isBeta(), is(false));
    }
}
