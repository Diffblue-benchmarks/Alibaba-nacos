package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.MD5Util
 *
 * @author Diffblue JCover
 */

public class MD5UtilDiffblueTest {

    @Test(timeout=10000)
    public void compareMd5() throws java.io.IOException, javax.servlet.ServletException {
        Map<String, String> clientMd5Map = new HashMap<String, String>();
        ((HashMap<String, String>)clientMd5Map).put("foo", "");
        assertTrue(MD5Util.compareMd5(new MockHttpServletRequest(), new MockHttpServletResponse(), clientMd5Map).isEmpty());
    }

//    @Test(timeout=10000)
//    public void compareMd5() throws java.io.IOException, javax.servlet.ServletException {  <-- method compareMd5() is already defined in class com.alibaba.nacos.config.server.utils.MD5UtilTest
//        assertTrue(MD5Util.compareMd5(new MockHttpServletRequest(), new MockHttpServletResponse(), new HashMap<String, String>()).isEmpty());
//    }
//
    @Test(timeout=10000)
    public void compareMd5ClientMd5MapIsFooReturnsBar() throws java.io.IOException, javax.servlet.ServletException {
        Map<String, String> clientMd5Map = new HashMap<String, String>();
        ((HashMap<String, String>)clientMd5Map).put("bar", "foo");
        assertThat(MD5Util.compareMd5(new MockHttpServletRequest(), new MockHttpServletResponse(), clientMd5Map).size(), is(1));
        assertThat(MD5Util.compareMd5(new MockHttpServletRequest(), new MockHttpServletResponse(), clientMd5Map).get(0), is("bar"));
    }

    @Test(timeout=10000)
    public void compareMd5OldResultChangedGroupKeysIsDiffblue() {
        List<String> changedGroupKeys = new ArrayList<String>();
        ((ArrayList<String>)changedGroupKeys).add("Diffblue");
        assertThat(MD5Util.compareMd5OldResult(changedGroupKeys), is("null:Diffblue;"));
    }

    @Test(timeout=10000)
    public void compareMd5OldResultChangedGroupKeysIsEmptyReturnsEmpty() {
        assertThat(MD5Util.compareMd5OldResult(new ArrayList<String>()), is(""));
    }

    @Test(timeout=10000)
    public void compareMd5ResultStringChangedGroupKeysIsDiffblue() throws java.io.IOException {
        List<String> changedGroupKeys = new ArrayList<String>();
        ((ArrayList<String>)changedGroupKeys).add("Diffblue");
        assertThat(MD5Util.compareMd5ResultString(changedGroupKeys), is("null%02Diffblue%01"));
    }

    @Test(timeout=10000)
    public void compareMd5ResultStringChangedGroupKeysIsEmptyReturnsEmpty() throws java.io.IOException {
        assertThat(MD5Util.compareMd5ResultString(new ArrayList<String>()), is(""));
    }

    @Test(timeout=10000)
    public void copy() throws java.io.IOException {
        assertThat(MD5Util.copy(new StringReader("foo"), new StringWriter()), is(3L));
        assertThat(MD5Util.copy(new StringReader(""), new StringWriter()), is(0L));
    }

    @Test(timeout=10000)
    public void isEmpty() {
        assertThat(MD5Util.getClientMd5Map("").isEmpty(), is(true));
        assertThat(MD5Util.getClientMd5Map("foo").isEmpty(), is(true));
    }

    @Test(timeout=10000)
    public void toStringReturnsFoo() throws java.io.IOException {
        assertThat(MD5Util.toString(new StringReader("foo")), is("foo"));
    }
}
