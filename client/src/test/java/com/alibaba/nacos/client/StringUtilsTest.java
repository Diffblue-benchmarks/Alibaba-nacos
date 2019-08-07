package com.alibaba.nacos.client;

import com.alibaba.nacos.client.utils.StringUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.Assert.*;
import static com.alibaba.nacos.client.utils.StringUtils.*;

public class StringUtilsTest {

    @Test
    public void testisNotBlank() {
        assertTrue(isNotBlank("foo"));

        assertFalse(isNotBlank(" "));
        assertFalse(isNotBlank(null));
    }

    @Test
    public void testIsNotEmpty() {
        assertFalse(isNotEmpty(""));

        assertTrue(isNotEmpty("foo"));
    }

    @Test
    public void testDefaultIfEmpty() {
        assertEquals("foo", defaultIfEmpty("", "foo"));
        assertEquals("bar", defaultIfEmpty("bar", "foo"));
    }

    @Test
    public void testEquals() {
        assertTrue(StringUtils.equals("foo", "foo"));

        assertFalse(StringUtils.equals("bar", "foo"));
        assertFalse(StringUtils.equals(" ", "foo"));
        assertFalse(StringUtils.equals("foo", null));
    }

    @Test
    public void testSubstringBetween() {
        assertNull(substringBetween(null, null, null));
        assertNull(substringBetween("", "foo", ""));
        assertNull(substringBetween("foo", "bar", "baz"));

        assertEquals("", substringBetween("foo", "foo", ""));
    }

    @Test
    public void testJoin() {
        assertNull(join(null, ""));

        Collection collection = new ArrayList();
        collection.add("foo");
        collection.add("bar");
        assertEquals("foo,bar", join(collection, ","));
    }

    @Test
    public void testEscapeJavaScript() {
        assertNull( null , StringUtils.escapeJavaScript(null));

        assertEquals("1", StringUtils.escapeJavaScript("1"));
        assertEquals("\\'", StringUtils.escapeJavaScript("'"));
        assertEquals("\\\"", StringUtils.escapeJavaScript("\""));
        assertEquals("\\/", StringUtils.escapeJavaScript("/"));
        assertEquals("\\u008A\\u0000", StringUtils.escapeJavaScript("\u008a\u0000"));
        assertEquals("o\\b", StringUtils.escapeJavaScript("o\b"));
        assertEquals( "\\r\\u0002", StringUtils.escapeJavaScript("\r\u0002"));
        assertEquals( "\\r\\f", StringUtils.escapeJavaScript("\r\f"));
        assertEquals( "\\u000E\\n", StringUtils.escapeJavaScript("\u000E\n"));
        assertEquals( "\\t\\u00FD", StringUtils.escapeJavaScript("\t\u00fd"));
        assertEquals( "\\u07EF", StringUtils.escapeJavaScript("\u07ef"));
        assertEquals( "\\u07EF\\uC000", StringUtils.escapeJavaScript("\u07ef\uc000"));
        assertEquals( "\\u07EF\\\\", StringUtils.escapeJavaScript( "\u07ef\\"));
        assertEquals( "\\u001C\\\\", StringUtils.escapeJavaScript("\u001c\\"));
    }
}
