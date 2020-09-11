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
        nacosException.setCauseThrowable(new NacosException());
        nacosException.setErrCode(1);
        nacosException.setErrMsg("bar");
        assertThat(nacosException.getErrCode(), is(1));
        assertThat(nacosException.getCause(), is(nullValue()));
        assertThat(nacosException.getMessage(), is(nullValue()));
    }

    @Test
    void factory2() {
        NacosException nacosException = new NacosException(0, "foo");
        nacosException.setCauseThrowable(new NacosException());
        nacosException.setErrCode(1);
        nacosException.setErrMsg("an error has happened");
        assertThat(nacosException.getErrCode(), is(1));
        assertThat(nacosException.getCause(), is(nullValue()));
        assertThat(nacosException.getMessage(), is("foo"));
    }

    @Test
    void factory3() {
        NacosException nacosException =
             new NacosException(0, "foo", new NacosException());
        nacosException.setCauseThrowable(new NacosException());
        nacosException.setErrCode(1);
        nacosException.setErrMsg("an error has happened");
        assertThat(nacosException.getErrCode(), is(1));
        assertThat(nacosException.getCause().getCause(), is(nullValue()));
        assertThat(nacosException.getCause().getMessage(), is(nullValue()));
        assertThat(nacosException.getMessage(), is("foo"));
    }

    @Test
    void factory4() {
        NacosException nacosException =
             new NacosException(0, new NacosException());
        nacosException.setCauseThrowable(new NacosException());
        nacosException.setErrCode(1);
        nacosException.setErrMsg("an error has happened");
        assertThat(nacosException.getErrCode(), is(1));
        assertThat(nacosException.getCause().getCause(), is(nullValue()));
        assertThat(nacosException.getCause().getMessage(), is(nullValue()));
        assertThat(nacosException.getMessage(), is("ErrCode:0, ErrMsg:"));
    }

    @Test
    void factory5() {
        NacosException nacosException =
             new NacosException(1, new NacosException(1, new NacosException()));
        nacosException.setCauseThrowable(new NacosException());
        nacosException.setErrCode(1);
        nacosException.setErrMsg("an error has happened");
        assertThat(nacosException.getErrCode(), is(1));
        assertThat(nacosException.getCause().getCause().getCause(), is(nullValue()));
        assertThat(nacosException.getCause().getCause().getMessage(), is(nullValue()));
        assertThat(nacosException.getCause().getMessage(), is("ErrCode:0, ErrMsg:"));
        assertThat(nacosException.getMessage(), is("ErrCode:1, ErrMsg:null"));
    }

    @Test
    void factory6() {
        NacosException nacosException = new NacosException();
        nacosException.setCauseThrowable(new NacosException(0, new NacosException()));
        nacosException.setErrCode(1);
        nacosException.setErrMsg("an error has happened");
        assertThat(nacosException.getErrCode(), is(1));
        assertThat(nacosException.getCause(), is(nullValue()));
        assertThat(nacosException.getMessage(), is(nullValue()));
    }

    @Test
    void getErrMsgReturnsBar() {
        NacosException nacosException = new NacosException();
        nacosException.setCauseThrowable(new NacosException());
        nacosException.setErrMsg("bar");
        assertThat(nacosException.getErrMsg(), is("bar"));
    }
}
