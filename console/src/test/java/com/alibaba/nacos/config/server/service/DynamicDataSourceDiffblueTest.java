package com.alibaba.nacos.config.server.service;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import org.junit.Test;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;

public class DynamicDataSourceDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange, Act and Assert
    assertNull((new DynamicDataSource()).getApplicationContext());
  }

  @Test
  public void testSetApplicationContext() {
    // Arrange
    DynamicDataSource dynamicDataSource = new DynamicDataSource();
    AnnotationConfigReactiveWebApplicationContext annotationConfigReactiveWebApplicationContext = new AnnotationConfigReactiveWebApplicationContext();

    // Act
    dynamicDataSource.setApplicationContext(annotationConfigReactiveWebApplicationContext);

    // Assert
    assertSame(annotationConfigReactiveWebApplicationContext, dynamicDataSource.getApplicationContext());
  }
}

