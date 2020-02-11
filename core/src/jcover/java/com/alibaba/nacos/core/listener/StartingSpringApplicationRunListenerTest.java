package com.alibaba.nacos.core.listener;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ResourceLoader;

/**
 * Unit tests for com.alibaba.nacos.core.listener.StartingSpringApplicationRunListener
 *
 * @author Diffblue JCover
 */

public class StartingSpringApplicationRunListenerTest {

    @Test(timeout=10000)
    public void contextLoaded() {
        Class<?>[] primarySources = new Class<?>[] { Object.class };
        String[] args = new String[] { "bar" };
        ConfigurableApplicationContext context = mock(ConfigurableApplicationContext.class);
        new StartingSpringApplicationRunListener(new org.springframework.boot.SpringApplication(primarySources), args).contextLoaded(context);
    }

    @Test(timeout=10000)
    public void contextPrepared() {
        Class<?>[] primarySources = new Class<?>[] { Object.class };
        String[] args = new String[] { "bar" };
        ConfigurableApplicationContext context = mock(ConfigurableApplicationContext.class);
        new StartingSpringApplicationRunListener(new org.springframework.boot.SpringApplication(primarySources), args).contextPrepared(context);
    }

    @Test(timeout=10000)
    public void environmentPrepared1() {
        Class<?>[] primarySources = new Class<?>[] { Object.class };
        String[] args = new String[] { "All" };
        ConfigurableEnvironment environment = mock(ConfigurableEnvironment.class);
        new StartingSpringApplicationRunListener(new org.springframework.boot.SpringApplication(primarySources), args).environmentPrepared(environment);
    }

    @Test(timeout=10000)
    public void environmentPrepared2() {
        ResourceLoader resourceLoader = mock(ResourceLoader.class);
        when(resourceLoader.getClassLoader())
            .thenReturn(null)
            .thenReturn(ClassLoader.getSystemClassLoader());
        Class<?>[] primarySources1 = new Class<?>[] { Object.class };
        String[] args = new String[] { "All" };
        ConfigurableEnvironment environment = mock(ConfigurableEnvironment.class);
        new StartingSpringApplicationRunListener(new org.springframework.boot.SpringApplication(resourceLoader, primarySources1), args).environmentPrepared(environment);
    }

    @Test(timeout=10000)
    public void failed() {
        Class<?>[] primarySources = new Class<?>[] { Object.class };
        String[] args = new String[] { "bar" };
        ConfigurableApplicationContext context = mock(ConfigurableApplicationContext.class);
        Throwable exception = new Exception();
        exception.setStackTrace(new StackTraceElement[] { });
        new StartingSpringApplicationRunListener(new org.springframework.boot.SpringApplication(primarySources), args).failed(context, exception);
    }

    @Test(timeout=10000)
    public void getOrderReturnsIntMin() {
        Class<?>[] primarySources = new Class<?>[] { Object.class };
        String[] args = new String[] { "bar" };
        assertThat(new StartingSpringApplicationRunListener(new SpringApplication(primarySources), args).getOrder(), is(-2_147_483_648));
    }

    @Test(timeout=10000)
    public void running() {
        Class<?>[] primarySources = new Class<?>[] { Object.class };
        String[] args = new String[] { "bar" };
        ConfigurableApplicationContext context = mock(ConfigurableApplicationContext.class);
        new StartingSpringApplicationRunListener(new SpringApplication(primarySources), args).running(context);
    }

    @Test(timeout=10000)
    public void started() {
        Class<?>[] primarySources = new Class<?>[] { Object.class };
        String[] args = new String[] { "bar" };
        ConfigurableApplicationContext context = mock(ConfigurableApplicationContext.class);
        new StartingSpringApplicationRunListener(new SpringApplication(primarySources), args).started(context);
    }

    @Test(timeout=10000)
    public void starting() {
        Class<?>[] primarySources = new Class<?>[] { Object.class };
        String[] args = new String[] { "bar" };
        new StartingSpringApplicationRunListener(new SpringApplication(primarySources), args).starting();
    }
}
