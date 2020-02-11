package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.RequestUtil
 *
 * @author Diffblue JCover
 */

public class RequestUtilTest {

    @Test(timeout=10000)
    public void getAppNameReturnsNull() throws java.io.IOException, javax.servlet.ServletException {
        assertThat(RequestUtil.getAppName(new MockHttpServletRequest()), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getRemoteIp() throws java.io.IOException, javax.servlet.ServletException {
        assertThat(RequestUtil.getRemoteIp(new MockHttpServletRequest()), is("127.0.0.1"));
    }
}
