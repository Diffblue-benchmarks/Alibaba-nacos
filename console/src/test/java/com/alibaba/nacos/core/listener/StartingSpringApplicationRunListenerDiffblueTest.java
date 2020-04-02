package com.alibaba.nacos.core.listener;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;
import org.springframework.boot.web.reactive.context.StandardReactiveWebEnvironment;
import org.springframework.core.env.Environment;

public class StartingSpringApplicationRunListenerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    Class<?> forNameResult = Object.class;
    Class<?> forNameResult1 = Object.class;
    String[] stringArray = new String[]{"foo", "foo", "foo"};

    // Act
    new StartingSpringApplicationRunListener(new SpringApplication(forNameResult, forNameResult1, Object.class),
        stringArray);

    // Assert
    assertEquals(3, stringArray.length);
    assertArrayEquals(new String[]{"foo", "foo", "foo"}, stringArray);
  }

  @Test
  public void testContextLoaded() {
    // Arrange
    Class<?> forNameResult = Object.class;
    Class<?> forNameResult1 = Object.class;
    StartingSpringApplicationRunListener startingSpringApplicationRunListener = new StartingSpringApplicationRunListener(
        new SpringApplication(forNameResult, forNameResult1, Object.class), new String[]{"foo", "foo", "foo"});
    AnnotationConfigReactiveWebApplicationContext annotationConfigReactiveWebApplicationContext = new AnnotationConfigReactiveWebApplicationContext();

    // Act
    startingSpringApplicationRunListener.contextLoaded(annotationConfigReactiveWebApplicationContext);

    // Assert
    assertTrue(annotationConfigReactiveWebApplicationContext
        .getEnvironment() instanceof org.springframework.boot.web.reactive.context.StandardReactiveWebEnvironment);
  }

  @Test
  public void testContextPrepared() {
    // Arrange
    Class<?> forNameResult = Object.class;
    Class<?> forNameResult1 = Object.class;
    StartingSpringApplicationRunListener startingSpringApplicationRunListener = new StartingSpringApplicationRunListener(
        new SpringApplication(forNameResult, forNameResult1, Object.class), new String[]{"foo", "foo", "foo"});
    AnnotationConfigReactiveWebApplicationContext annotationConfigReactiveWebApplicationContext = new AnnotationConfigReactiveWebApplicationContext();

    // Act
    startingSpringApplicationRunListener.contextPrepared(annotationConfigReactiveWebApplicationContext);

    // Assert
    Environment environment = annotationConfigReactiveWebApplicationContext.getEnvironment();
    assertTrue(environment instanceof StandardReactiveWebEnvironment);
    assertTrue(((StandardReactiveWebEnvironment) environment)
        .getConversionService() instanceof org.springframework.core.convert.support.DefaultConversionService);
    assertEquals(0, environment.getActiveProfiles().length);
    assertEquals(1, environment.getDefaultProfiles().length);
  }

  @Test
  public void testEnvironmentPrepared() {
    // Arrange
    Class<?> forNameResult = Object.class;
    Class<?> forNameResult1 = Object.class;
    StartingSpringApplicationRunListener startingSpringApplicationRunListener = new StartingSpringApplicationRunListener(
        new SpringApplication(forNameResult, forNameResult1, Object.class), new String[]{"foo", "foo", "foo"});
    StandardReactiveWebEnvironment standardReactiveWebEnvironment = new StandardReactiveWebEnvironment();

    // Act
    startingSpringApplicationRunListener.environmentPrepared(standardReactiveWebEnvironment);

    // Assert
    assertEquals(1, standardReactiveWebEnvironment.getDefaultProfiles().length);
  }

  @Test
  public void testFailed() {
    // Arrange
    Class<?> forNameResult = Object.class;
    Class<?> forNameResult1 = Object.class;
    StartingSpringApplicationRunListener startingSpringApplicationRunListener = new StartingSpringApplicationRunListener(
        new SpringApplication(forNameResult, forNameResult1, Object.class), new String[]{"foo", "foo", "foo"});
    AnnotationConfigReactiveWebApplicationContext annotationConfigReactiveWebApplicationContext = new AnnotationConfigReactiveWebApplicationContext();

    // Act
    startingSpringApplicationRunListener.failed(annotationConfigReactiveWebApplicationContext, new Throwable());

    // Assert
    assertTrue(((StandardReactiveWebEnvironment) annotationConfigReactiveWebApplicationContext.getEnvironment())
        .getConversionService() instanceof org.springframework.core.convert.support.DefaultConversionService);
  }

  @Test
  public void testGetOrder() {
    // Arrange
    Class<?> forNameResult = Object.class;
    Class<?> forNameResult1 = Object.class;

    // Act and Assert
    assertEquals(-2147483648,
        (new StartingSpringApplicationRunListener(new SpringApplication(forNameResult, forNameResult1, Object.class),
            new String[]{"foo", "foo", "foo"})).getOrder());
  }

  @Test
  public void testRunning() {
    // Arrange
    Class<?> forNameResult = Object.class;
    Class<?> forNameResult1 = Object.class;
    StartingSpringApplicationRunListener startingSpringApplicationRunListener = new StartingSpringApplicationRunListener(
        new SpringApplication(forNameResult, forNameResult1, Object.class), new String[]{"foo", "foo", "foo"});
    AnnotationConfigReactiveWebApplicationContext annotationConfigReactiveWebApplicationContext = new AnnotationConfigReactiveWebApplicationContext();

    // Act
    startingSpringApplicationRunListener.running(annotationConfigReactiveWebApplicationContext);

    // Assert
    assertFalse(annotationConfigReactiveWebApplicationContext.isActive());
  }

  @Test
  public void testStarted() {
    // Arrange
    Class<?> forNameResult = Object.class;
    Class<?> forNameResult1 = Object.class;
    StartingSpringApplicationRunListener startingSpringApplicationRunListener = new StartingSpringApplicationRunListener(
        new SpringApplication(forNameResult, forNameResult1, Object.class), new String[]{"foo", "foo", "foo"});
    AnnotationConfigReactiveWebApplicationContext annotationConfigReactiveWebApplicationContext = new AnnotationConfigReactiveWebApplicationContext();

    // Act
    startingSpringApplicationRunListener.started(annotationConfigReactiveWebApplicationContext);

    // Assert
    Environment environment = annotationConfigReactiveWebApplicationContext.getEnvironment();
    assertTrue(((StandardReactiveWebEnvironment) environment)
        .getConversionService() instanceof org.springframework.core.convert.support.DefaultConversionService);
    assertEquals(0, environment.getActiveProfiles().length);
    assertEquals(1, environment.getDefaultProfiles().length);
  }
}

