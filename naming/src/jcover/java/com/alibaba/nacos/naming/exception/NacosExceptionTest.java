package com.alibaba.nacos.naming.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.exception.NacosException
 *
 * @author Diffblue Cover
 */

public class NacosExceptionTest {

    @Test
    public void factory1() {
        NacosException nacosException = new NacosException(1);
        assertThat(nacosException.getErrorCode(), is(1));
        assertThat(nacosException.getErrorMsg(), is(nullValue()));
        assertThat(nacosException.getCause(), is(nullValue()));
        assertThat(nacosException.getMessage(), is(nullValue()));
    }

    @Test
    public void factory2() {
        Exception cause = new Exception();
        cause.setStackTrace(new StackTraceElement[] { });
        NacosException nacosException = new NacosException(1, cause);
        assertThat(nacosException.getErrorCode(), is(1));
        assertThat(nacosException.getErrorMsg(), is(nullValue()));
        assertThat(nacosException.getCause().getCause(), is(nullValue()));
        assertThat(nacosException.getCause().getMessage(), is(nullValue()));
        assertThat(nacosException.getMessage(), is("java.lang.Exception"));
    }

    @Test
    public void factory3() {
        NacosException nacosException = new NacosException(1, "bar");
        assertThat(nacosException.getErrorCode(), is(1));
        assertThat(nacosException.getErrorMsg(), is("bar"));
        assertThat(nacosException.getCause(), is(nullValue()));
        assertThat(nacosException.getMessage(), is("bar"));
    }

    @Test
    public void factory4() {
        Exception cause = new Exception();
        cause.setStackTrace(new StackTraceElement[] { });
        NacosException nacosException = new NacosException(1, "bar", cause);
        assertThat(nacosException.getErrorCode(), is(1));
        assertThat(nacosException.getErrorMsg(), is(nullValue()));
        assertThat(nacosException.getCause().getCause(), is(nullValue()));
        assertThat(nacosException.getCause().getMessage(), is(nullValue()));
        assertThat(nacosException.getMessage(), is("bar"));
    }
}
