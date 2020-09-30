package com.alibaba.nacos.naming.misc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.HashMap;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.misc.NamingProxy
 *
 * @author Diffblue Cover
 */

public class NamingProxyTest {

    @Test
    public void syncCheckSumsChecksumMapIsEmpty() {
        NamingProxy.syncCheckSums(new HashMap<String, String>(), "/some/path.html");
    }

    @Test
    public void syncDataCurServerIsConnectionAndDataIsOneReturnsFalse() throws Exception {
        byte[] data = new byte[] { 1 };
        assertThat(NamingProxy.syncData(data, "Connection"), is(false));
    }

    @Test
    public void reqAPIApiIsConnection() throws Exception {
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("foo", "foo");
        assertThat(NamingProxy.reqAPI("Connection", params, " msg: "), is(""));
        assertThat(params.get("encoding"), is("UTF-8"));
        assertThat(params.get("nofix"), is("1"));
    }

    @Test
    public void reqAPIApiIsConnectionAndCurServerIsNamingProxy() throws Exception {
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("foo", "foo");
        assertThat(NamingProxy.reqAPI("Connection", params, "NamingProxy"), is(""));
        assertThat(params.get("encoding"), is("UTF-8"));
        assertThat(params.get("nofix"), is("1"));
    }

    @Test
    public void reqAPICurServerIsConnectionAndIsPostIsFalse() throws Exception {
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("foo", "foo");
        assertThat(NamingProxy.reqAPI("foo", params, "Connection", false), is(""));
        assertThat(params.get("encoding"), is("UTF-8"));
        assertThat(params.get("nofix"), is("1"));
    }

    @Test
    public void reqAPIIsPostIsFalse() throws Exception {
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("foo", "foo");
        assertThat(NamingProxy.reqAPI("foo", params, " msg: ", false), is(""));
        assertThat(params.get("encoding"), is("UTF-8"));
        assertThat(params.get("nofix"), is("1"));
    }

    @Test
    public void reqAPIIsPostIsTrueAndParamsIsEmpty() throws Exception {
        assertThat(NamingProxy.reqAPI("foo", new HashMap<String, String>(), "/some/path.html", true), is(""));
    }
}
