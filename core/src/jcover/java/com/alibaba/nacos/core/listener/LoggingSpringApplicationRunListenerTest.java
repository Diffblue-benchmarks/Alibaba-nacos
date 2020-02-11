package com.alibaba.nacos.core.listener;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Unit tests for com.alibaba.nacos.core.listener.LoggingSpringApplicationRunListener
 *
 * @author Diffblue JCover
 */

public class LoggingSpringApplicationRunListenerTest {

    @Test(timeout=10000)
    public void contextLoaded() {
        Class<?>[] primarySources = new Class<?>[] { Object.class };
        String[] args = new String[] { "bar" };
        ConfigurableApplicationContext context = mock(ConfigurableApplicationContext.class);
        new LoggingSpringApplicationRunListener(new org.springframework.boot.SpringApplication(primarySources), args).contextLoaded(context);
    }

    @Test(timeout=10000)
    public void contextPrepared() {
        Class<?>[] primarySources = new Class<?>[] { Object.class };
        String[] args = new String[] { "bar" };
        ConfigurableApplicationContext context = mock(ConfigurableApplicationContext.class);
        new LoggingSpringApplicationRunListener(new org.springframework.boot.SpringApplication(primarySources), args).contextPrepared(context);
    }

    @Test(timeout=10000)
    public void environmentPrepared() {
        Class<?>[] primarySources = new Class<?>[] { Object.class };
        String[] args = new String[] { "bar" };
        ConfigurableEnvironment environment = mock(ConfigurableEnvironment.class);
        new LoggingSpringApplicationRunListener(new org.springframework.boot.SpringApplication(primarySources), args).environmentPrepared(environment);
    }

    @Test(timeout=10000)
    public void failed() {
        Class<?>[] primarySources = new Class<?>[] { Object.class };
        String[] args = new String[] { "bar" };
        ConfigurableApplicationContext context = mock(ConfigurableApplicationContext.class);
        Throwable exception = new Exception();
        exception.setStackTrace(new StackTraceElement[] { });
        new LoggingSpringApplicationRunListener(new org.springframework.boot.SpringApplication(primarySources), args).failed(context, exception);
    }

    @Test(timeout=10000)
    public void getOrderReturnsIntMin() {
        Class<?>[] primarySources = new Class<?>[] { Object.class };
        String[] args = new String[] { "bar" };
        assertThat(new LoggingSpringApplicationRunListener(new SpringApplication(primarySources), args).getOrder(), is(-2_147_483_648));
    }

    @Test(timeout=10000)
    public void running() {
        Class<?>[] primarySources = new Class<?>[] { Object.class };
        String[] args = new String[] { "bar" };
        ConfigurableApplicationContext context = mock(ConfigurableApplicationContext.class);
        new LoggingSpringApplicationRunListener(new SpringApplication(primarySources), args).running(context);
    }

    @Test(timeout=10000)
    public void started() {
        Class<?>[] primarySources = new Class<?>[] { Object.class };
        String[] args = new String[] { "bar" };
        ConfigurableApplicationContext context = mock(ConfigurableApplicationContext.class);
        new LoggingSpringApplicationRunListener(new SpringApplication(primarySources), args).started(context);
    }

    @Test(timeout=10000)
    public void starting() {
        Class<?>[] primarySources = new Class<?>[] { Object.class };
        String[] args = new String[] { "bar" };
        new LoggingSpringApplicationRunListener(new SpringApplication(primarySources), args).starting();
    }
}
