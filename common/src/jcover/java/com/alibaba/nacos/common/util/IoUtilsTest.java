package com.alibaba.nacos.common.util;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import java.io.StringBufferInputStream;
import java.io.StringReader;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.common.util.IoUtils
 *
 * @author Diffblue JCover
 */

public class IoUtilsTest {

    @Test(timeout=10000)
    public void readLinesReturnsFoo() throws java.io.IOException {
        assertThat(IoUtils.readLines(new StringReader("foo")).size(), is(1));
        assertThat(IoUtils.readLines(new StringReader("foo")).get(0), is("foo"));
    }

    @Test(timeout=10000)
    public void tryDecompressReturnsNull() throws Exception {
        assertThat(IoUtils.tryDecompress(new StringBufferInputStream("Broadway")), is(nullValue()));
    }
}
