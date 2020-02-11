package com.alibaba.nacos.core.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;

/**
 * Unit tests for com.alibaba.nacos.core.utils.WebUtils
 *
 * @author Diffblue JCover
 */

public class WebUtilsTest {

    @Test(timeout=10000)
    public void getAcceptEncoding() throws java.io.IOException, javax.servlet.ServletException {
        assertThat(WebUtils.getAcceptEncoding(new MockHttpServletRequest()), is("UTF-8"));
    }

    @Test(timeout=10000)
    public void optionalKeyIsBar() throws java.io.IOException, javax.servlet.ServletException {
        assertThat(WebUtils.optional(new MockHttpServletRequest(), "bar", "OX13QD"), is("OX13QD"));
    }
}
