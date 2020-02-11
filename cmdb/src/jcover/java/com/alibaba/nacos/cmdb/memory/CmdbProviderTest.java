package com.alibaba.nacos.cmdb.memory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import com.alibaba.nacos.api.cmdb.pojo.Entity;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.cmdb.memory.CmdbProvider
 *
 * @author Diffblue JCover
 */

public class CmdbProviderTest {

    @Test(timeout=10000)
    public void queryEntityEntityNameIsBarAndEntityTypeIsGifReturnsNull() throws com.alibaba.nacos.api.exception.NacosException {
        assertThat(new CmdbProvider().queryEntity("bar", "gif"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void queryLabelEntityNameIsBarAndEntityTypeIsGifAndLabelNameIsFooReturnsNull() throws com.alibaba.nacos.api.exception.NacosException {
        assertThat(new CmdbProvider().queryLabel("bar", "gif", "foo"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void removeEntityEntityNameIsBarAndEntityTypeIsGif() throws com.alibaba.nacos.api.exception.NacosException {
        new CmdbProvider().removeEntity("bar", "gif");
    }

    @Test(timeout=10000)
    public void updateEntity() throws com.alibaba.nacos.api.exception.NacosException {
        new CmdbProvider().updateEntity(new Entity());
    }
}
