package com.alibaba.nacos.core.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;

/**
 * Unit tests for com.alibaba.nacos.core.utils.WebUtils
 *
 * @author Diffblue Cover
 */

class WebUtilsTest {

    @Test
    void optionalDefaultValueIsValueAndKeyIsKeyReturnsValue() {
        assertThat(WebUtils.optional(new MockHttpServletRequest(), "key", "value"), is("value"));
    }

    @Test
    void getAcceptEncoding() {
        assertThat(WebUtils.getAcceptEncoding(new MockHttpServletRequest()), is("UTF-8"));
    }
}
