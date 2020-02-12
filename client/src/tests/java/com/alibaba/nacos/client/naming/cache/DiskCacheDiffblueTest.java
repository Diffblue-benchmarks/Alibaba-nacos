package com.alibaba.nacos.client.naming.cache;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.alibaba.nacos.api.naming.pojo.ServiceInfo;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.naming.cache.DiskCache
 *
 * @author Diffblue JCover
 */

public class DiskCacheDiffblueTest {

    @Test(timeout=10000)
    public void getLineSeparator() {
        assertThat(DiskCache.getLineSeparator(), is("\n"));
    }

    @Test(timeout=10000)
    public void isEmpty() {
        assertThat(DiskCache.read("N failed to read cache file").isEmpty(), is(true));
        assertThat(DiskCache.read("bar").isEmpty(), is(true));
        assertThat(DiskCache.read("").isEmpty(), is(true));
        assertThat(DiskCache.read("foo").isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void write1() {
        DiskCache.write(new ServiceInfo(), "foo");
    }

    @Test(timeout=10000)
    public void write2() {
        DiskCache.write(new ServiceInfo(""), "foo");
    }

    @Test(timeout=10000)
    public void write3() {
        DiskCache.write(new ServiceInfo("bar"), "foo");
    }
}
