package com.alibaba.nacos.client.config.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.io.StringReader;
import java.io.StringWriter;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.utils.IOUtils
 *
 * @author Diffblue JCover
 */

public class IOUtilsDiffblueTest {

    @Test(timeout=10000)
    public void copy() throws java.io.IOException {
        assertThat(IOUtils.copy(new StringReader("foo"), new StringWriter()), is(3L));
        assertThat(IOUtils.copy(new StringReader(""), new StringWriter()), is(0L));
    }

    @Test(timeout=10000)
    public void readLinesReturnsFoo() throws java.io.IOException {
        assertThat(IOUtils.readLines(new StringReader("foo")).size(), is(1));
        assertThat(IOUtils.readLines(new StringReader("foo")).get(0), is("foo"));
    }

    @Test(timeout=10000)
    public void toStringReturnsFoo() throws java.io.IOException {
        assertThat(IOUtils.toString(new StringReader("foo")), is("foo"));
    }
}
