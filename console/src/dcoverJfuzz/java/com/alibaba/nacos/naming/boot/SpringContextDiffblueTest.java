package com.alibaba.nacos.naming.boot;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class SpringContextDiffblueTest {
  @Test(timeout=10000)
  public void constructorTest() {
    // Arrange and Act
    new SpringContext();

    // Assert
    assertNull(SpringContext.context);
  }

  @Test(timeout=10000)
  public void getAppContextTest() {
    // Arrange, Act and Assert
    assertNull(SpringContext.getAppContext());
  }
}

