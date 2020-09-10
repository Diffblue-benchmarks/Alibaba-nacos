package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.IPUtil
 *
 * @author Diffblue Cover
 */

class IPUtilTest {

    @Test
    void isIPV1() {
        assertThat(IPUtil.isIPV4("bar"), is(false));
        assertThat(IPUtil.isIPV4("250.250.250.250"), is(true));
    }

    @Test
    void isIPV2() {
        assertThat(IPUtil.isIPV6("250.250.250.250"), is(false));
        assertThat(IPUtil.isIPV6("d:d:d:d:d:d:d:d"), is(true));
    }
}
