package com.alibaba.nacos.naming.boot;

import static org.junit.Assert.assertSame;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebApplicationContext;

@RunWith(org.springframework.test.context.junit4.SpringRunner.class)
@SpringBootTest
public class SpringContextDiffblueTest {
  @Autowired
  private SpringContext springContext;
  @Test
  public void testSetApplicationContext() throws BeansException {
    // Arrange
    AnnotationConfigReactiveWebApplicationContext annotationConfigReactiveWebApplicationContext = new AnnotationConfigReactiveWebApplicationContext();

    // Act
    this.springContext.setApplicationContext(annotationConfigReactiveWebApplicationContext);

    // Assert
    assertSame(annotationConfigReactiveWebApplicationContext, SpringContext.context);
  }
}

