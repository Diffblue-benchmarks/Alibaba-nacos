package com.alibaba.nacos.client.config.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.utils.ContentUtils
 *
 * @author Diffblue JCover
 */

public class ContentUtilsTest {

    @Test(timeout=10000)
    public void truncateContent() {
        assertThat(ContentUtils.truncateContent("foo"), is("foo"));
        assertThat(ContentUtils.truncateContent(null), is(""));
    }

    @Test(timeout=10000)
    public void verifyIncrementPubContentContentIsFoo() {
        ContentUtils.verifyIncrementPubContent("foo");
    }
}
