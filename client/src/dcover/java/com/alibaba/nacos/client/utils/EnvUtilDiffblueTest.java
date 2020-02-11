package com.alibaba.nacos.client.utils;

import static org.junit.Assert.assertNull;
import org.junit.Test;

public class EnvUtilDiffblueTest {
  @Test(timeout=10000)
  public void getSelfLocationTagTest() {
    // Arrange, Act and Assert
    assertNull(EnvUtil.getSelfLocationTag());
  }

  @Test(timeout=10000)
  public void getSelfAmorayTagTest() {
    // Arrange, Act and Assert
    assertNull(EnvUtil.getSelfAmorayTag());
  }

  @Test(timeout=10000)
  public void getSelfVipserverTagTest() {
    // Arrange, Act and Assert
    assertNull(EnvUtil.getSelfVipserverTag());
  }
}

