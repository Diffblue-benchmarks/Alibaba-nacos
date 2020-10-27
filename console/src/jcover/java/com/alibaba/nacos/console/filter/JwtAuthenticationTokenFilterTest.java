package com.alibaba.nacos.console.filter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import com.alibaba.nacos.console.utils.JwtTokenUtils;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.core.env.Environment;
import org.springframework.mock.web.MockFilterChain;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

/**
 * Unit tests for com.alibaba.nacos.console.filter.JwtAuthenticationTokenFilter
 *
 * @author Diffblue Cover
 */

class JwtAuthenticationTokenFilterTest {

    @Test
    void factory() {
        JwtAuthenticationTokenFilter jwtAuthenticationTokenFilter =
             new JwtAuthenticationTokenFilter(new JwtTokenUtils());
        jwtAuthenticationTokenFilter.setBeanName("data.txt");
        Environment environment = mock(Environment.class);
        jwtAuthenticationTokenFilter.setEnvironment(environment);
        ServletContext servletContext = mock(ServletContext.class);
        jwtAuthenticationTokenFilter.setServletContext(servletContext);
        assertThat(jwtAuthenticationTokenFilter.getFilterConfig(), is(nullValue()));
    }

    @Test
    void doFilter() throws javax.servlet.ServletException, java.io.IOException, java.io.UnsupportedEncodingException {

        // arrange
        MockHttpServletRequest request = new MockHttpServletRequest();
        Servlet servlet = mock(Servlet.class);

        // act
        new JwtAuthenticationTokenFilter(new JwtTokenUtils()).doFilter(request, new MockHttpServletResponse(), new MockFilterChain(servlet));

        // assert
        assertThat(request.getAttributeNames().hasMoreElements(), is(true));
        Mockito.verify(servlet).service(ArgumentMatchers.<ServletRequest>any(), ArgumentMatchers.<ServletResponse>any());
    }
}
