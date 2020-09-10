package com.alibaba.nacos.client.config.filter.impl;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import com.alibaba.nacos.api.config.filter.IConfigFilter;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for com.alibaba.nacos.client.config.filter.impl.ConfigFilterChainManager
 *
 * @author Diffblue Cover
 */

class ConfigFilterChainManagerTest {

    @Test
    void addFilter() throws com.alibaba.nacos.api.exception.NacosException {
        ConfigFilterChainManager configFilterChainManager =
             new ConfigFilterChainManager();
        IConfigFilter filter = mock(IConfigFilter.class);
        assertThat(configFilterChainManager.addFilter(filter), sameInstance(configFilterChainManager));
    }

    @Test
    void doFilter() throws com.alibaba.nacos.api.exception.NacosException {
        new ConfigFilterChainManager().doFilter(new ConfigRequest(), new ConfigResponse());
    }
}
