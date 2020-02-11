package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import java.sql.Timestamp;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigHistoryInfo
 *
 * @author Diffblue JCover
 */

public class ConfigHistoryInfoTest {

    @Test(timeout=10000)
    public void getAppNameReturnsNull() {
        assertThat(new ConfigHistoryInfo().getAppName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getContentReturnsNull() {
        assertThat(new ConfigHistoryInfo().getContent(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getDataIdReturnsNull() {
        assertThat(new ConfigHistoryInfo().getDataId(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getGroupReturnsNull() {
        assertThat(new ConfigHistoryInfo().getGroup(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getIdReturnsZero() {
        assertThat(new ConfigHistoryInfo().getId(), is(0L));
    }

    @Test(timeout=10000)
    public void getLastIdReturnsMinusOne() {
        assertThat(new ConfigHistoryInfo().getLastId(), is(-1L));
    }

    @Test(timeout=10000)
    public void getMd5ReturnsNull() {
        assertThat(new ConfigHistoryInfo().getMd5(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getOpTypeReturnsNull() {
        assertThat(new ConfigHistoryInfo().getOpType(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getSrcIpReturnsNull() {
        assertThat(new ConfigHistoryInfo().getSrcIp(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getSrcUserReturnsNull() {
        assertThat(new ConfigHistoryInfo().getSrcUser(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getTenantReturnsNull() {
        assertThat(new ConfigHistoryInfo().getTenant(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setAppName() {
        ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();
        configHistoryInfo.setAppName("/bin/bash");
        assertThat(configHistoryInfo.getAppName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setContentToFoo() {
        ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();
        configHistoryInfo.setContent("foo");
        assertThat(configHistoryInfo.getContent(), is("foo"));
    }

    @Test(timeout=10000)
    public void setCreatedTime() {
        ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();
        configHistoryInfo.setCreatedTime(new Timestamp(1, 1, 1, 1, 1, 1, 1));
        assertThat(configHistoryInfo.getCreatedTime().getNanos(), is(0));
        assertThat(configHistoryInfo.getCreatedTime().getTime(), is(-2_174_770_739_000L));
        assertThat(configHistoryInfo.getCreatedTime().getDate(), is(1));
        assertThat(configHistoryInfo.getCreatedTime().getDay(), is(5));
        assertThat(configHistoryInfo.getCreatedTime().getHours(), is(1));
        assertThat(configHistoryInfo.getCreatedTime().getMinutes(), is(1));
        assertThat(configHistoryInfo.getCreatedTime().getMonth(), is(1));
        assertThat(configHistoryInfo.getCreatedTime().getSeconds(), is(1));
        assertThat(configHistoryInfo.getCreatedTime().getTimezoneOffset(), is(0));
        assertThat(configHistoryInfo.getCreatedTime().getYear(), is(1));
    }

    @Test(timeout=10000)
    public void setDataIdToSomething() {
        ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();
        configHistoryInfo.setDataId("something");
        assertThat(configHistoryInfo.getDataId(), is("something"));
    }

    @Test(timeout=10000)
    public void setGroupToFoo() {
        ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();
        configHistoryInfo.setGroup("foo");
        assertThat(configHistoryInfo.getGroup(), is("foo"));
    }

    @Test(timeout=10000)
    public void setIdToOne() {
        ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();
        configHistoryInfo.setId(1L);
        assertThat(configHistoryInfo.getId(), is(1L));
    }

    @Test(timeout=10000)
    public void setLastIdToOne() {
        ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();
        configHistoryInfo.setLastId(1L);
        assertThat(configHistoryInfo.getLastId(), is(1L));
    }

    @Test(timeout=10000)
    public void setLastModifiedTime() {
        ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();
        configHistoryInfo.setLastModifiedTime(new Timestamp(1, 1, 1, 1, 1, 1, 1));
        assertThat(configHistoryInfo.getLastModifiedTime().getNanos(), is(0));
        assertThat(configHistoryInfo.getLastModifiedTime().getTime(), is(-2_174_770_739_000L));
        assertThat(configHistoryInfo.getLastModifiedTime().getDate(), is(1));
        assertThat(configHistoryInfo.getLastModifiedTime().getDay(), is(5));
        assertThat(configHistoryInfo.getLastModifiedTime().getHours(), is(1));
        assertThat(configHistoryInfo.getLastModifiedTime().getMinutes(), is(1));
        assertThat(configHistoryInfo.getLastModifiedTime().getMonth(), is(1));
        assertThat(configHistoryInfo.getLastModifiedTime().getSeconds(), is(1));
        assertThat(configHistoryInfo.getLastModifiedTime().getTimezoneOffset(), is(0));
        assertThat(configHistoryInfo.getLastModifiedTime().getYear(), is(1));
    }

    @Test(timeout=10000)
    public void setMd5ToFoo() {
        ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();
        configHistoryInfo.setMd5("foo");
        assertThat(configHistoryInfo.getMd5(), is("foo"));
    }

    @Test(timeout=10000)
    public void setOpTypeToGif() {
        ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();
        configHistoryInfo.setOpType("gif");
        assertThat(configHistoryInfo.getOpType(), is("gif"));
    }

    @Test(timeout=10000)
    public void setSrcIpToFoo() {
        ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();
        configHistoryInfo.setSrcIp("foo");
        assertThat(configHistoryInfo.getSrcIp(), is("foo"));
    }

    @Test(timeout=10000)
    public void setSrcUserToFoo() {
        ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();
        configHistoryInfo.setSrcUser("foo");
        assertThat(configHistoryInfo.getSrcUser(), is("foo"));
    }

    @Test(timeout=10000)
    public void setTenantToFoo() {
        ConfigHistoryInfo configHistoryInfo = new ConfigHistoryInfo();
        configHistoryInfo.setTenant("foo");
        assertThat(configHistoryInfo.getTenant(), is("foo"));
    }
}
