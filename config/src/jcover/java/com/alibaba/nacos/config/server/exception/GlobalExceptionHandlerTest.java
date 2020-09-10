package com.alibaba.nacos.config.server.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletResponse;

/**
 * Unit tests for com.alibaba.nacos.config.server.exception.GlobalExceptionHandler
 *
 * @author Diffblue Cover
 */

class GlobalExceptionHandlerTest {

    @Test
    void handleIllegalArgumentException1() throws java.io.UnsupportedEncodingException, java.io.IOException {

        // arrange
        MockHttpServletResponse response = new MockHttpServletResponse();

        // act
        new GlobalExceptionHandler().handleIllegalArgumentException(response, new NacosException());

        // assert
        assertThat(response.getContentAsString(), is("invalid param\n"));
        assertThat(response.getStatus(), is(400));
    }

    @Test
    void handleIllegalArgumentException2() throws java.io.UnsupportedEncodingException, java.io.IOException {

        // arrange
        MockHttpServletResponse response = new MockHttpServletResponse();

        // act
        new GlobalExceptionHandler().handleIllegalArgumentException(response, new NacosException(1, "jpg"));

        // assert
        assertThat(response.getContentAsString(), is("jpg\n"));
        assertThat(response.getStatus(), is(400));
    }

    @Test
    void handleNacosException1() throws java.io.UnsupportedEncodingException, java.io.IOException {

        // arrange
        MockHttpServletResponse response = new MockHttpServletResponse();
        NacosException ex = new NacosException();
        ex.setErrCode(1);
        ex.setErrMsg("jpg");

        // act
        new GlobalExceptionHandler().handleNacosException(response, ex);

        // assert
        assertThat(response.getContentAsString(), is("jpg\n"));
        assertThat(response.getStatus(), is(1));
    }

    @Test
    void handleNacosException2() throws java.io.UnsupportedEncodingException, java.io.IOException {

        // arrange
        MockHttpServletResponse response = new MockHttpServletResponse();
        NacosException ex = new NacosException();
        ex.setErrCode(1);

        // act
        new GlobalExceptionHandler().handleNacosException(response, ex);

        // assert
        assertThat(response.getContentAsString(), is("unknown exception\n"));
        assertThat(response.getStatus(), is(1));
    }
}
