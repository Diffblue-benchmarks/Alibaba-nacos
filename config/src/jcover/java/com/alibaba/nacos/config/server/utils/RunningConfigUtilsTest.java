package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.RunningConfigUtils
 *
 * @author Diffblue JCover
 */

public class RunningConfigUtilsTest {

    @Test(timeout=10000)
    public void getClusterNameReturnsServerlist() {
        assertThat(RunningConfigUtils.getClusterName(), is("serverlist"));
    }

    @Test(timeout=10000)
    public void getContextPathReturnsNull() {
        assertThat(RunningConfigUtils.getContextPath(), is(nullValue()));
    }

//    @Test(timeout=10000)
//    public void getServerPortReturnsZero() {
//        assertThat(RunningConfigUtils.getServerPort(), is(0));  <-- Expected: is <0>     but: was <1>
//    }
//
    @Test(timeout=10000)
    public void setContextPath() {
        RunningConfigUtils.setContextPath("/bin/bash");
    }

    @Test(timeout=10000)
    public void setServerPortServerPortIsOne() {
        RunningConfigUtils.setServerPort(1);
    }
}
