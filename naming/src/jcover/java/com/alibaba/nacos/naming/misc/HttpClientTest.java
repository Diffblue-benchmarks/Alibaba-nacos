package com.alibaba.nacos.naming.misc;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.naming.misc.HttpClient
 *
 * @author Diffblue Cover
 */

public class HttpClientTest {

    @Test
    public void httpDelete1() {
        // pojo HttpClient.HttpResult HttpClient.httpDelete("/some/path.html", new ArrayList<String>(), new HashMap<String, String>())
    }

    @Test
    public void httpDelete2() {
        HashMap<String, String> paramValues = new HashMap<String, String>();
        paramValues.put("", "foo");
        // pojo HttpClient.HttpResult HttpClient.httpDelete("/some/path.html", new ArrayList<String>(), paramValues)
    }

    @Test
    public void httpDelete3() {
        HashMap<String, String> paramValues = new HashMap<String, String>();
        paramValues.put("", "");
        // pojo HttpClient.HttpResult HttpClient.httpDelete("/some/path.html", new ArrayList<String>(), paramValues)
    }

    @Test
    public void httpGetHeadersIsEmpty() {
        HashMap<String, String> paramValues = new HashMap<String, String>();
        paramValues.put("", "foo");
        // pojo HttpClient.HttpResult HttpClient.httpGet("/some/path.html", new ArrayList<String>(), paramValues)
    }

    @Test
    public void httpPost1() {
        // pojo HttpClient.HttpResult HttpClient.httpPost("/some/path.html", new ArrayList<String>(), new HashMap<String, String>())
    }

    @Test
    public void httpPost2() {
        HashMap<String, String> paramValues = new HashMap<String, String>();
        paramValues.put("", "foo");
        // pojo HttpClient.HttpResult HttpClient.httpPost("/some/path.html", new ArrayList<String>(), paramValues)
    }

    @Test
    public void httpPutLarge1() {
        byte[] content = new byte[] { 1 };
        // pojo HttpClient.HttpResult HttpClient.httpPutLarge("/some/path.html", new HashMap<String, String>(), content)
    }

    @Test
    public void httpPutLarge2() {
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("", "foo");
        byte[] content = new byte[] { 1 };
        // pojo HttpClient.HttpResult HttpClient.httpPutLarge("/some/path.html", headers, content)
    }

    @Test
    public void httpGetLarge1() {
        // pojo HttpClient.HttpResult HttpClient.httpGetLarge("/some/path.html", new HashMap<String, String>(), "/some/path.html")
    }

    @Test
    public void httpGetLarge2() {
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("", "foo");
        // pojo HttpClient.HttpResult HttpClient.httpGetLarge("/some/path.html", headers, "/some/path.html")
    }

    @Test
    public void httpPostLarge1() {
        // pojo HttpClient.HttpResult HttpClient.httpPostLarge("/some/path.html", new HashMap<String, String>(), "/some/path.html")
    }

    @Test
    public void httpPostLarge2() {
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("", "foo");
        // pojo HttpClient.HttpResult HttpClient.httpPostLarge("/some/path.html", headers, "/some/path.html")
    }

    @Test
    public void encodingParams1() throws java.io.UnsupportedEncodingException {
        assertThat(HttpClient.encodingParams(new HashMap<String, String>(), "/some/path.html"), is(nullValue()));
    }

    @Test
    public void encodingParams2() throws java.io.UnsupportedEncodingException {
        assertThat(HttpClient.encodingParams(null, "1"), is(nullValue()));
    }

    @Test
    public void translateParameterMapReturnsEmpty() {
        assertThat(HttpClient.translateParameterMap(new HashMap<String, String[]>()).isEmpty(), is(true));
    }
}
