package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import java.sql.Timestamp;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.SubInfo
 *
 * @author Diffblue JCover
 */

public class SubInfoDiffblueTest {

    @Test(timeout=10000)
    public void getAppNameReturnsNull() {
        assertThat(new SubInfo().getAppName(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getDataIdReturnsNull() {
        assertThat(new SubInfo().getDataId(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getGroupReturnsNull() {
        assertThat(new SubInfo().getGroup(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getLocalIpReturnsNull() {
        assertThat(new SubInfo().getLocalIp(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setAppName() {
        SubInfo subInfo = new SubInfo();
        subInfo.setAppName("/bin/bash");
        assertThat(subInfo.getAppName(), is("/bin/bash"));
    }

    @Test(timeout=10000)
    public void setDataIdToSomething() {
        SubInfo subInfo = new SubInfo();
        subInfo.setDataId("something");
        assertThat(subInfo.getDataId(), is("something"));
    }

    @Test(timeout=10000)
    public void setDate() {
        SubInfo subInfo = new SubInfo();
        subInfo.setDate(new Timestamp(1, 1, 1, 1, 1, 1, 1));
        assertThat(subInfo.getDate().getNanos(), is(0));
        assertThat(subInfo.getDate().getTime(), is(-2_174_770_739_000L));
        assertThat(subInfo.getDate().getDate(), is(1));
        assertThat(subInfo.getDate().getDay(), is(5));
        assertThat(subInfo.getDate().getHours(), is(1));
        assertThat(subInfo.getDate().getMinutes(), is(1));
        assertThat(subInfo.getDate().getMonth(), is(1));
        assertThat(subInfo.getDate().getSeconds(), is(1));
        assertThat(subInfo.getDate().getTimezoneOffset(), is(0));
        assertThat(subInfo.getDate().getYear(), is(1));
    }

    @Test(timeout=10000)
    public void setGroupToFoo() {
        SubInfo subInfo = new SubInfo();
        subInfo.setGroup("foo");
        assertThat(subInfo.getGroup(), is("foo"));
    }

    @Test(timeout=10000)
    public void setLocalIp() {
        SubInfo subInfo = new SubInfo();
        subInfo.setLocalIp("545321456");
        assertThat(subInfo.getLocalIp(), is("545321456"));
    }
}
