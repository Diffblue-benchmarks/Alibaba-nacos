package com.alibaba.nacos.config.server.utils;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletResponse;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.ResponseUtil
 *
 * @author Diffblue JCover
 */

public class ResponseUtilTest {

    @Test(timeout=10000)
    public void writeErrMsgHttpCodeIsOneAndMsgIsFoo() {
        ResponseUtil.writeErrMsg(new MockHttpServletResponse(), 1, "foo");
    }
}
