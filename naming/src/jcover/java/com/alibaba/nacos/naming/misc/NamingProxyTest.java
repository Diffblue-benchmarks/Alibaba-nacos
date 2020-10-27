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
    public void syncCheckSums() {
        NamingProxy.syncCheckSums(new HashMap<String, String>(), "/some/path.html");
    }

    @Test
    public void syncDataCurServerIsConnectionAndDataIsOneReturnsFalse() throws Exception {
        byte[] data = new byte[] { 1 };
        assertThat(NamingProxy.syncData(data, "Connection"), is(false));
    }

    @Test
    public void reqAPI1() throws Exception {
        assertThat(NamingProxy.reqAPI("foo", new HashMap<String, String>(), "/some/path.html"), is(""));
    }

    @Test
    public void reqAPI2() throws Exception {
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("", "foo");
        assertThat(NamingProxy.reqAPI("foo", params, " msg: "), is(""));
    }

    @Test
    public void reqAPIIsPostIsFalse1() throws Exception {
        assertThat(NamingProxy.reqAPI("foo", new HashMap<String, String>(), "/some/path.html", false), is(""));
    }

    @Test
    public void reqAPIIsPostIsFalse2() throws Exception {
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("", "foo");
        assertThat(NamingProxy.reqAPI("foo", params, " msg: ", false), is(""));
    }

    @Test
    public void reqAPIIsPostIsTrue() throws Exception {
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("", "foo");
        assertThat(NamingProxy.reqAPI("foo", params, "/some/path.html", true), is(""));
    }
}
