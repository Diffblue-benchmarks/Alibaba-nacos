package com.alibaba.nacos.client.naming.net;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.naming.net.HttpClient
 *
 * @author Diffblue Cover
 */

class HttpClientTest {

    @Test
    void getPrefix() {
        assertThat(HttpClient.getPrefix(), is("http://"));
    }

    @Test
    void httpGet1() {
        // pojo HttpClient.HttpResult HttpClient.httpGet("/some/path.html", new ArrayList<String>(), new HashMap<String, String>(), "/some/path.html")
    }

    @Test
    void httpGet2() {
        HashMap<String, String> paramValues = new HashMap<String, String>();
        paramValues.put("", "");
        // pojo HttpClient.HttpResult HttpClient.httpGet("/some/path.html", new ArrayList<String>(), paramValues, "/some/path.html")
    }

    @Test
    void httpGetUrlIsEmpty1() {
        HashMap<String, String> paramValues = new HashMap<String, String>();
        paramValues.put("", "foo");
        // pojo HttpClient.HttpResult HttpClient.httpGet("", new ArrayList<String>(), paramValues, "/some/path.html")
    }

    @Test
    void httpGetUrlIsEmpty2() {
        // pojo HttpClient.HttpResult HttpClient.httpGet("", new ArrayList<String>(), null, "/some/path.html")
    }
}
