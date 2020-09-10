package com.alibaba.nacos.common.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;

import java.io.StringBufferInputStream;
import java.io.StringReader;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.common.util.IoUtils
 *
 * @author Diffblue Cover
 */

class IoUtilsTest {

    @Test
    void tryDecompressReturnsNull() throws Exception {
        assertThat(IoUtils.tryDecompress(new StringBufferInputStream("foo")), is(nullValue()));
    }

    @Test
    void readLinesReturnsFoo() throws java.io.IOException {
        assertThat(IoUtils.readLines(new StringReader("foo")), hasSize(1));
        assertThat(IoUtils.readLines(new StringReader("foo")).get(0), is("foo"));
    }
}
