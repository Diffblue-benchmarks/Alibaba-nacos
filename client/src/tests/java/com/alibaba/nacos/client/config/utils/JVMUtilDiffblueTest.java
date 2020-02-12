package com.alibaba.nacos.client.config.utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JVMUtilDiffblueTest {
  @Test(timeout=10000)
  public void isMultiInstanceTest() {
    // Arrange, Act and Assert
    assertEquals(Boolean.valueOf(false), JVMUtil.isMultiInstance());
  }
}

