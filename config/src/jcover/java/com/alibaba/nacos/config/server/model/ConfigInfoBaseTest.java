package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigInfoBase
 *
 * @author Diffblue Cover
 */

class ConfigInfoBaseTest {

    @Test
    void factory1() {
        ConfigInfoBase configInfoBase = new ConfigInfoBase();
        configInfoBase.setContent("hello");
        configInfoBase.setDataId("1234");
        configInfoBase.setGroup("bar");
        configInfoBase.setId(1L);
        configInfoBase.setMd5("foo");
        assertThat(configInfoBase.getContent(), is("hello"));
        assertThat(configInfoBase.getDataId(), is("1234"));
        assertThat(configInfoBase.getGroup(), is("bar"));
        assertThat(configInfoBase.getId(), is(1L));
        assertThat(configInfoBase.getMd5(), is("foo"));
    }

    @Test
    void factory2() {
        ConfigInfoBase configInfoBase =
             new ConfigInfoBase("1234", "bar", null);
        configInfoBase.setContent("hello");
        configInfoBase.setDataId("1234");
        configInfoBase.setGroup("/some/path.html");
        configInfoBase.setId(1L);
        configInfoBase.setMd5("/some/path.html");
        assertThat(configInfoBase.getContent(), is("hello"));
        assertThat(configInfoBase.getDataId(), is("1234"));
        assertThat(configInfoBase.getGroup(), is("/some/path.html"));
        assertThat(configInfoBase.getId(), is(1L));
        assertThat(configInfoBase.getMd5(), is("/some/path.html"));
    }

    @Test
    void factory3() {
        ConfigInfoBase configInfoBase =
             new ConfigInfoBase("1234", "bar", "hello");
        configInfoBase.setContent("hello");
        configInfoBase.setDataId("1234");
        configInfoBase.setGroup("foo");
        configInfoBase.setId(1L);
        configInfoBase.setMd5("/some/path.html");
        assertThat(configInfoBase.getContent(), is("hello"));
        assertThat(configInfoBase.getDataId(), is("1234"));
        assertThat(configInfoBase.getGroup(), is("foo"));
        assertThat(configInfoBase.getId(), is(1L));
        assertThat(configInfoBase.getMd5(), is("/some/path.html"));
    }

    @Test
    void dump() {
        ConfigInfoBase configInfoBase = new ConfigInfoBase();
        configInfoBase.setContent("hello");
        configInfoBase.dump(new PrintWriter(new ByteArrayOutputStream()));
    }

    @Test
    void compareTo1() {
        ConfigInfoBase configInfoBase = new ConfigInfoBase();
        configInfoBase.setDataId("bar");
        ConfigInfoBase o = new ConfigInfoBase();
        o.setDataId("1234");
        assertThat(configInfoBase.compareTo(o), is(49));
    }

    @Test
    void compareTo2() {
        ConfigInfoBase configInfoBase = new ConfigInfoBase();
        configInfoBase.setDataId("1234");
        configInfoBase.setGroup("bar");
        ConfigInfoBase o = new ConfigInfoBase();
        o.setDataId("1234");
        o.setGroup("/some/path.html");
        assertThat(configInfoBase.compareTo(o), is(51));
    }

    @Test
    void compareTo3() {
        assertThat(new ConfigInfoBase().compareTo((ConfigInfoBase) null), is(1));
        assertThat(new ConfigInfoBase().compareTo(new ConfigInfoBase()), is(0));
    }

    @Test
    void compareToReturnsMinusOne1() {
        ConfigInfoBase configInfoBase = new ConfigInfoBase();
        configInfoBase.setDataId("1234");
        configInfoBase.setGroup("/some/path.html");
        ConfigInfoBase o = new ConfigInfoBase();
        o.setContent("hello");
        o.setDataId("1234");
        o.setGroup("/some/path.html");
        assertThat(configInfoBase.compareTo(o), is(-1));
    }

    @Test
    void compareToReturnsMinusOne2() {
        ConfigInfoBase o = new ConfigInfoBase();
        o.setDataId("1234");
        assertThat(new ConfigInfoBase().compareTo(o), is(-1));
    }

    @Test
    void compareToReturnsMinusOne3() {
        ConfigInfoBase configInfoBase = new ConfigInfoBase();
        configInfoBase.setDataId("1234");
        ConfigInfoBase o = new ConfigInfoBase();
        o.setDataId("1234");
        o.setGroup("/some/path.html");
        assertThat(configInfoBase.compareTo(o), is(-1));
    }

    @Test
    void compareToReturnsMinusSix() {
        ConfigInfoBase configInfoBase = new ConfigInfoBase();
        configInfoBase.setContent("bar");
        configInfoBase.setDataId("1234");
        configInfoBase.setGroup("/some/path.html");
        ConfigInfoBase o = new ConfigInfoBase();
        o.setContent("hello");
        o.setDataId("1234");
        o.setGroup("/some/path.html");
        assertThat(configInfoBase.compareTo(o), is(-6));
    }

    @Test
    void compareToReturnsOne1() {
        ConfigInfoBase configInfoBase = new ConfigInfoBase();
        configInfoBase.setContent("hello");
        configInfoBase.setDataId("1234");
        configInfoBase.setGroup("/some/path.html");
        ConfigInfoBase o = new ConfigInfoBase();
        o.setDataId("1234");
        o.setGroup("/some/path.html");
        assertThat(configInfoBase.compareTo(o), is(1));
    }

    @Test
    void compareToReturnsOne2() {
        ConfigInfoBase configInfoBase = new ConfigInfoBase();
        configInfoBase.setDataId("1234");
        assertThat(configInfoBase.compareTo(new ConfigInfoBase()), is(1));
    }

    @Test
    void compareToReturnsOne3() {
        ConfigInfoBase configInfoBase = new ConfigInfoBase();
        configInfoBase.setDataId("1234");
        configInfoBase.setGroup("/some/path.html");
        ConfigInfoBase o = new ConfigInfoBase();
        o.setDataId("1234");
        assertThat(configInfoBase.compareTo(o), is(1));
    }

    @Test
    void compareToReturnsZero1() {
        ConfigInfoBase configInfoBase = new ConfigInfoBase();
        configInfoBase.setContent("hello");
        configInfoBase.setDataId("1234");
        configInfoBase.setGroup("/some/path.html");
        ConfigInfoBase o = new ConfigInfoBase();
        o.setContent("hello");
        o.setDataId("1234");
        o.setGroup("/some/path.html");
        assertThat(configInfoBase.compareTo(o), is(0));
    }

    @Test
    void compareToReturnsZero2() {
        ConfigInfoBase configInfoBase = new ConfigInfoBase();
        configInfoBase.setDataId("1234");
        configInfoBase.setGroup("/some/path.html");
        ConfigInfoBase o = new ConfigInfoBase();
        o.setDataId("1234");
        o.setGroup("/some/path.html");
        assertThat(configInfoBase.compareTo(o), is(0));
    }

    @Test
    void compareToReturnsZero3() {
        ConfigInfoBase configInfoBase = new ConfigInfoBase();
        configInfoBase.setDataId("1234");
        ConfigInfoBase o = new ConfigInfoBase();
        o.setDataId("1234");
        assertThat(configInfoBase.compareTo(o), is(0));
    }

    @Test
    void testEquals() {
        assertThat(new ConfigInfoBase().equals(new Object()), is(false));
        assertThat(new ConfigInfoBase().equals(null), is(false));
    }
}
