package com.alibaba.nacos.naming.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.exception.NacosException
 *
 * @author Diffblue JCover
 */

public class NacosExceptionTest {

    @Test(timeout=10000)
    public void getErrorCode1() {
        Throwable cause = new Exception();
        cause.setStackTrace(new StackTraceElement[] { });
        assertThat(new NacosException(1, "jpg", cause).getErrorCode(), is(1));
    }

    @Test(timeout=10000)
    public void getErrorCode2() {
        Throwable cause = new Exception();
        cause.setStackTrace(new StackTraceElement[] { });
        assertThat(new NacosException(1, cause).getErrorCode(), is(1));
    }

    @Test(timeout=10000)
    public void getErrorCode3() {
        assertThat(new NacosException(1).getErrorCode(), is(1));
        assertThat(new NacosException(1, "jpg").getErrorCode(), is(1));
        assertThat(new NacosException().getErrorCode(), is(0));
    }

    @Test(timeout=10000)
    public void getErrorMsgReturnsNull() {
        assertThat(new NacosException().getErrorMsg(), is(nullValue()));
    }
}
