package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletResponse;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.ResponseUtil
 *
 * @author Diffblue Cover
 */

class ResponseUtilTest {

    @Test
    void writeErrMsgHttpCodeIsOne() throws java.io.UnsupportedEncodingException {

        // arrange
        MockHttpServletResponse response = new MockHttpServletResponse();

        // act
        ResponseUtil.writeErrMsg(response, 1, "/some/path.html");

        // assert
        assertThat(response.getContentAsString(), is("/some/path.html\n"));
        assertThat(response.getStatus(), is(1));
    }
}
