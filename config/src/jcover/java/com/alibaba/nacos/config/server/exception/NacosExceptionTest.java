package com.alibaba.nacos.config.server.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.exception.NacosException
 *
 * @author Diffblue Cover
 */

class NacosExceptionTest {

    @Test
    void factory1() {
        NacosException nacosException = new NacosException();
        nacosException.setErrCode(1);
        nacosException.setErrMsg("bar");
        assertThat(nacosException.getErrCode(), is(1));
        assertThat(nacosException.getErrMsg(), is("bar"));
        assertThat(nacosException.getCause(), is(nullValue()));
        assertThat(nacosException.getMessage(), is(nullValue()));
    }

    @Test
    void factory2() {
        NacosException nacosException = new NacosException(0, "bar");
        nacosException.setErrCode(1);
        nacosException.setErrMsg("foo");
        assertThat(nacosException.getErrCode(), is(1));
        assertThat(nacosException.getErrMsg(), is("foo"));
        assertThat(nacosException.getCause(), is(nullValue()));
        assertThat(nacosException.getMessage(), is("bar"));
    }
}
