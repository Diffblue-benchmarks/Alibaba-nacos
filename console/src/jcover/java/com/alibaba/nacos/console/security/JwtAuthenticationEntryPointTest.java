package com.alibaba.nacos.console.security;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Unit tests for com.alibaba.nacos.console.security.JwtAuthenticationEntryPoint
 *
 * @author Diffblue Cover
 */

@ContextConfiguration(classes = {JwtAuthenticationEntryPoint.class})
@ExtendWith(SpringExtension.class)
class JwtAuthenticationEntryPointTest {

    @Autowired
    private JwtAuthenticationEntryPoint service;

    @Test
    void commence() throws java.io.UnsupportedEncodingException, java.io.IOException, javax.servlet.ServletException {

        // arrange
        MockHttpServletResponse httpServletResponse =
             new MockHttpServletResponse();
        AuthenticationException e = mock(AuthenticationException.class);
        when(e.getMessage())
            .thenReturn("foo");

        // act
        service.commence(new MockHttpServletRequest(), httpServletResponse, e);

        // assert
        assertThat(httpServletResponse.getErrorMessage(), is("Unauthorized"));
        assertThat(httpServletResponse.getStatus(), is(401));
    }
}
