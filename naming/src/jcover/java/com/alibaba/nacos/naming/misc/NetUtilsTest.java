package com.alibaba.nacos.naming.misc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.misc.NetUtils
 *
 * @author Diffblue JCover
 */

public class NetUtilsTest {

    @Test(timeout=10000)
    public void getLocalAddress() {
        assertThat(NetUtils.getLocalAddress(), is("10.128.0.37"));
    }

    @Test(timeout=10000)
    public void localServer() {
        assertThat(NetUtils.localServer(), is("10.128.0.37:0"));
    }

    @Test(timeout=10000)
    public void num2ipIpIsOne() {
        assertThat(NetUtils.num2ip(1), is("0.0.0.1"));
    }
}
