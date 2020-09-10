package com.alibaba.nacos.client.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.utils.IPUtil
 *
 * @author Diffblue Cover
 */

class IPUtilTest {

    @Test
    void isIPV1() {
        assertThat(IPUtil.isIPV4(""), is(false));
        assertThat(IPUtil.isIPV4("foo"), is(false));
        assertThat(IPUtil.isIPV4("250.250.250.250"), is(true));
    }

    @Test
    void isIPV2() {
        assertThat(IPUtil.isIPV6("foo"), is(false));
        assertThat(IPUtil.isIPV6("d:d:d:d:d:d:d:d"), is(true));
    }
}
