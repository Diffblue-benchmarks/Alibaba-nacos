package com.alibaba.nacos.config.server.model;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.config.server.model.ConfigInfoBase
 *
 * @author Diffblue Cover
 */

class ConfigInfoBaseTest {

    @Test
    void factory() {
        ConfigInfoBase configInfoBase = new ConfigAllInfo();
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
    void compareTo1() {
        ConfigInfoBase configInfoBase = new ConfigAllInfo();
        configInfoBase.setDataId("bar");
        ConfigInfo o = new ConfigAllInfo();
        o.setDataId("1234");
        assertThat(configInfoBase.compareTo(o), is(49));
    }

    @Test
    void compareTo2() {
        ConfigInfoBase configInfoBase = new ConfigAllInfo();
        configInfoBase.setDataId("1234");
        configInfoBase.setGroup("bar");
        ConfigInfo o = new ConfigAllInfo();
        o.setDataId("1234");
        o.setGroup("/some/path.html");
        assertThat(configInfoBase.compareTo(o), is(51));
    }

    @Test
    void compareToOIsNullReturnsOne() {
        assertThat(new ConfigAllInfo().compareTo((ConfigInfo) null), is(1));
    }

    @Test
    void compareToReturnsMinusOne1() {
        ConfigInfoBase configInfoBase = new ConfigAllInfo();
        configInfoBase.setDataId("1234");
        ConfigInfo o = new ConfigAllInfo();
        o.setDataId("1234");
        o.setGroup("/some/path.html");
        assertThat(configInfoBase.compareTo(o), is(-1));
    }

    @Test
    void compareToReturnsMinusOne2() {
        ConfigInfoBase configInfoBase = new ConfigAllInfo();
        configInfoBase.setDataId("1234");
        configInfoBase.setGroup("/some/path.html");
        ConfigInfo o = new ConfigAllInfo();
        o.setContent("hello");
        o.setDataId("1234");
        o.setGroup("/some/path.html");
        assertThat(configInfoBase.compareTo(o), is(-1));
    }

    @Test
    void compareToReturnsMinusOne3() {
        ConfigInfo o = new ConfigAllInfo();
        o.setDataId("1234");
        assertThat(new ConfigAllInfo().compareTo(o), is(-1));
    }

    @Test
    void compareToReturnsMinusSix() {
        ConfigInfoBase configInfoBase = new ConfigAllInfo();
        configInfoBase.setContent("bar");
        configInfoBase.setDataId("1234");
        configInfoBase.setGroup("/some/path.html");
        ConfigInfo o = new ConfigAllInfo();
        o.setContent("hello");
        o.setDataId("1234");
        o.setGroup("/some/path.html");
        assertThat(configInfoBase.compareTo(o), is(-6));
    }

    @Test
    void compareToReturnsOne1() {
        ConfigInfoBase configInfoBase = new ConfigAllInfo();
        configInfoBase.setContent("hello");
        configInfoBase.setDataId("1234");
        configInfoBase.setGroup("/some/path.html");
        ConfigInfo o = new ConfigAllInfo();
        o.setDataId("1234");
        o.setGroup("/some/path.html");
        assertThat(configInfoBase.compareTo(o), is(1));
    }

    @Test
    void compareToReturnsOne2() {
        ConfigInfoBase configInfoBase = new ConfigAllInfo();
        configInfoBase.setDataId("1234");
        assertThat(configInfoBase.compareTo(new ConfigAllInfo()), is(1));
    }

    @Test
    void compareToReturnsOne3() {
        ConfigInfoBase configInfoBase = new ConfigAllInfo();
        configInfoBase.setDataId("1234");
        configInfoBase.setGroup("/some/path.html");
        ConfigInfo o = new ConfigAllInfo();
        o.setDataId("1234");
        assertThat(configInfoBase.compareTo(o), is(1));
    }

    @Test
    void compareToReturnsZero1() {
        ConfigInfoBase configInfoBase = new ConfigAllInfo();
        configInfoBase.setContent("hello");
        configInfoBase.setDataId("1234");
        configInfoBase.setGroup("/some/path.html");
        ConfigInfo o = new ConfigAllInfo();
        o.setContent("hello");
        o.setDataId("1234");
        o.setGroup("/some/path.html");
        assertThat(configInfoBase.compareTo(o), is(0));
    }

    @Test
    void compareToReturnsZero2() {
        ConfigInfoBase configInfoBase = new ConfigAllInfo();
        configInfoBase.setDataId("1234");
        configInfoBase.setGroup("/some/path.html");
        ConfigInfo o = new ConfigAllInfo();
        o.setDataId("1234");
        o.setGroup("/some/path.html");
        assertThat(configInfoBase.compareTo(o), is(0));
    }

    @Test
    void testEquals() {
        assertThat(new ConfigAllInfo().equals(new Object()), is(false));
        assertThat(new ConfigAllInfo().equals(null), is(false));
    }
}
