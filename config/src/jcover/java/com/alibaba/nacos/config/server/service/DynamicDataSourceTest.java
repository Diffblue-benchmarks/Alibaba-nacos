package com.alibaba.nacos.config.server.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.springframework.context.ApplicationContext;

/**
 * Unit tests for com.alibaba.nacos.config.server.service.DynamicDataSource
 *
 * @author Diffblue JCover
 */

public class DynamicDataSourceTest {

    @Test(timeout=10000)
    public void getApplicationContextReturnsNull() {
        assertThat(new DynamicDataSource().getApplicationContext(), is(nullValue()));
    }

    @Test(timeout=10000)
    public void setApplicationContext() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        ApplicationContext applicationContext = mock(ApplicationContext.class);
        dynamicDataSource.setApplicationContext(applicationContext);
        assertThat(dynamicDataSource.getApplicationContext(), sameInstance(applicationContext));
        assertThat(dynamicDataSource.getDataSource(), is(nullValue()));
    }
}
