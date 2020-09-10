package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.RequestUtil
 *
 * @author Diffblue Cover
 */

class RequestUtilTest {

    @Test
    void getRemoteIp() {
        assertThat(RequestUtil.getRemoteIp(new MockHttpServletRequest()), is("127.0.0.1"));
    }

    @Test
    void getAppNameReturnsNull() {
        assertThat(RequestUtil.getAppName(new MockHttpServletRequest()), is(nullValue()));
    }
}
