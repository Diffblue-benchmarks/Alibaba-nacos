package com.alibaba.nacos.client.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import java.util.Collection;
import java.util.LinkedList;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.utils.StringUtils
 *
 * @author Diffblue JCover
 */

public class StringUtilsDiffblueTest {

    @Test(timeout=10000)
    public void defaultIfEmpty() {
        assertThat(StringUtils.defaultIfEmpty("bar", "foo"), is("bar"));
        assertThat(StringUtils.defaultIfEmpty("", "foo"), is("foo"));
    }

    @Test(timeout=10000)
    public void escapeJavaScript() {
        assertThat(StringUtils.escapeJavaScript("foo"), is("foo"));
        assertThat(StringUtils.escapeJavaScript(null), is(nullValue()));
    }

    @Test(timeout=10000)
    public void isBlank() {
        assertThat(StringUtils.isBlank(""), is(true));
        assertThat(StringUtils.isBlank("foo"), is(false));
        assertThat(StringUtils.isBlank(null), is(true));
    }

    @Test(timeout=10000)
    public void isEmpty() {
        assertThat(StringUtils.isEmpty(""), is(true));
        assertThat(StringUtils.isEmpty("foo"), is(false));
        assertThat(StringUtils.isEmpty(null), is(true));
    }

    @Test(timeout=10000)
    public void isNotBlank() {
        assertThat(StringUtils.isNotBlank(""), is(false));
        assertThat(StringUtils.isNotBlank("foo"), is(true));
    }

    @Test(timeout=10000)
    public void isNotEmpty() {
        assertThat(StringUtils.isNotEmpty(""), is(false));
        assertThat(StringUtils.isNotEmpty("foo"), is(true));
    }

    @Test(timeout=10000)
    public void join() {
        assertThat(StringUtils.join(new LinkedList(), "bar"), is(""));
        assertThat(StringUtils.join(null, "bar"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void joinReturnsFoo() {
        Collection collection = new LinkedList();
        ((LinkedList)collection).add("foo");
        assertThat(StringUtils.join(collection, "bar"), is("foo"));
    }

    @Test(timeout=10000)
    public void substringBetween() {
        assertThat(StringUtils.substringBetween("foo", "foo", "bar"), is(nullValue()));
        assertThat(StringUtils.substringBetween("foo", "foo", null), is(nullValue()));
        assertThat(StringUtils.substringBetween("foo", "", "foo"), is(""));
        assertThat(StringUtils.substringBetween("foo", null, "foo"), is(nullValue()));
        assertThat(StringUtils.substringBetween("bar", "foo", "foo"), is(nullValue()));
        assertThat(StringUtils.substringBetween(null, "foo", "foo"), is(nullValue()));
    }

    @Test(timeout=10000)
    public void testequals() {
        assertThat(StringUtils.equals("bar", "foo"), is(false));
        assertThat(StringUtils.equals("foo", "foo"), is(true));
        assertThat(StringUtils.equals(null, null), is(true));
        assertThat(StringUtils.equals(null, "foo"), is(false));
    }
}
