package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;

import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.MD5Util
 *
 * @author Diffblue Cover
 */

class MD5UtilTest {

    @Test
    void compareMd1() throws java.io.UnsupportedEncodingException {
        assertThat(MD5Util.compareMd5(new MockHttpServletRequest(), new MockHttpServletResponse(), new HashMap<String, String>()), empty());
    }

    @Test
    void compareMd2() throws java.io.UnsupportedEncodingException {
        HashMap<String, String> clientMd5Map = new HashMap<String, String>();
        clientMd5Map.put("", "foo");
        assertThat(MD5Util.compareMd5(new MockHttpServletRequest(), new MockHttpServletResponse(), clientMd5Map), hasSize(1));
        assertThat(MD5Util.compareMd5(new MockHttpServletRequest(), new MockHttpServletResponse(), clientMd5Map).get(0), is(""));
    }

    @Test
    void compareMd3() throws java.io.UnsupportedEncodingException {
        HashMap<String, String> clientMd5Map = new HashMap<String, String>();
        clientMd5Map.put("", "");
        assertThat(MD5Util.compareMd5(new MockHttpServletRequest(), new MockHttpServletResponse(), clientMd5Map), empty());
    }

    @Test
    void compareMd5OldResultChangedGroupKeysIsKey() {
        ArrayList<String> changedGroupKeys = new ArrayList<String>();
        changedGroupKeys.add("key");
        assertThat(MD5Util.compareMd5OldResult(changedGroupKeys), is("null:key;"));
    }

    @Test
    void compareMd5ResultString() throws java.io.IOException {
        assertThat(MD5Util.compareMd5ResultString(new ArrayList<String>()), is(""));
        assertThat(MD5Util.compareMd5ResultString(null), is(""));
    }

    @Test
    void compareMd5ResultStringChangedGroupKeysIsBar() throws java.io.IOException {
        ArrayList<String> changedGroupKeys = new ArrayList<String>();
        changedGroupKeys.add("bar");
        assertThat(MD5Util.compareMd5ResultString(changedGroupKeys), is("null%02bar%01"));
    }

    @Test
    void getClientMd5Map() {
        assertThat(MD5Util.getClientMd5Map("bar").isEmpty(), is(true));
        assertThat(MD5Util.getClientMd5Map("").isEmpty(), is(true));
        assertThat(MD5Util.getClientMd5Map(null).isEmpty(), is(true));
    }

    @Test
    void testToString() throws java.io.IOException {
        assertThat(MD5Util.toString(new StringReader("foo")), is("foo"));
        assertThat(MD5Util.toString(new StringBufferInputStream("foo"), null), is("foo"));
    }

    @Test
    void copyReturnsThree() throws java.io.IOException {
        StringWriter output = new StringWriter();
        assertThat(MD5Util.copy(new StringReader("foo"), output), is(3L));
        assertThat(output.getBuffer().toString(), is("foo"));
    }

    @Test
    void copyReturnsZero() throws java.io.IOException {
        assertThat(MD5Util.copy(new StringReader(""), new StringWriter()), is(0L));
    }
}
