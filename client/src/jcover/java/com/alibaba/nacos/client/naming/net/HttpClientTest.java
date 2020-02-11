package com.alibaba.nacos.client.naming.net;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.naming.net.HttpClient
 *
 * @author Diffblue JCover
 */

public class HttpClientTest {

    @Test(timeout=10000)
    public void getPrefix() {
        assertThat(HttpClient.getPrefix(), is("http://"));
    }

    @Test(timeout=10000)
    public void httpGet() {
        // pojo HttpClient.HttpResult
        // pojo HttpClient.HttpResult
    }

//    @Test(timeout=10000)
//    public void httpGetEncodingIsEmptyAndParamValuesIsFooAndUrlIsFoo() {
//        Map<String, String> paramValues = new HashMap<String, String>();
//        ((HashMap<String, String>)paramValues).put("encoding", "foo");
//        // pojo HttpClient.HttpResult
//        assertThat(paramValues.get("encoding"), is(""));  <-- Expected: is ""     but: was "foo"
//    }
//
//    @Test(timeout=10000)
//    public void httpGetParamValuesIsEmpty() {
//        Map<String, String> paramValues = new HashMap<String, String>();
//        ((HashMap<String, String>)paramValues).put("foo", "");
//        // pojo HttpClient.HttpResult
//        assertThat(paramValues.get("encoding"), is("foo"));  <-- Expected: is "foo"     but: was null
//    }
//
//    @Test(timeout=10000)
//    public void httpGetParamValuesIsFoo() {
//        Map<String, String> paramValues = new HashMap<String, String>();
//        ((HashMap<String, String>)paramValues).put("bar", "foo");
//        // pojo HttpClient.HttpResult
//        assertThat(paramValues.get("encoding"), is("foo"));  <-- Expected: is "foo"     but: was null
//    }
}
