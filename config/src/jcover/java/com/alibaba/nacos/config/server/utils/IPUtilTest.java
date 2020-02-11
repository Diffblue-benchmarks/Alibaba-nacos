package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.IPUtil
 *
 * @author Diffblue JCover
 */

public class IPUtilTest {

    @Test(timeout=10000)
    public void isIPV4AddrIsFooReturnsFalse() {
        assertThat(IPUtil.isIPV4("foo"), is(false));
    }

    @Test(timeout=10000)
    public void isIPV6() {
        assertThat(IPUtil.isIPV6("foo"), is(false));
        assertThat(IPUtil.isIPV6("d:d:d:d:d:d:d:d"), is(true));
    }
}
