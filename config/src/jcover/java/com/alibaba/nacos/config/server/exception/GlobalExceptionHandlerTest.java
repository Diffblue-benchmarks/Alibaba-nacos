package com.alibaba.nacos.config.server.exception;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletResponse;

/**
 * Unit tests for com.alibaba.nacos.config.server.exception.GlobalExceptionHandler
 *
 * @author Diffblue JCover
 */

public class GlobalExceptionHandlerTest {

    @Test(timeout=10000)
    public void handleIllegalArgumentException() throws java.io.IOException {
        Exception ex = new Exception();
        ex.setStackTrace(new StackTraceElement[] { });
        new GlobalExceptionHandler().handleIllegalArgumentException(new MockHttpServletResponse(), ex);
    }

    @Test(timeout=10000)
    public void handleNacosException1() throws java.io.IOException {
        new GlobalExceptionHandler().handleNacosException(new MockHttpServletResponse(), new NacosException());
    }

    @Test(timeout=10000)
    public void handleNacosException2() throws java.io.IOException {
        new GlobalExceptionHandler().handleNacosException(new MockHttpServletResponse(), new NacosException(1, "jpg"));
    }
}
