package com.alibaba.nacos.config.server.utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.utils.StringUtils
 *
 * @author Diffblue Cover
 */

class StringUtilsTest {

    @Test
    void isBlank() {
        assertThat(StringUtils.isBlank("bar"), is(false));
        assertThat(StringUtils.isBlank(""), is(true));
        assertThat(StringUtils.isBlank(null), is(true));
    }

    @Test
    void isNotEmpty() {
        assertThat(StringUtils.isNotEmpty("bar"), is(true));
        assertThat(StringUtils.isNotEmpty(""), is(false));
        assertThat(StringUtils.isNotEmpty(null), is(false));
    }

    @Test
    void isEmpty() {
        assertThat(StringUtils.isEmpty("bar"), is(false));
        assertThat(StringUtils.isEmpty(""), is(true));
    }

    @Test
    void defaultIfEmpty() {
        assertThat(StringUtils.defaultIfEmpty("", "bar"), is("bar"));
        assertThat(StringUtils.defaultIfEmpty("bar", "foo"), is("bar"));
    }

    @Test
    void testEquals() {
        assertThat(StringUtils.equals("foo=bar", "foo=bar"), is(true));
        assertThat(StringUtils.equals("bar", "foo=bar"), is(false));
        assertThat(StringUtils.equals(null, "bar"), is(false));
        assertThat(StringUtils.equals(null, null), is(true));
    }

    @Test
    void substringBetween() {
        assertThat(StringUtils.substringBetween("foo=bar", "foo=bar", null), is(nullValue()));
        assertThat(StringUtils.substringBetween("foo=bar", "bar", "foo=bar"), is(nullValue()));
        assertThat(StringUtils.substringBetween("foo=bar", "", "foo=bar"), is(""));
        assertThat(StringUtils.substringBetween("foo=bar", null, "foo=bar"), is(nullValue()));
        assertThat(StringUtils.substringBetween("bar", "foo=bar", "foo=bar"), is(nullValue()));
        assertThat(StringUtils.substringBetween(null, "foo=bar", "foo=bar"), is(nullValue()));
    }
}
