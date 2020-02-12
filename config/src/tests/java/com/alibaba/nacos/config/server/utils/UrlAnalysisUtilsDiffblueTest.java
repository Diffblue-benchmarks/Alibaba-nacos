package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.UrlAnalysisUtils
 *
 * @author Diffblue JCover
 */

public class UrlAnalysisUtilsDiffblueTest {

    @Test(timeout=10000)
    public void getContentIdentity() {
        assertThat(UrlAnalysisUtils.getContentIdentity("w:"), is("w:"));
        assertThat(UrlAnalysisUtils.getContentIdentity(""), is(nullValue()));
        assertThat(UrlAnalysisUtils.getContentIdentity("foo"), is(""));
        assertThat(UrlAnalysisUtils.getContentIdentity(null), is(nullValue()));
    }
}
