package com.alibaba.nacos.config.server.exception;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.exception.NacosException
 *
 * @author Diffblue JCover
 */

public class NacosExceptionDiffblueTest {

    @Test(timeout=10000)
    public void getErrCode() {
        assertThat(new NacosException(1, "jpg").getErrCode(), is(1));
        assertThat(new NacosException().getErrCode(), is(0));
    }

    @Test(timeout=10000)
    public void getErrMsgReturnsNull() {
        assertThat(new NacosException().getErrMsg(), is(nullValue()));
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
