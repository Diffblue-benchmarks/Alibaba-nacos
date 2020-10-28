package com.alibaba.nacos.core.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.net.InetAddress;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.core.utils.InetUtils
 *
 * @author Diffblue Cover
 */

class InetUtilsTest {

    @Test
    void getSelfIp() {
        assertThat(InetUtils.getSelfIp(), is("10.1.0.4"));
    }

    @Test
    void findFirstNonLoopbackAddress() {
        assertThat(InetUtils.findFirstNonLoopbackAddress().getHostAddress(), is("10.1.0.4"));
    }

    @Test
    void isPreferredAddressReturnsTrue() throws java.net.UnknownHostException {
        assertThat(InetUtils.isPreferredAddress(InetAddress.getByName("0.0.0.0")), is(true));
    }

    @Test
    void ignoreInterfaceInterfaceNameIsAcmeReturnsFalse() {
        assertThat(InetUtils.ignoreInterface("Acme"), is(false));
    }

    @Test
    void isIPStrIsDEReturnsFalse() {
        assertThat(InetUtils.isIP("DE"), is(false));
    }

    @Test
    void match() {
        assertThat(InetUtils.match("250", "DE"), is(false));
        assertThat(InetUtils.match("[A-Z]*", "DE"), is(true));
    }
}
