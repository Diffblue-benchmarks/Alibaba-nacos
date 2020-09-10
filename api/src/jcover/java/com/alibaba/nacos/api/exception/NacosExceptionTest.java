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
        nacosException.setErrMsg("jpg");
        assertThat(nacosException.getErrCode(), is(1));
        assertThat(nacosException.getCause(), is(nullValue()));
        assertThat(nacosException.getMessage(), is(nullValue()));
    }

    @Test
    void factory2() {
        NacosException nacosException =
             new NacosException(0, "jpg", new NacosException());
        nacosException.setCauseThrowable(new NacosException());
        nacosException.setErrCode(1);
        nacosException.setErrMsg("jpg");
        assertThat(nacosException.getErrCode(), is(1));
        assertThat(nacosException.getCause().getCause(), is(nullValue()));
        assertThat(nacosException.getCause().getMessage(), is(nullValue()));
        assertThat(nacosException.getMessage(), is("jpg"));
    }

    @Test
    void factory3() {
        NacosException nacosException =
             new NacosException(0, new NacosException());
        nacosException.setCauseThrowable(new NacosException());
        nacosException.setErrCode(1);
        nacosException.setErrMsg("jpg");
        assertThat(nacosException.getErrCode(), is(1));
        assertThat(nacosException.getCause().getCause(), is(nullValue()));
        assertThat(nacosException.getCause().getMessage(), is(nullValue()));
        assertThat(nacosException.getMessage(), is("ErrCode:0, ErrMsg:"));
    }

    @Test
    void factory4() {
        NacosException nacosException = new NacosException(0, "bar");
        nacosException.setCauseThrowable(new NacosException());
        nacosException.setErrCode(1);
        nacosException.setErrMsg("jpg");
        assertThat(nacosException.getErrCode(), is(1));
        assertThat(nacosException.getCause(), is(nullValue()));
        assertThat(nacosException.getMessage(), is("bar"));
    }

    @Test
    void getErrMsg1() {
        NacosException nacosException = new NacosException();
        nacosException.setCauseThrowable(new NacosException());
        nacosException.setErrMsg("jpg");
        assertThat(nacosException.getErrMsg(), is("jpg"));
    }

    @Test
    void getErrMsg2() {
        NacosException nacosException = new NacosException();
        nacosException.setCauseThrowable(new NacosException(1, "jpg"));
        assertThat(nacosException.getErrMsg(), is("jpg"));
    }
}
