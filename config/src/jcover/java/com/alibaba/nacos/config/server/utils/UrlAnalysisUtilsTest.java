package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.UrlAnalysisUtils
 *
 * @author Diffblue Cover
 */

class UrlAnalysisUtilsTest {

    @Test
    void getContentIdentity() {
        assertThat(UrlAnalysisUtils.getContentIdentity("w:"), is("w:"));
        assertThat(UrlAnalysisUtils.getContentIdentity(""), is(nullValue()));
        assertThat(UrlAnalysisUtils.getContentIdentity("hello"), is(""));
        assertThat(UrlAnalysisUtils.getContentIdentity(null), is(nullValue()));
    }
}
