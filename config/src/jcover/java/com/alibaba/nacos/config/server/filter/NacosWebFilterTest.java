package com.alibaba.nacos.config.server.filter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import javax.servlet.FilterConfig;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.mock.web.MockFilterChain;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

/**
 * Unit tests for com.alibaba.nacos.config.server.filter.NacosWebFilter
 *
 * @author Diffblue Cover
 */

class NacosWebFilterTest {

    @Test
    void rootPathReturnsNull() {
        assertThat(NacosWebFilter.rootPath(), is(nullValue()));
    }

    @Test
    void init() throws javax.servlet.ServletException, java.net.MalformedURLException {
        ServletContext servletContext = mock(ServletContext.class);
        when(servletContext.getRealPath(Mockito.<String>any()))
            .thenReturn("foo");
        FilterConfig filterConfig = mock(FilterConfig.class);
        when(filterConfig.getServletContext())
            .thenReturn(servletContext);
        new NacosWebFilter().init(filterConfig);
    }

    @Test
    void doFilter() throws javax.servlet.ServletException, java.io.IOException, java.io.UnsupportedEncodingException {

        // arrange
        MockHttpServletResponse response = new MockHttpServletResponse();
        Servlet servlet = mock(Servlet.class);

        // act
        new NacosWebFilter().doFilter(new MockHttpServletRequest(), response, new MockFilterChain(servlet));

        // assert
        assertThat(response.getCharacterEncoding(), is("UTF-8"));
        assertThat(response.getContentType(), is("application/json;charset=UTF-8"));
        assertThat(response.getHeaderNames(), hasSize(1));
        assertThat(response.getHeaderNames(), hasItem("Content-Type"));
        assertThat(response.isCharset(), is(true));
        Mockito.verify(servlet).service(ArgumentMatchers.<ServletRequest>any(), ArgumentMatchers.<ServletResponse>any());
    }

    @Test
    void destroy() {
        new NacosWebFilter().destroy();
    }
}
