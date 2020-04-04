package com.alibaba.nacos.core.listener;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.springframework.boot.SpringApplication;

public class LoggingSpringApplicationRunListenerDiffblueTest {
  @Test
  public void testConstructor() {
    // Arrange
    Class<?> forNameResult = Object.class;
    Class<?> forNameResult1 = Object.class;
    String[] stringArray = new String[]{"foo", "foo", "foo"};

    // Act
    new LoggingSpringApplicationRunListener(new SpringApplication(forNameResult, forNameResult1, Object.class),
        stringArray);

    // Assert
    assertEquals(3, stringArray.length);
    assertArrayEquals(new String[]{"foo", "foo", "foo"}, stringArray);
  }

  @Test
  public void testGetOrder() {
    // Arrange
    Class<?> forNameResult = Object.class;
    Class<?> forNameResult1 = Object.class;

    // Act and Assert
    assertEquals(-2147483648,
        (new LoggingSpringApplicationRunListener(new SpringApplication(forNameResult, forNameResult1, Object.class),
            new String[]{"foo", "foo", "foo"})).getOrder());
  }
}

