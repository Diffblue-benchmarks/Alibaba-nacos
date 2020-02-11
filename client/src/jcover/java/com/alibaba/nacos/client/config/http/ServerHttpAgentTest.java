package com.alibaba.nacos.client.config.http;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;

import com.alibaba.nacos.client.config.impl.ServerListManager;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.http.ServerHttpAgent
 *
 * @author Diffblue JCover
 */

public class ServerHttpAgentTest {

    @Test(timeout=10000)
    public void getAppnameReturnsUnknown() {
        assertThat(ServerHttpAgent.getAppname(), is("unknown"));
    }

    @Test(timeout=10000)
    public void getEncodeReturnsNull() {
        assertThat(new ServerHttpAgent(new ServerListManager()).getEncode(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void getNameReturnsDefault() {
        assertThat(new ServerHttpAgent(new ServerListManager()).getName(), is("default"));
    }

    @Test(timeout=10000)
    public void getNamespaceReturnsEmpty() {
        assertThat(new ServerHttpAgent(new ServerListManager()).getNamespace(), is(""));
    }

    @Test(timeout=10000)
    public void getTenantReturnsEmpty() {
        assertThat(new ServerHttpAgent(new ServerListManager()).getTenant(), is(""));
    }
}
