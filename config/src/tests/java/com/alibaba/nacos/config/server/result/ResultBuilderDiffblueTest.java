package com.alibaba.nacos.config.server.result;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;

import com.alibaba.nacos.config.server.model.RestResult;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.result.ResultBuilder
 *
 * @author Diffblue JCover
 */

public class ResultBuilderDiffblueTest {

    @Test(timeout=10000)
    public void buildSuccessResult1() {
        RestResult<Object> result = ResultBuilder.<Object>buildSuccessResult();
        assertThat(result.getCode(), is(200));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getMessage(), is("处理成功"));
    }

    @Test(timeout=10000)
    public void buildSuccessResult2() {
        Object resultData = new Object();
        RestResult<Object> result = ResultBuilder.<Object>buildSuccessResult(resultData);
        assertThat(result.getCode(), is(200));
        assertThat(result.getData(), sameInstance(resultData));
        assertThat(result.getMessage(), is("处理成功"));
    }

    @Test(timeout=10000)
    public void buildSuccessResultSuccessMsgIsFoo1() {
        RestResult<Object> result = ResultBuilder.<Object>buildSuccessResult("foo");
        assertThat(result.getCode(), is(200));
        assertThat(result.getData(), is(nullValue()));
        assertThat(result.getMessage(), is("foo"));
    }

    @Test(timeout=10000)
    public void buildSuccessResultSuccessMsgIsFoo2() {
        Object resultData = new Object();
        RestResult<Object> result = ResultBuilder.<Object>buildSuccessResult("foo", resultData);
        assertThat(result.getCode(), is(200));
        assertThat(result.getData(), sameInstance(resultData));
        assertThat(result.getMessage(), is("foo"));
    }
}
