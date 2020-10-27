package com.alibaba.nacos.client.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.utils.StringUtils
 *
 * @author Diffblue Cover
 */

class StringUtilsTest {

    @Test
    void isBlank() {
        assertThat(StringUtils.isBlank(""), is(true));
        assertThat(StringUtils.isBlank("foo"), is(false));
        assertThat(StringUtils.isBlank(null), is(true));
    }

    @Test
    void isNotBlank() {
        assertThat(StringUtils.isNotBlank(""), is(false));
        assertThat(StringUtils.isNotBlank("foo"), is(true));
    }

    @Test
    void isNotEmpty() {
        assertThat(StringUtils.isNotEmpty(""), is(false));
        assertThat(StringUtils.isNotEmpty("foo"), is(true));
        assertThat(StringUtils.isNotEmpty(null), is(false));
    }

    @Test
    void isEmpty() {
        assertThat(StringUtils.isEmpty(""), is(true));
        assertThat(StringUtils.isEmpty("foo"), is(false));
    }

    @Test
    void defaultIfEmpty() {
        assertThat(StringUtils.defaultIfEmpty("bar", "foo"), is("bar"));
        assertThat(StringUtils.defaultIfEmpty("", "foo"), is("foo"));
    }

    @Test
    void testEquals() {
        assertThat(StringUtils.equals("bar", "foo"), is(false));
        assertThat(StringUtils.equals("foo", "foo"), is(true));
        assertThat(StringUtils.equals(null, null), is(true));
        assertThat(StringUtils.equals(null, "foo"), is(false));
    }

    @Test
    void substringBetween() {
        assertThat(StringUtils.substringBetween("foo", "foo", "bar"), is(nullValue()));
        assertThat(StringUtils.substringBetween("foo", "foo", null), is(nullValue()));
        assertThat(StringUtils.substringBetween("foo", "", "foo"), is(""));
        assertThat(StringUtils.substringBetween("foo", null, "foo"), is(nullValue()));
        assertThat(StringUtils.substringBetween("bar", "foo", "foo"), is(nullValue()));
        assertThat(StringUtils.substringBetween(null, "foo", "foo"), is(nullValue()));
    }

    @Test
    void join() {
        assertThat(StringUtils.join(new LinkedList<String>(), "bar"), is(""));
        assertThat(StringUtils.join(null, "bar"), is(nullValue()));
    }

    @Test
    void joinCollectionIsFooReturnsFoo() {
        LinkedList<String> collection = new LinkedList<String>();
        collection.add("foo");
        assertThat(StringUtils.join(collection, "bar"), is("foo"));
    }

    @Test
    void escapeJavaScript() {
        assertThat(StringUtils.escapeJavaScript("foo"), is("foo"));
        assertThat(StringUtils.escapeJavaScript(null), is(nullValue()));
    }
}
