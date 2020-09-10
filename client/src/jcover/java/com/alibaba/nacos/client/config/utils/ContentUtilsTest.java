package com.alibaba.nacos.client.config.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.utils.ContentUtils
 *
 * @author Diffblue Cover
 */

class ContentUtilsTest {

    @Test
    void verifyIncrementPubContentContentIsHello() {
        ContentUtils.verifyIncrementPubContent("hello");
    }

    @Test
    void truncateContent() {
        assertThat(ContentUtils.truncateContent("hello"), is("hello"));
        assertThat(ContentUtils.truncateContent(null), is(""));
    }
}
