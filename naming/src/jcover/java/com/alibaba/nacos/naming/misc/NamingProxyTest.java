package com.alibaba.nacos.naming.misc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.HashMap;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.misc.NamingProxy
 *
 * @author Diffblue JCover
 */

public class NamingProxyTest {

    @Test(timeout=10000)
    public void reqAPI() throws Exception {
        assertThat(NamingProxy.reqAPI("Connection", new HashMap<String, String>(), "foo"), is(""));
        assertThat(NamingProxy.reqAPI("foo", new HashMap<String, String>(), " msg: "), is(""));
        assertThat(NamingProxy.reqAPI("foo", new HashMap<String, String>(), " msg: ", false), is(""));
        assertThat(NamingProxy.reqAPI("Connection", new HashMap<String, String>(), "foo", false), is(""));
        assertThat(NamingProxy.reqAPI("Connection", new HashMap<String, String>(), "foo", true), is(""));
    }

    @Test(timeout=10000)
    public void syncCheckSumsChecksumMapIsEmptyAndServerIsFoo() {
        NamingProxy.syncCheckSums(new HashMap<String, String>(), "foo");
    }

    @Test(timeout=10000)
    public void syncDataCurServerIsSomethingAndDataIsOneReturnsFalse() throws Exception {
        byte[] data = new byte[] { 1 };
        assertThat(NamingProxy.syncData(data, "something"), is(false));
    }
}
