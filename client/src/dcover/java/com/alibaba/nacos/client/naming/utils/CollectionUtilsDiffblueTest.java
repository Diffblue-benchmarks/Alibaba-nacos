package com.alibaba.nacos.client.naming.utils;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CollectionUtilsDiffblueTest {
  @Test(timeout=10000)
  public void isEmptyTest() {
    // Arrange, Act and Assert
    assertTrue(CollectionUtils.isEmpty(null));
  }
}

