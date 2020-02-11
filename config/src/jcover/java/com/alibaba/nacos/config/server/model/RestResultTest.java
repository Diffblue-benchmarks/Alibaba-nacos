package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.RestResult
 *
 * @author Diffblue JCover
 */

public class RestResultTest {

    @Test(timeout=10000)
    public void getCode() {
        assertThat(new RestResult<Object>(1, new Object()).getCode(), is(1));
        assertThat(new RestResult<Object>(1, "foo").getCode(), is(1));
        assertThat(new RestResult<Object>(1, "foo", new Object()).getCode(), is(1));
        assertThat(new RestResult<Object>().getCode(), is(0));
    }

    @Test(timeout=10000)
    public void getDataReturnsNull() {
        assertThat(new RestResult<Object>().getData(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getMessageReturnsNull() {
        assertThat(new RestResult<Object>().getMessage(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setCodeToOne() {
        RestResult<Object> restResult = new RestResult<Object>();
        restResult.setCode(1);
        assertThat(restResult.getCode(), is(1));
    }

    @Test(timeout=10000)
    public void setData() {
        RestResult<Object> restResult = new RestResult<Object>();
        Object data3 = new Object();
        restResult.setData(data3);
        assertThat(restResult.getData(), sameInstance(data3));
    }

    @Test(timeout=10000)
    public void setMessageToFoo() {
        RestResult<Object> restResult = new RestResult<Object>();
        restResult.setMessage("foo");
        assertThat(restResult.getMessage(), is("foo"));
    }
}
