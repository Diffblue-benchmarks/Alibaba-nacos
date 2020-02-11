package com.alibaba.nacos.client.config.http;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.http.MetricsHttpAgent
 *
 * @author Diffblue JCover
 */

public class MetricsHttpAgentTest {

    @Test(timeout=10000)
    public void getEncodeReturnsFoo() {
        HttpAgent httpAgent = mock(HttpAgent.class);
        when(httpAgent.getEncode())
            .thenReturn("foo")
            .thenReturn("foo")
            .thenReturn("foo");
        when(httpAgent.getName())
            .thenReturn("foo")
            .thenReturn("foo");
        when(httpAgent.getNamespace())
            .thenReturn("foo")
            .thenReturn("foo");
        when(httpAgent.getTenant())
            .thenReturn("foo")
            .thenReturn("foo");
        assertThat(new MetricsHttpAgent(httpAgent).getEncode(), is("foo"));
    }

    @Test(timeout=10000)
    public void getNameReturnsFoo() {
        HttpAgent httpAgent = mock(HttpAgent.class);
        when(httpAgent.getEncode())
            .thenReturn("foo")
            .thenReturn("foo");
        when(httpAgent.getName())
            .thenReturn("foo")
            .thenReturn("foo")
            .thenReturn("foo");
        when(httpAgent.getNamespace())
            .thenReturn("foo")
            .thenReturn("foo");
        when(httpAgent.getTenant())
            .thenReturn("foo")
            .thenReturn("foo");
        assertThat(new MetricsHttpAgent(httpAgent).getName(), is("foo"));
    }

    @Test(timeout=10000)
    public void getNamespaceReturnsFoo() {
        HttpAgent httpAgent = mock(HttpAgent.class);
        when(httpAgent.getEncode())
            .thenReturn("foo")
            .thenReturn("foo");
        when(httpAgent.getName())
            .thenReturn("foo")
            .thenReturn("foo");
        when(httpAgent.getNamespace())
            .thenReturn("foo")
            .thenReturn("foo")
            .thenReturn("foo");
        when(httpAgent.getTenant())
            .thenReturn("foo")
            .thenReturn("foo");
        assertThat(new MetricsHttpAgent(httpAgent).getNamespace(), is("foo"));
    }

    @Test(timeout=10000)
    public void getTenantReturnsFoo() {
        HttpAgent httpAgent = mock(HttpAgent.class);
        when(httpAgent.getEncode())
            .thenReturn("foo")
            .thenReturn("foo");
        when(httpAgent.getName())
            .thenReturn("foo")
            .thenReturn("foo");
        when(httpAgent.getNamespace())
            .thenReturn("foo")
            .thenReturn("foo");
        when(httpAgent.getTenant())
            .thenReturn("foo")
            .thenReturn("foo")
            .thenReturn("foo");
        assertThat(new MetricsHttpAgent(httpAgent).getTenant(), is("foo"));
    }

    @Test(timeout=10000)
    public void httpDeleteHeadersIsEmptyAndParamValuesIsEmptyAndPathIsDELETEAndReadTimeoutMsIsOneReturnsNull() throws java.io.IOException {
        HttpAgent httpAgent = mock(HttpAgent.class);
        assertThat(new MetricsHttpAgent(httpAgent).httpDelete("DELETE", new ArrayList<String>(), new ArrayList<String>(), " ", 1L), is(nullValue()));
    }

    @Test(timeout=10000)
    public void httpGetEncodingIsFooAndHeadersIsEmptyAndParamValuesIsEmptyAndPathIsGETAndReadTimeoutMsIsOneReturnsNull() throws java.io.IOException {
        HttpAgent httpAgent = mock(HttpAgent.class);
        assertThat(new MetricsHttpAgent(httpAgent).httpGet("GET", new ArrayList<String>(), new ArrayList<String>(), "foo", 1L), is(nullValue()));
    }

    @Test(timeout=10000)
    public void httpPostHeadersIsEmptyAndParamValuesIsEmptyAndPathIsNAAndReadTimeoutMsIsOneReturnsNull() throws java.io.IOException {
        HttpAgent httpAgent = mock(HttpAgent.class);
        assertThat(new MetricsHttpAgent(httpAgent).httpPost("NA", new ArrayList<String>(), new ArrayList<String>(), "OX13QD", 1L), is(nullValue()));
    }

    @Test(timeout=10000)
    public void start() throws com.alibaba.nacos.api.exception.NacosException {
        HttpAgent httpAgent = mock(HttpAgent.class);
        when(httpAgent.getEncode())
            .thenReturn("foo")
            .thenReturn("foo");
        when(httpAgent.getName())
            .thenReturn("foo")
            .thenReturn("foo");
        when(httpAgent.getNamespace())
            .thenReturn("foo")
            .thenReturn("foo");
        when(httpAgent.getTenant())
            .thenReturn("foo")
            .thenReturn("foo");
        new MetricsHttpAgent(httpAgent).start();
    }
}
