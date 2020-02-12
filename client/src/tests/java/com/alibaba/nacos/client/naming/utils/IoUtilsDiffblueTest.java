package com.alibaba.nacos.client.naming.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertArrayEquals;

import java.io.ByteArrayOutputStream;
import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.io.StringWriter;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.naming.utils.IoUtils
 *
 * @author Diffblue JCover
 */

public class IoUtilsDiffblueTest {

    @Test(timeout=10000)
    public void copy() throws java.io.IOException {
        assertThat(IoUtils.copy(new StringBufferInputStream("Broadway"), new ByteArrayOutputStream()), is(8L));
        assertThat(IoUtils.copy(new StringReader("foo"), new StringWriter()), is(3L));
        assertThat(IoUtils.copy(new StringBufferInputStream(""), new ByteArrayOutputStream()), is(0L));
        assertThat(IoUtils.copy(new StringReader(""), new StringWriter()), is(0L));
    }

    @Test(timeout=10000)
    public void isGzipStreamBytesIsNull() {
        assertThat(IoUtils.isGzipStream(null), is(false));
    }

    @Test(timeout=10000)
    public void isGzipStreamBytesIsOne() {
        byte[] bytes = new byte[] { 1 };
        assertThat(IoUtils.isGzipStream(bytes), is(false));
    }

    @Test(timeout=10000)
    public void isGzipStreamBytesIsZeroOne() {
        byte[] bytes = new byte[] { 0, 1 };
        assertThat(IoUtils.isGzipStream(bytes), is(false));
    }

    @Test(timeout=10000)
    public void readLinesReturnsFoo() throws java.io.IOException {
        assertThat(IoUtils.readLines(new StringReader("foo")).size(), is(1));
        assertThat(IoUtils.readLines(new StringReader("foo")).get(0), is("foo"));
    }

    @Test(timeout=10000)
    public void testtoString() throws java.io.IOException {
        assertThat(IoUtils.toString(new StringBufferInputStream("Broadway"), "foo"), is(""));
        assertThat(IoUtils.toString(new StringReader("foo")), is("foo"));
    }

    @Test(timeout=10000)
    public void tryDecompressRawIsOneReturnsOne() throws Exception {
        byte[] raw = new byte[] { 1 };
        assertArrayEquals(new byte[] { 1 }, IoUtils.tryDecompress(raw));
    }
}
