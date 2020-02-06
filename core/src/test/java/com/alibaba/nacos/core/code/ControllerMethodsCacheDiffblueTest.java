package com.alibaba.nacos.core.code;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentMap;
import org.junit.Test;

public class ControllerMethodsCacheDiffblueTest {
  @Test
  public void constructorTest() {
    // Arrange, Act and Assert
    ConcurrentMap<String, Method> methods = (new ControllerMethodsCache()).getMethods();
    assertTrue(methods instanceof java.util.concurrent.ConcurrentHashMap);
    assertEquals(0, methods.size());
  }

  @Test
  public void getMethodTest() {
    // Arrange, Act and Assert
    assertNull((new ControllerMethodsCache()).getMethod("aaaaa", "aaaaa"));
  }

  @Test
  public void getMethodsTest() {
    // Arrange, Act and Assert
    assertEquals(0, (new ControllerMethodsCache()).getMethods().size());
  }
}

