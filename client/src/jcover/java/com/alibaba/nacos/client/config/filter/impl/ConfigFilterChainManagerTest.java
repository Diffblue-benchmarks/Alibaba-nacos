package com.alibaba.nacos.client.config.filter.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.nacos.api.config.filter.IConfigFilter;
import com.alibaba.nacos.api.config.filter.IConfigRequest;
import com.alibaba.nacos.api.config.filter.IConfigResponse;

import org.junit.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.filter.impl.ConfigFilterChainManager
 *
 * @author Diffblue JCover
 */

public class ConfigFilterChainManagerTest {

    @Test(timeout=10000)
    public void addFilter() {
        ConfigFilterChainManager configFilterChainManager = new ConfigFilterChainManager();
        IConfigFilter filter = mock(IConfigFilter.class);
        assertThat(configFilterChainManager.addFilter(filter), sameInstance(configFilterChainManager));
    }

    @Test(timeout=10000)
    public void doFilter() throws com.alibaba.nacos.api.exception.NacosException {
        IConfigRequest request = mock(IConfigRequest.class);
        IConfigResponse response = mock(IConfigResponse.class);
        new ConfigFilterChainManager().doFilter(request, response);
    }
}
