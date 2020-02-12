package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigAllInfo
 *
 * @author Diffblue JCover
 */

public class ConfigAllInfoDiffblueTest {

    @Test(timeout=10000)
    public void equalsObjIsFooReturnsFalse() {
        assertThat(new ConfigAllInfo().equals("foo"), is(false));
    }

    @Test(timeout=10000)
    public void getConfigTagsReturnsNull() {
        assertThat(new ConfigAllInfo().getConfigTags(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getCreateIpReturnsNull() {
        assertThat(new ConfigAllInfo().getCreateIp(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getCreateTimeReturnsZero() {
        assertThat(new ConfigAllInfo().getCreateTime(), is(0L));
    }

    @Test(timeout=10000)
    public void getCreateUserReturnsNull() {
        assertThat(new ConfigAllInfo().getCreateUser(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getDescReturnsNull() {
        assertThat(new ConfigAllInfo().getDesc(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getEffectReturnsNull() {
        assertThat(new ConfigAllInfo().getEffect(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getModifyTimeReturnsZero() {
        assertThat(new ConfigAllInfo().getModifyTime(), is(0L));
    }

    @Test(timeout=10000)
    public void getSchemaReturnsNull() {
        assertThat(new ConfigAllInfo().getSchema(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTypeReturnsNull() {
        assertThat(new ConfigAllInfo().getType(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getUseReturnsNull() {
        assertThat(new ConfigAllInfo().getUse(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setConfigTagsToFoo() {
        ConfigAllInfo configAllInfo = new ConfigAllInfo();
        configAllInfo.setConfigTags("foo");
        assertThat(configAllInfo.getConfigTags(), is("foo"));
    }

    @Test(timeout=10000)
    public void setCreateIpToFoo() {
        ConfigAllInfo configAllInfo = new ConfigAllInfo();
        configAllInfo.setCreateIp("foo");
        assertThat(configAllInfo.getCreateIp(), is("foo"));
    }

    @Test(timeout=10000)
    public void setCreateTimeToOne() {
        ConfigAllInfo configAllInfo = new ConfigAllInfo();
        configAllInfo.setCreateTime(1L);
        assertThat(configAllInfo.getCreateTime(), is(1L));
    }

    @Test(timeout=10000)
    public void setCreateUserToFoo() {
        ConfigAllInfo configAllInfo = new ConfigAllInfo();
        configAllInfo.setCreateUser("foo");
        assertThat(configAllInfo.getCreateUser(), is("foo"));
    }

    @Test(timeout=10000)
    public void setDescToFoo() {
        ConfigAllInfo configAllInfo = new ConfigAllInfo();
        configAllInfo.setDesc("foo");
        assertThat(configAllInfo.getDesc(), is("foo"));
    }

    @Test(timeout=10000)
    public void setEffectToFoo() {
        ConfigAllInfo configAllInfo = new ConfigAllInfo();
        configAllInfo.setEffect("foo");
        assertThat(configAllInfo.getEffect(), is("foo"));
    }

    @Test(timeout=10000)
    public void setModifyTimeToOne() {
        ConfigAllInfo configAllInfo = new ConfigAllInfo();
        configAllInfo.setModifyTime(1L);
        assertThat(configAllInfo.getModifyTime(), is(1L));
    }

    @Test(timeout=10000)
    public void setSchemaToFoo() {
        ConfigAllInfo configAllInfo = new ConfigAllInfo();
        configAllInfo.setSchema("foo");
        assertThat(configAllInfo.getSchema(), is("foo"));
    }

    @Test(timeout=10000)
    public void setTypeToGif() {
        ConfigAllInfo configAllInfo = new ConfigAllInfo();
        configAllInfo.setType("gif");
        assertThat(configAllInfo.getType(), is("gif"));
    }

    @Test(timeout=10000)
    public void setUseToFoo() {
        ConfigAllInfo configAllInfo = new ConfigAllInfo();
        configAllInfo.setUse("foo");
        assertThat(configAllInfo.getUse(), is("foo"));
    }
}
