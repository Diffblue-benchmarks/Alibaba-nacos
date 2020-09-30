package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.RestPageResult
 *
 * @author Diffblue Cover
 */

class RestPageResultTest {

    @Test
    void factory() {
        RestPageResult<String> restPageResult = new RestPageResult<String>();
        restPageResult.setCode(-1);
        restPageResult.setCurrentPage(0);
        restPageResult.setData("something");
        restPageResult.setMessage("bar");
        restPageResult.setPageSize(1);
        restPageResult.setTotal(1);
        assertThat(restPageResult.getCode(), is(-1));
        assertThat(restPageResult.getCurrentPage(), is(0));
        assertThat(restPageResult.getData(), is("something"));
        assertThat(restPageResult.getMessage(), is("bar"));
        assertThat(restPageResult.getPageSize(), is(1));
        assertThat(restPageResult.getTotal(), is(1));
    }

    @Test
    void getSerialversionuid() {
        assertThat(RestPageResult.getSerialversionuid(), is(-8_048_577_763_828_650_575L));
    }
}
