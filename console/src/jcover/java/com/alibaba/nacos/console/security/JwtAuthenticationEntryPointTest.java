package com.alibaba.nacos.console.security;

import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.security.core.AuthenticationException;

/**
 * Unit tests for com.alibaba.nacos.console.security.JwtAuthenticationEntryPoint
 *
 * @author Diffblue JCover
 */

public class JwtAuthenticationEntryPointTest {

    @Test(timeout=10000)
    public void commence() throws java.io.IOException, javax.servlet.ServletException {
        AuthenticationException e = mock(AuthenticationException.class);
        new JwtAuthenticationEntryPoint().commence(new MockHttpServletRequest(), new MockHttpServletResponse(), e);
    }
}
