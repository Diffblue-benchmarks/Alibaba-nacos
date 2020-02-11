package com.alibaba.nacos.naming.healthcheck.extend;

import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;

/**
 * Unit tests for com.alibaba.nacos.naming.healthcheck.extend.HealthCheckExtendProvider
 *
 * @author Diffblue JCover
 */

public class HealthCheckExtendProviderTest {

    @Test(timeout=10000)
    public void init() {
        new HealthCheckExtendProvider().init();
    }

    @Test(timeout=10000)
    public void setBeanFactory() throws org.springframework.beans.BeansException {
        BeanFactory beanFactory = mock(BeanFactory.class);
        new HealthCheckExtendProvider().setBeanFactory(beanFactory);
    }
}
