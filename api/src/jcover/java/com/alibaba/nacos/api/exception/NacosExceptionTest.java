package com.alibaba.nacos.api.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.api.exception.NacosException
 *
 * @author Diffblue Cover
 */

class NacosExceptionTest {

    @Test
    void factory1() {
        NacosException nacosException = new NacosException();
        Exception throwable = new Exception();
        throwable.setStackTrace(new StackTraceElement[] { });
        nacosException.setCauseThrowable(throwable);
        nacosException.setErrCode(1);
        nacosException.setErrMsg("bar");
        assertThat(nacosException.getErrCode(), is(1));
        assertThat(nacosException.getCause(), is(nullValue()));
        assertThat(nacosException.getMessage(), is(nullValue()));
    }

    @Test
    void factory2() {
        NacosException nacosException = new NacosException(0, "bar");
        Exception throwable = new Exception();
        throwable.setStackTrace(new StackTraceElement[] { });
        nacosException.setCauseThrowable(throwable);
        nacosException.setErrCode(1);
        nacosException.setErrMsg("an error has happened");
        assertThat(nacosException.getErrCode(), is(1));
        assertThat(nacosException.getCause(), is(nullValue()));
        assertThat(nacosException.getMessage(), is("bar"));
    }

    @Test
    void factory3() {
        Exception throwable1 = new Exception();
        throwable1.setStackTrace(new StackTraceElement[] { });
        NacosException nacosException =
             new NacosException(0, "bar", throwable1);
        Exception throwable2 = new Exception();
        throwable2.setStackTrace(new StackTraceElement[] { });
        nacosException.setCauseThrowable(throwable2);
        nacosException.setErrCode(1);
        nacosException.setErrMsg("an error has happened");
        assertThat(nacosException.getErrCode(), is(1));
        assertThat(nacosException.getCause().getCause(), is(nullValue()));
        assertThat(nacosException.getCause().getMessage(), is(nullValue()));
        assertThat(nacosException.getMessage(), is("bar"));
    }

    @Test
    void factory4() {
        Exception throwable1 = new Exception();
        throwable1.setStackTrace(new StackTraceElement[] { });
        NacosException nacosException = new NacosException(0, throwable1);
        Exception throwable2 = new Exception();
        throwable2.setStackTrace(new StackTraceElement[] { });
        nacosException.setCauseThrowable(throwable2);
        nacosException.setErrCode(1);
        nacosException.setErrMsg("bar");
        assertThat(nacosException.getErrCode(), is(1));
        assertThat(nacosException.getCause().getCause(), is(nullValue()));
        assertThat(nacosException.getCause().getMessage(), is(nullValue()));
        assertThat(nacosException.getMessage(), is("java.lang.Exception"));
    }

    @Test
    void getErrMsgReturnsBar() {
        NacosException nacosException = new NacosException();
        Exception throwable3 = new Exception();
        throwable3.setStackTrace(new StackTraceElement[] { });
        nacosException.setCauseThrowable(throwable3);
        nacosException.setErrMsg("bar");
        assertThat(nacosException.getErrMsg(), is("bar"));
    }

    @Test
    void getErrMsgReturnsNull() {
        NacosException nacosException = new NacosException();
        Exception throwable3 = new Exception();
        throwable3.setStackTrace(new StackTraceElement[] { });
        nacosException.setCauseThrowable(throwable3);
        assertThat(nacosException.getErrMsg(), is(nullValue()));
    }
}
