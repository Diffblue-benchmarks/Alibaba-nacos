package com.alibaba.nacos.api.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.api.exception.NacosException
 *
 * @author Diffblue JCover
 */

public class NacosExceptionTest {

    @Test(timeout=10000)
    public void getErrCode1() {
        Throwable throwable = new Exception();
        throwable.setStackTrace(new StackTraceElement[] { });
        assertThat(new NacosException(1, "jpg", throwable).getErrCode(), is(1));
    }

    @Test(timeout=10000)
    public void getErrCode2() {
        Throwable throwable = new Exception();
        throwable.setStackTrace(new StackTraceElement[] { });
        assertThat(new NacosException(1, throwable).getErrCode(), is(1));
    }

    @Test(timeout=10000)
    public void getErrCode3() {
        assertThat(new NacosException(1, "jpg").getErrCode(), is(1));
        assertThat(new NacosException().getErrCode(), is(0));
    }

    @Test(timeout=10000)
    public void getErrMsg() {
        assertThat(new NacosException().getErrMsg(), is(""));
        assertThat(new NacosException(1, "jpg").getErrMsg(), is("jpg"));
    }

    @Test(timeout=10000)
    public void getErrMsgReturnsNull() {
        Throwable throwable = new Exception();
        throwable.setStackTrace(new StackTraceElement[] { });
        assertThat(new NacosException(1, throwable).getErrMsg(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setCauseThrowable() {
        NacosException nacosException = new NacosException();
        Throwable throwable3 = new Exception();
        throwable3.setStackTrace(new StackTraceElement[] { });
        nacosException.setCauseThrowable(throwable3);
        assertThat(nacosException.getErrMsg(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setErrCodeToOne() {
        NacosException nacosException = new NacosException();
        nacosException.setErrCode(1);
        assertThat(nacosException.getErrCode(), is(1));
    }

    @Test(timeout=10000)
    public void setErrMsgToJpg() {
        NacosException nacosException = new NacosException();
        nacosException.setErrMsg("jpg");
        assertThat(nacosException.getErrMsg(), is("jpg"));
    }
}
