package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.AppNameUtils
 *
 * @author Diffblue Cover
 */

class AppNameUtilsTest {

    @Test
    void getAppNameReturnsUnknown() {
        assertThat(AppNameUtils.getAppName(), is("unknown"));
    }
}
