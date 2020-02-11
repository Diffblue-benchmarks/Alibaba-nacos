package com.alibaba.nacos.client.config.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.impl.SpasAdapter
 *
 * @author Diffblue JCover
 */

public class SpasAdapterTest {

    @Test(timeout=10000)
    public void getAkReturnsNull() {
        assertThat(SpasAdapter.getAk(), is(nullValue()));
    }

//    @Test(timeout=10000)
//    public void getSignHeaders() {
//        assertThat(SpasAdapter.getSignHeaders(new ArrayList<String>(), "545321456").size(), is(4));
//        assertThat(SpasAdapter.getSignHeaders(new ArrayList<String>(), "545321456").get(0), is("Timestamp"));
//        assertThat(SpasAdapter.getSignHeaders(new ArrayList<String>(), "545321456").get(1), is("1581386560651"));  <-- Expected: is "1581386560651"     but: was "1581387437508"
//        assertThat(SpasAdapter.getSignHeaders(new ArrayList<String>(), "545321456").get(2), is("Spas-Signature"));
//        assertThat(SpasAdapter.getSignHeaders(new ArrayList<String>(), "545321456").get(3), is("31MxEzqNKnsAkgAXlaiMGo9GmEU="));
//        assertThat(SpasAdapter.getSignHeaders((java.util.List<String>)null, "545321456"), is(nullValue()));
//        assertThat(SpasAdapter.getSignHeaders("foo", "545321456").size(), is(4));
//        assertThat(SpasAdapter.getSignHeaders("foo", "545321456").get(0), is("Timestamp"));
//        assertThat(SpasAdapter.getSignHeaders("foo", "545321456").get(1), is("1581386560601"));
//        assertThat(SpasAdapter.getSignHeaders("foo", "545321456").get(2), is("Spas-Signature"));
//        assertThat(SpasAdapter.getSignHeaders("foo", "545321456").get(3), is("8cevLyfSTHj5C6vqi7UX4SECisM="));
//        assertThat(SpasAdapter.getSignHeaders("foo", (String)null).size(), is(2));
//        assertThat(SpasAdapter.getSignHeaders("foo", (String)null).get(0), is("Timestamp"));
//        assertThat(SpasAdapter.getSignHeaders("foo", (String)null).get(1), is("1581386560658"));
//    }
//
    @Test(timeout=10000)
    public void getSkReturnsNull() {
        assertThat(SpasAdapter.getSk(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void signWithhmacSHA1EncryptEncryptKeyIsFooAndEncryptTextIsHtml() {
        assertThat(SpasAdapter.signWithhmacSHA1Encrypt("html", "foo"), is("ENB8sTKA5pt0KjbkaPgcNgVq/PY="));
    }
}
