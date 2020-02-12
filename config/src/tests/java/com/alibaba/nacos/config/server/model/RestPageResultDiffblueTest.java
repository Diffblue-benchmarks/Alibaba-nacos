package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.RestPageResult
 *
 * @author Diffblue JCover
 */

public class RestPageResultDiffblueTest {

    @Test(timeout=10000)
    public void getCodeReturnsZero() {
        assertThat(new RestPageResult<Object>().getCode(), is(0));
    }

    @Test(timeout=10000)
    public void getCurrentPageReturnsZero() {
        assertThat(new RestPageResult<Object>().getCurrentPage(), is(0));
    }

    @Test(timeout=10000)
    public void getDataReturnsNull() {
        assertThat(new RestPageResult<Object>().getData(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getMessageReturnsNull() {
        assertThat(new RestPageResult<Object>().getMessage(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getPageSizeReturnsZero() {
        assertThat(new RestPageResult<Object>().getPageSize(), is(0));
    }

    @Test(timeout=10000)
    public void getSerialversionuid() {
        assertThat(RestPageResult.getSerialversionuid(), is(-8_048_577_763_828_650_575L));
    }

    @Test(timeout=10000)
    public void getTotalReturnsZero() {
        assertThat(new RestPageResult<Object>().getTotal(), is(0));
    }

    @Test(timeout=10000)
    public void setCodeToOne() {
        RestPageResult<Object> restPageResult = new RestPageResult<Object>();
        restPageResult.setCode(1);
        assertThat(restPageResult.getCode(), is(1));
    }

    @Test(timeout=10000)
    public void setCurrentPageToOne() {
        RestPageResult<Object> restPageResult = new RestPageResult<Object>();
        restPageResult.setCurrentPage(1);
        assertThat(restPageResult.getCurrentPage(), is(1));
    }

    @Test(timeout=10000)
    public void setData() {
        RestPageResult<Object> restPageResult = new RestPageResult<Object>();
        Object data = new Object();
        restPageResult.setData(data);
        assertThat(restPageResult.getData(), sameInstance(data));
    }

    @Test(timeout=10000)
    public void setMessageToFoo() {
        RestPageResult<Object> restPageResult = new RestPageResult<Object>();
        restPageResult.setMessage("foo");
        assertThat(restPageResult.getMessage(), is("foo"));
    }

    @Test(timeout=10000)
    public void setPageSizeToOne() {
        RestPageResult<Object> restPageResult = new RestPageResult<Object>();
        restPageResult.setPageSize(1);
        assertThat(restPageResult.getPageSize(), is(1));
    }

    @Test(timeout=10000)
    public void setTotalToOne() {
        RestPageResult<Object> restPageResult = new RestPageResult<Object>();
        restPageResult.setTotal(1);
        assertThat(restPageResult.getTotal(), is(1));
    }
}
