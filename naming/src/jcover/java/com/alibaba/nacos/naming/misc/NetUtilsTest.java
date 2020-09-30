package com.alibaba.nacos.naming.misc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.misc.NetUtils
 *
 * @author Diffblue Cover
 */

public class NetUtilsTest {

    @Test
    public void localServer() {
        assertThat(NetUtils.localServer(), is("10.128.0.86:0"));
    }

    @Test
    public void getLocalAddress() {
        assertThat(NetUtils.getLocalAddress(), is("10.128.0.86"));
    }

    @Test
    public void num2ipIpIsOne() {
        assertThat(NetUtils.num2ip(1), is("0.0.0.1"));
    }
}
