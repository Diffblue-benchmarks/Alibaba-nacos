package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.JSONUtils
 *
 * @author Diffblue Cover
 */

class JSONUtilsTest {

    @Test
    void serializeObjectOIsFoo() throws java.io.IOException {
        assertThat(JSONUtils.serializeObject("foo"), is("\"foo\""));
    }
}
