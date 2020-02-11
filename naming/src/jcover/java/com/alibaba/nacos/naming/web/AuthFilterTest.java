package com.alibaba.nacos.naming.web;

import static org.mockito.Mockito.mock;

import javax.servlet.FilterConfig;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.web.AuthFilter
 *
 * @author Diffblue JCover
 */

public class AuthFilterTest {

    @Test(timeout=10000)
    public void destroy() {
        new AuthFilter().destroy();
    }

    @Test(timeout=10000)
    public void init() throws javax.servlet.ServletException {
        FilterConfig filterConfig = mock(FilterConfig.class);
        new AuthFilter().init(filterConfig);
    }
}
