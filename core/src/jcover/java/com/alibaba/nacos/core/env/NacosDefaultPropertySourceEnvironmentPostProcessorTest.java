package com.alibaba.nacos.core.env;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ResourceLoader;

/**
 * Unit tests for com.alibaba.nacos.core.env.NacosDefaultPropertySourceEnvironmentPostProcessor
 *
 * @author Diffblue JCover
 */

public class NacosDefaultPropertySourceEnvironmentPostProcessorTest {

    @Test(timeout=10000)
    public void getOrderReturnsIntMax() {
        assertThat(new NacosDefaultPropertySourceEnvironmentPostProcessor().getOrder(), is(2_147_483_647));
    }

    @Test(timeout=10000)
    public void postProcessEnvironment1() {
        ConfigurableEnvironment environment = mock(ConfigurableEnvironment.class);
        when(environment.getPropertySources())
            .thenReturn(new org.springframework.core.env.MutablePropertySources());
        Class<?>[] primarySources = new Class<?>[] { Object.class };
        new NacosDefaultPropertySourceEnvironmentPostProcessor().postProcessEnvironment(environment, new SpringApplication(primarySources));
    }

    @Test(timeout=10000)
    public void postProcessEnvironment2() {
        ConfigurableEnvironment environment = mock(ConfigurableEnvironment.class);
        when(environment.getPropertySources())
            .thenReturn(new org.springframework.core.env.MutablePropertySources());
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        ResourceLoader resourceLoader = mock(ResourceLoader.class);
        when(resourceLoader.getClassLoader())
            .thenReturn(classLoader)
            .thenReturn(ClassLoader.getSystemClassLoader())
            .thenReturn(null)
            .thenReturn(ClassLoader.getSystemClassLoader())
            .thenReturn(ClassLoader.getSystemClassLoader());
        Class<?>[] primarySources1 = new Class<?>[] { Object.class };
        SpringApplication application = new SpringApplication(resourceLoader, primarySources1);
        new NacosDefaultPropertySourceEnvironmentPostProcessor().postProcessEnvironment(environment, application);
        assertThat(application.getClassLoader(), sameInstance(classLoader));
    }
}
