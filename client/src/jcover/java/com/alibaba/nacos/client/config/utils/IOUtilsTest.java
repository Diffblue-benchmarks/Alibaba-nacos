package com.alibaba.nacos.client.config.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;

import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.io.StringWriter;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.utils.IOUtils
 *
 * @author Diffblue Cover
 */

class IOUtilsTest {

    @Test
    void testToString() throws java.io.IOException {
        assertThat(IOUtils.toString(new StringReader("foo")), is("foo"));
        assertThat(IOUtils.toString(new StringBufferInputStream("foo"), null), is("foo"));
    }

    @Test
    void copyReturnsThree() throws java.io.IOException {
        StringWriter output = new StringWriter();
        assertThat(IOUtils.copy(new StringReader("foo"), output), is(3L));
        assertThat(output.getBuffer().toString(), is("foo"));
    }

    @Test
    void copyReturnsZero() throws java.io.IOException {
        assertThat(IOUtils.copy(new StringReader(""), new StringWriter()), is(0L));
    }

    @Test
    void readLinesReturnsFoo() throws java.io.IOException {
        assertThat(IOUtils.readLines(new StringReader("foo")), hasSize(1));
        assertThat(IOUtils.readLines(new StringReader("foo")).get(0), is("foo"));
    }
}
