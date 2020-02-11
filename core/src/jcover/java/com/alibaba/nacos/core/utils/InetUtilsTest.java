package com.alibaba.nacos.core.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.net.InetAddress;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.core.utils.InetUtils
 *
 * @author Diffblue JCover
 */

public class InetUtilsTest {

    @Test(timeout=10000)
    public void findFirstNonLoopbackAddress() {
        assertThat(InetUtils.findFirstNonLoopbackAddress().getHostAddress(), is("10.128.0.37"));
    }

    @Test(timeout=10000)
    public void getSelfIp() {
        assertThat(InetUtils.getSelfIp(), is("10.128.0.37"));
    }

    @Test(timeout=10000)
    public void ignoreInterfaceReturnsFalse() {
        assertThat(InetUtils.ignoreInterface("252001"), is(false));
    }

    @Test(timeout=10000)
    public void isIPReturnsFalse() {
        assertThat(InetUtils.isIP("OX13QD"), is(false));
    }

    @Test(timeout=10000)
    public void isPreferredAddressReturnsTrue() throws java.net.UnknownHostException {
        assertThat(InetUtils.isPreferredAddress(InetAddress.getByName("0.0.0.0")), is(true));
    }

    @Test(timeout=10000)
    public void match() {
        assertThat(InetUtils.match("252001", "OX13QD"), is(false));
        assertThat(InetUtils.match("[A-Z]*", ""), is(true));
    }
}
