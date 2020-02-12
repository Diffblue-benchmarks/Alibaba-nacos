package com.alibaba.nacos.config.server.filter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.junit.Test;
import org.mockito.Mockito;

/**
 * Unit tests for com.alibaba.nacos.config.server.filter.NacosWebFilter
 *
 * @author Diffblue JCover
 */

public class NacosWebFilterDiffblueTest {

    @Test(timeout=10000)
    public void destroy() {
        new NacosWebFilter().destroy();
    }

    @Test(timeout=10000)
    public void doFilter() throws java.io.IOException, javax.servlet.ServletException {
        ServletRequest request = mock(ServletRequest.class);
        ServletResponse response = mock(ServletResponse.class);
        FilterChain chain = mock(FilterChain.class);
        new NacosWebFilter().doFilter(request, response, chain);
    }

    @Test(timeout=10000)
    public void init() throws javax.servlet.ServletException {
        ServletContext servletContext = mock(ServletContext.class);
        when(servletContext.getRealPath(Mockito.<String>any()))
            .thenReturn("foo");
        FilterConfig filterConfig = mock(FilterConfig.class);
        when(filterConfig.getServletContext())
            .thenReturn(servletContext);
        new NacosWebFilter().init(filterConfig);
    }

    @Test(timeout=10000)
    public void rootPathReturnsNull() {
        assertThat(NacosWebFilter.rootPath(), is(nullValue()));
    }
}
