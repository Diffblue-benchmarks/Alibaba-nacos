package com.alibaba.nacos.naming.boot;

import static org.junit.Assert.assertNull;
import org.junit.Test;
import org.springframework.beans.BeansException;

public class SpringContextDiffblueTest {
  @Test
  public void setApplicationContextTest() throws BeansException {
    // Arrange and Act
    (new SpringContext()).setApplicationContext(null);

    // Assert
    assertNull(SpringContext.context);
  }

  @Test
  public void constructorTest() {
    // Arrange and Act
    new SpringContext();

    // Assert
    assertNull(SpringContext.context);
  }

  @Test
  public void getAppContextTest() {
    // Arrange, Act and Assert
    assertNull(SpringContext.getAppContext());
  }
}

