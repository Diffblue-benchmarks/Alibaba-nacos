package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigAdvanceInfo
 *
 * @author Diffblue JCover
 */

public class ConfigAdvanceInfoTest {

    @Test(timeout=10000)
    public void getConfigTagsReturnsNull() {
        assertThat(new ConfigAdvanceInfo().getConfigTags(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getCreateIpReturnsNull() {
        assertThat(new ConfigAdvanceInfo().getCreateIp(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getCreateTimeReturnsZero() {
        assertThat(new ConfigAdvanceInfo().getCreateTime(), is(0L));
    }

    @Test(timeout=10000)
    public void getCreateUserReturnsNull() {
        assertThat(new ConfigAdvanceInfo().getCreateUser(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getDescReturnsNull() {
        assertThat(new ConfigAdvanceInfo().getDesc(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getEffectReturnsNull() {
        assertThat(new ConfigAdvanceInfo().getEffect(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getModifyTimeReturnsZero() {
        assertThat(new ConfigAdvanceInfo().getModifyTime(), is(0L));
    }

    @Test(timeout=10000)
    public void getSchemaReturnsNull() {
        assertThat(new ConfigAdvanceInfo().getSchema(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTypeReturnsNull() {
        assertThat(new ConfigAdvanceInfo().getType(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getUseReturnsNull() {
        assertThat(new ConfigAdvanceInfo().getUse(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setConfigTagsToFoo() {
        ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();
        configAdvanceInfo.setConfigTags("foo");
        assertThat(configAdvanceInfo.getConfigTags(), is("foo"));
    }

    @Test(timeout=10000)
    public void setCreateIpToFoo() {
        ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();
        configAdvanceInfo.setCreateIp("foo");
        assertThat(configAdvanceInfo.getCreateIp(), is("foo"));
    }

    @Test(timeout=10000)
    public void setCreateTimeToOne() {
        ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();
        configAdvanceInfo.setCreateTime(1L);
        assertThat(configAdvanceInfo.getCreateTime(), is(1L));
    }

    @Test(timeout=10000)
    public void setCreateUserToFoo() {
        ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();
        configAdvanceInfo.setCreateUser("foo");
        assertThat(configAdvanceInfo.getCreateUser(), is("foo"));
    }

    @Test(timeout=10000)
    public void setDescToFoo() {
        ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();
        configAdvanceInfo.setDesc("foo");
        assertThat(configAdvanceInfo.getDesc(), is("foo"));
    }

    @Test(timeout=10000)
    public void setEffectToFoo() {
        ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();
        configAdvanceInfo.setEffect("foo");
        assertThat(configAdvanceInfo.getEffect(), is("foo"));
    }

    @Test(timeout=10000)
    public void setModifyTimeToOne() {
        ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();
        configAdvanceInfo.setModifyTime(1L);
        assertThat(configAdvanceInfo.getModifyTime(), is(1L));
    }

    @Test(timeout=10000)
    public void setSchemaToFoo() {
        ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();
        configAdvanceInfo.setSchema("foo");
        assertThat(configAdvanceInfo.getSchema(), is("foo"));
    }

    @Test(timeout=10000)
    public void setTypeToGif() {
        ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();
        configAdvanceInfo.setType("gif");
        assertThat(configAdvanceInfo.getType(), is("gif"));
    }

    @Test(timeout=10000)
    public void setUseToFoo() {
        ConfigAdvanceInfo configAdvanceInfo = new ConfigAdvanceInfo();
        configAdvanceInfo.setUse("foo");
        assertThat(configAdvanceInfo.getUse(), is("foo"));
    }
}
