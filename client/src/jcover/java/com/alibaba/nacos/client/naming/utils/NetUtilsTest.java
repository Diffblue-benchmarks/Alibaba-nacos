package com.alibaba.nacos.client.naming.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.naming.utils.NetUtils
 *
 * @author Diffblue Cover
 */

class NetUtilsTest {

    @Test
    void localIP() {
        assertThat(NetUtils.localIP(), is("10.128.0.5"));
    }
}
