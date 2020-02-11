package com.alibaba.nacos.naming.web;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.web.FilterBase
 *
 * @author Diffblue JCover
 */

public class FilterBaseTest {

    @Test(timeout=10000)
    public void getMethodReturnsNull() {
        assertThat(new FilterBase().getMethod("/bin/bash", "/bin/bash"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void init() {
        new FilterBase().init();
    }
}
